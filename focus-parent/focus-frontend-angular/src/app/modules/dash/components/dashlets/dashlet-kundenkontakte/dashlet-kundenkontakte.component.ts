import {
    AfterViewInit,
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    EventEmitter,
    Injectable,
    Input,
    OnChanges,
    OnInit,
    Output,
    SimpleChanges,
    ViewChild,
} from "@angular/core";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import { MatPaginator, MatPaginatorModule } from "@angular/material/paginator";
import { MatSort, MatSortModule } from "@angular/material/sort";
import { MatTableDataSource, MatTableModule } from "@angular/material/table";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { RollenConstant } from "../../../../shared/constants/rollen.constant";
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { Kunde } from "../../../../shared/models/kunde.model";
import { KontaktFormParameter } from "../../../../shared/models/kundenkontakt/kontakt-form-parameter.model";
import { KontaktForm } from "../../../../shared/models/kundenkontakt/kontakt-form.model";
import { KontaktKurz } from "../../../../shared/models/kundenkontaktNeu/kontaktKurz.model";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../../shared/services/backend/user/user.service";
import { DialogService } from "../../../../shared/services/frontend/dialog/dialog.service";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";
import { KundenkontaktFormComponent } from "../../sidebar/form-content/kundenkontakt-form/kundenkontakt-form.component";

@Component({
    selector: "f360-dashlet-kundenkontakte",
    templateUrl: "./dashlet-kundenkontakte.component.html",
    styleUrls: ["./dashlet-kundenkontakte.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        DashletErrorComponent,
        MatTableModule,
        MatSortModule,
        MatFormFieldModule,
        MatInputModule,
        MatPaginatorModule,
    ],
})
@Injectable({
    providedIn: "root",
})
export class DashletKundenkontakteComponent
    implements OnInit, OnChanges, AfterViewInit
{
    columnNames: String[] = [
        "zeitpunktDatumString",
        "zeitpunktStartString",
        "zeitpunktEndeString",
        "thema",
        "kontaktart",
        "abschlussart",
        "scBezeichnung",
    ];
    dataSource: MatTableDataSource<KontaktKurz> =
        new MatTableDataSource<KontaktKurz>();
    @Input() error: ErrorMeldung;
    @Input() kundenkontakte: KontaktKurz[];
    @Output() openKontaktFormEvent: EventEmitter<KontaktFormParameter> =
        new EventEmitter();
    rollen = RollenConstant;
    @ViewChild(MatSort) sort: MatSort;
    protected readonly Date = Date;
    private opening: boolean = false;

    constructor(
        private cdr: ChangeDetectorRef,
        private sucheService: SucheService,
        public userService: UserService,
        private kundenkontaktForm: KundenkontaktFormComponent,
    ) {}

    @ViewChild("kundenkontaktPaginator") set paginator(v: MatPaginator) {
        this.dataSource.paginator = v;
    }

    applyFilter(event: Event) {
        const filterValue = (event.target as HTMLInputElement).value;
        this.dataSource.filter = filterValue.trim().toLowerCase();
    }

    ngAfterViewInit() {
        this.dataSource.sortingDataAccessor = (item, property) => {
            switch (property) {
                case "zeitpunktDatumString":
                    console.log("Datum sort");
                    console.log(Date.parse(item.zeitpunktDatumString));
                    return Date.parse(item.zeitpunktDatumString);
                default:
                    return item[property];
            }
        };
    }

    ngOnChanges(changes: SimpleChanges) {
        if (
            this.dataSource.data &&
            this.kundenkontakte?.length > 0 &&
            this.kundenkontakte
        ) {
            this.dataSource.data = this.kundenkontakte;
            this.dataSource.sort = this.sort;
            this.dataSource.sortingDataAccessor = (item, property) => {
                switch (property) {
                    case "zeitpunktDatumString":
                        return item.zeitpunktDatum;
                    default:
                        return item[property];
                }
            };
        }
    }

    ngOnInit(): void {
        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_KONT_VERW,
            )
        ) {
            let kunde = this.sucheService._readKundeFromCache(
                this.sucheService.versicherter.getValue().fs.fachschluessel,
            );
            this.dataSource.data = this.kundenkontakte;
            if (this.userService.userInfo.offeneKontakte.length != 0) {
                this.openExistingKontakt(
                    parseInt(
                        this.userService.userInfo.offeneKontakte[0].split(
                            ";",
                        )[1],
                    ),
                );
                DialogService.dashletKundenkontaktComponent = this;
            } else {
                if (kunde && kunde.openedKontakt) {
                    return;
                }
                this.openNewKontakt(false);
                DialogService.dashletKundenkontaktComponent = this;
            }
            this.repushKunde(kunde);
        }
    }

    openExistingKontakt(id: number) {
        this.openKontaktFormEvent.emit(new KontaktFormParameter(id, true));
        this.cdr.detectChanges();
    }

    openNewKontakt(openForm: boolean) {
        if (this.sucheService.versicherter.getValue().stammdaten?.storniert) {
            this.kundenkontaktForm.alertService.warning(
                "Hinweis: Für stornierte Personen können keine Kundenkontakte angelegt werden!",
            );
            return;
        }
        if (this.opening) {
            return;
        }
        this.opening = true;
        this.sucheService
            .loadOffeneKontakteForFs(
                this.sucheService.versicherter.getValue().fs.fachschluessel,
                this.sucheService.versicherter.getValue().fs.fachschluesselArt,
            )
            .subscribe((value) => {
                if (KontaktForm.registeredSVNR == null && !value) {
                    this.kundenkontaktForm.alertService.warning(
                        "Es ist bereits ein Kontakt in Arbeit! Kontakte werden neu geladen...",
                    );
                    this.kundenkontaktForm.reloadKontakteList();
                } else {
                    KontaktForm.unfinishedKontaktOffen = true;
                    if (KontaktForm.registeredSVNR == null) {
                        this.kundenkontaktForm.kontaktSavedSubscription =
                            this.kundenkontaktForm.saveKontaktShell().subscribe(
                                (data) => {
                                    this.kundenkontaktForm.kontaktForm =
                                        this.kundenkontaktForm.forms.kontaktForm;
                                    this.kundenkontaktForm.kontaktForm.loadKontakt(
                                        this.kundenkontaktForm.sucheService.selectCurrentFs(),
                                        this.kundenkontaktForm.sucheService.selectCurrentFsArt(),
                                        this.kundenkontaktForm.kontaktService.loadKontakt(
                                            data.protokollEintraege[0]
                                                .zusatzinfo.zusatz30[0].value,
                                            this.kundenkontaktForm.sucheService.selectCurrentFs(),
                                            this.kundenkontaktForm.sucheService.selectCurrentFsArt(),
                                            this.kundenkontaktForm.sucheService.selectCurrentPID(),
                                        ),
                                        data.protokollEintraege[0].zusatzinfo
                                            .zusatz30[0].value,
                                    );
                                    this.kundenkontaktForm.sucheService.getKundenkontaktListe(
                                        this.kundenkontaktForm.kontaktForm.fs,
                                        this.kundenkontaktForm.kontaktForm
                                            .fsArt,
                                        this.kundenkontaktForm.sucheService.selectCurrentPID(),
                                    );
                                    this.kundenkontaktForm.alertService.success(
                                        "Hülle angelegt.",
                                    );
                                    this.openKontaktFormEvent.emit(
                                        new KontaktFormParameter(
                                            data.protokollEintraege[0].zusatzinfo.zusatz30[0].value,
                                            openForm,
                                        ),
                                    );
                                    this.kundenkontaktForm.kontaktForm.bearbeitungsmodus =
                                        true;
                                    KontaktForm.register(
                                        data.protokollEintraege[0].zusatzinfo
                                            .zusatz30[0].value,
                                    );
                                    this.cdr.detectChanges();
                                },
                                (error1) => {
                                    this.kundenkontaktForm.alertService.error(
                                        error1.message,
                                    );
                                },
                            );
                    } else {
                        this.kundenkontaktForm.alertService.warning(
                            "Es ist bereits ein Kontakt in Arbeit! Beenden Sie bitte zuerst den aktuellen Kontakt oder brechen Sie diesen ab.",
                        );
                        this.openExistingKontakt(KontaktForm.registeredSVNR);
                    }
                }
                this.opening = false;
            });
    }

    repushKunde(kunde: Kunde) {
        this.sucheService.removeKundeFromCache(kunde.fs.fachschluessel);
        kunde.openedKontakt = true;
        this.sucheService.addKundeToCache(kunde);
    }
}
