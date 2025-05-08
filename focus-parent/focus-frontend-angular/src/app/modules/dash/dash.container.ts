import { AsyncPipe, NgClass } from "@angular/common";
import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    EventEmitter,
    Injectable,
    OnDestroy,
    OnInit,
    Output,
} from "@angular/core";
import { MatDialog } from "@angular/material/dialog";
import { ActivatedRoute, Router } from "@angular/router";
import { Observable, Subscription } from "rxjs";
import { LoadingIndicatorComponent } from "../shared/components/loading-indicator/loading-indicator.component";
import { RollenConstant } from "../shared/constants/rollen.constant";
import { ROUTE_HOME } from "../shared/constants/routes.constant";
import { Dienstgeber } from "../shared/models/dienstgeber/dienstgeber.model";
import { FeedbackKurz } from "../shared/models/feedback/feedback-kurz.model";
import { Forms } from "../shared/models/forms.model";
import { Kunde } from "../shared/models/kunde.model";
import { KontaktFormParameter } from "../shared/models/kundenkontakt/kontakt-form-parameter.model";
import { SubaufgabengebietKontaktForm } from "../shared/models/kundenkontakt/subaufgabengebiet-kontakt.model";
import { Notiz } from "../shared/models/notiz.model";
import { NotizDTO } from "../shared/models/NotizDTO.model";
import { Person } from "../shared/models/Person.model";
import { ReleasenotesCollectionModel } from "../shared/models/releasenotes/ReleasenotesCollection.model";
import { NotizSpeichernService } from "../shared/services/backend/notiz/notiz-speichern.service";
import { SucheService } from "../shared/services/backend/suche/suche.service";
import { UserService } from "../shared/services/backend/user/user.service";
import { AlertService } from "../shared/services/frontend/alert/alert.service";
import { FormActivationService } from "../shared/services/frontend/event-transmitter/open-editor-event.service";
import { SaveNotizTransmitter } from "../shared/services/frontend/event-transmitter/save-notiz-transmitter.service";
import { ReleasenoteService } from "../shared/services/frontend/releasenotes/releasenote.service";
import { DashletAngehoerigeComponent } from "./components/dashlets/dashlet-angehoerige/dashlet-angehoerige.component";
import { DashletBeschwerdenComponent } from "./components/dashlets/dashlet-beschwerden/dashlet-beschwerden.component";
import { DashletDokumenteComponent } from "./components/dashlets/dashlet-dokumente/dashlet-dokumente.component";
import { DashletDsgvoComponent } from "./components/dashlets/dashlet-dsgvo/dashlet-dsgvo.component";
import { DashletEcardComponent } from "./components/dashlets/dashlet-ecard/dashlet-ecard.component";
import { DashletKundenkontakteComponent } from "./components/dashlets/dashlet-kundenkontakte/dashlet-kundenkontakte.component";
import { DashletLeistungComponent } from "./components/dashlets/dashlet-leistung/dashlet-leistung.component";
import { DashletStammdatenComponent } from "./components/dashlets/dashlet-stammdaten/dashlet-stammdaten.component";
import { DashletVersicherungszeitenComponent } from "./components/dashlets/dashlet-versicherungszeiten/dashlet-versicherungszeiten.component";
import { DienstgeberStammdatenComponent } from "./components/dashlets/dienstgeber/dienstgeber-stammdaten/dienstgeber-stammdaten.component";
import { ReleasenotesDialogComponent } from "./components/releasenotes/releasenotes-dialog.component";
import { FormContentComponent } from "./components/sidebar/form-content/form-content.component";
import { SubaufgabengebietFormComponent } from "./components/sidebar/form-content/subaufgabengebiet-form/subaufgabengebiet-form.component";
import { SidebarComponent } from "./components/sidebar/sidebar.component";

@Component({
    selector: "f360-dash",
    templateUrl: "./dash.container.html",
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [
        FormContentComponent,
        LoadingIndicatorComponent,
        NgClass,
        DashletStammdatenComponent,
        DashletVersicherungszeitenComponent,
        DashletAngehoerigeComponent,
        DashletEcardComponent,
        DashletLeistungComponent,
        DashletDokumenteComponent,
        DashletKundenkontakteComponent,
        DashletBeschwerdenComponent,
        DashletDsgvoComponent,
        SidebarComponent,
        DienstgeberStammdatenComponent,
        AsyncPipe,
    ],
})
@Injectable({
    providedIn: "root",
})
export class DashContainer implements OnInit, OnDestroy {
    $kunde: Observable<Kunde>;
    $notizServiceResponse: Observable<any>;
    $versicherter: Observable<Person>;
    currentDienstgeber: Dienstgeber;
    currentVersicherter: Person;
    @Output() editClicked: EventEmitter<string> = new EventEmitter<string>();
    n: Subscription;
    @Output() openKontaktFormEvent: EventEmitter<KontaktFormParameter> =
        new EventEmitter();
    //constants
    rollen = RollenConstant;
    showPatch = false;

    constructor(
        private router: Router,
        private sucheService: SucheService,
        private openEditorService: FormActivationService,
        private saveNotizTransmitter: SaveNotizTransmitter,
        private saveNotizService: NotizSpeichernService,
        private alertService: AlertService,
        private changeDetectorRef: ChangeDetectorRef,
        private actRoute: ActivatedRoute,
        private cd: ChangeDetectorRef,
        public userService: UserService,
        public subaufgabengebietForm: SubaufgabengebietFormComponent,
        private releasenoteService: ReleasenoteService,
        public dialog: MatDialog,
    ) {
        this._selectVersicherter();
        this._selectKunde();

        this.n = openEditorService.formActivated.subscribe((formType) => {
            if (formType === Forms.TYPES.NOTIZ) {
                this.currentVersicherter.forms.notizForm.active = true;
                this.currentVersicherter.forms.notizForm.notizText =
                    this.currentVersicherter.notiz.text;
                this.currentVersicherter.forms.toggleForm(Forms.TYPES.NOTIZ);
                this.changeDetectorRef.detectChanges();
            }
        });

        this.$notizServiceResponse = this.saveNotizService.response;
        this.$notizServiceResponse.subscribe((metainformation) => {
            if (metainformation == null) {
                return;
            }

            if (metainformation.status === "OK") {
                this.currentVersicherter.notiz = new Notiz(
                    this.currentVersicherter.forms.notizForm.notizText,
                    this.currentVersicherter.notiz.updateCount + 1,
                );
                this.alertService.success("Notiz wurde gespeichert!");
                this.cancelForm(Forms.TYPES.NOTIZ);
            } else {
                this.alertService.error(
                    metainformation.meldungen[0].meldungstext,
                );
            }
        });

        saveNotizTransmitter.transmitter.subscribe(() => {
            let notiz = new NotizDTO(
                this.currentVersicherter.fs,
                this.currentVersicherter.forms.notizForm.notizText,
                this.currentVersicherter.notiz.updateCount,
            );
            saveNotizService.saveNotiz(notiz, this.currentVersicherter);
        });
    }

    anyFormActive() {
        if (!this.currentVersicherter && !this.currentDienstgeber) {
            return;
        }

        if (this.currentVersicherter) {
            return this.currentVersicherter.forms.anyFormActive();
        }
        if (this.currentDienstgeber) {
            return this.currentDienstgeber.forms.anyFormActive();
        }
    }

    anyFormOpen() {
        if (!this.currentVersicherter && !this.currentDienstgeber) {
            return;
        }

        if (this.currentVersicherter) {
            return this.currentVersicherter.forms.currentOpenForm != null;
        }
        if (this.currentDienstgeber) {
            return this.currentDienstgeber.forms.currentOpenForm != null;
        }
    }

    cancelForm(formType: string) {
        if (
            this.currentVersicherter !== null &&
            this.currentVersicherter.forms !== null
        ) {
            this.currentVersicherter.forms.cancelForm(formType);
        }
        if (
            this.currentDienstgeber !== null &&
            this.currentDienstgeber.forms !== null
        ) {
            this.currentDienstgeber.forms.cancelForm(formType);
        }
        this.changeDetectorRef.detectChanges();
    }

    public checkDisplayReleasenotes(
        releasenotes: ReleasenotesCollectionModel,
    ): boolean {
        return (
            releasenotes.releasenotes.find(
                (value) =>
                    value.releaseDate >= this.releasenoteService.getLastLogin(),
            ) !== undefined
        );
    }

    ngOnDestroy(): void {
        if (this.n != null) {
            this.n.unsubscribe();
        }
    }

    ngOnInit(): void {
        if (
            this.userService.selectedOrganisationseinheit == null ||
            this.userService.selectedOrganisationseinheit ===
                "Bitte wählen Sie ein Kundenservice"
        ) {
            this.router.navigate([ROUTE_HOME]);
        }
        this.userService.readUserInfoObservable().subscribe(() => {
            this.releasenoteService.readReleasenotesCSV().subscribe((value) => {
                if (this.checkDisplayReleasenotes(value)) {
                    this.dialog
                        .open(ReleasenotesDialogComponent, {
                            data: value,
                            width: "30%",
                        })
                        .afterClosed()
                        .subscribe(() =>
                            this.releasenoteService.setLastLoginNow(),
                        );
                }
            });
        });

        const currParams = this.actRoute.snapshot.queryParamMap;
        if (currParams.has("fs") && currParams.has("fsArt")) {
            this.sucheService.readKunde(
                currParams.get("fs"),
                currParams.get("fsArt"),
            );
        }

        if (
            this.userService.aufgabengebiete == null ||
            this.userService.aufgabengebiete.length === 0
        ) {
            this.userService.fillAufgabengebiete();
        }

        if (
            this.userService.userInfo != null &&
            this.userService.userInfo.offeneKontakte.length != 0
        ) {
            if (
                this.userService.userInfo.offeneKontakte[0].split(";", 1)[0] ==
                    "null" &&
                this.userService.userInfo.offeneKontakte[0].split(";", 3)[2] ===
                    this.userService.selectedAufgabengebiet
            ) {
                this.subaufgabengebietForm.subaufgabengebietKontaktForm =
                    this.subaufgabengebietForm.forms.subaufgabengebietKontaktForm;
                this.subaufgabengebietForm.kontaktService
                    .loadKontaktOhneFS(
                        +this.userService.userInfo.offeneKontakte[0].split(
                            ";",
                            2,
                        )[1],
                    )
                    .subscribe((subaufgg) => {
                        SubaufgabengebietKontaktForm.register(
                            +this.userService.userInfo.offeneKontakte[0].split(
                                ";",
                                2,
                            )[1],
                        );
                        this.subaufgabengebietForm.kontaktService
                            .loadAufgabengebiete()
                            .subscribe((aufgg) => {
                                this.userService.selectedSubAufgabengebiet =
                                    aufgg.find(
                                        (g) =>
                                            g.aufgabengebietId ==
                                            subaufgg.subAufgabengebietId,
                                    ).aufgabengebietBezeichnung;
                            });
                    });
                this.subaufgabengebietForm.forms.openSubaufgabengebietKontaktForm(
                    +this.userService.userInfo.offeneKontakte[0].split(
                        ";",
                        2,
                    )[1],
                    true,
                );
            }
        }
    }

    openBeschwerdeForm(feedback: FeedbackKurz) {
        this.currentVersicherter.forms.openBeschwerdeForm(
            this.currentVersicherter.fs.fachschluessel,
            this.currentVersicherter.isBTNR(),
            this.currentVersicherter.stammdaten.pid,
            feedback.id,
        );
        this.changeDetectorRef.detectChanges();
    }

    openDokumentForm(id: number) {
        console.log(id);
    }

    openKundenkontaktForm(parameter: KontaktFormParameter) {
        this.currentVersicherter.forms.openKontaktForm(
            this.currentVersicherter.fs.fachschluessel,
            this.currentVersicherter.isBTNR() ? "BTNR" : "VSNR",
            this.currentVersicherter.stammdaten.pid,
            parameter.id,
            parameter.openForm,
        );
        this.changeDetectorRef.detectChanges();
    }

    openKundenkontaktFormForDG(parameter: KontaktFormParameter) {
        this.currentDienstgeber.forms.openKontaktForm(
            this.currentDienstgeber.fs.fachschluessel,
            "DGNR",
            this.currentDienstgeber.stammdaten.pid,
            parameter.id,
            parameter.openForm,
        );
        this.changeDetectorRef.detectChanges();
    }

    private _selectKunde() {
        this.$kunde = this.sucheService.selectKunde();
        this.$kunde.subscribe((k) => {
            this.currentDienstgeber = null;
            this.currentVersicherter = null;

            if (k instanceof Dienstgeber && k.stammdaten) {
                this.currentDienstgeber = k;
            } else if (k instanceof Person && k.stammdaten) {
                this.currentVersicherter = k;
            }
        });
    }

    private _selectVersicherter() {
        this.$versicherter = this.sucheService.selectVersicherter();
        this.$versicherter.subscribe((p) => {
            this.currentVersicherter = p;
        });
    }
}
