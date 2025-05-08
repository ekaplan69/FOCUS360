import { formatDate } from "@angular/common";
import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    EventEmitter,
    Injectable,
    Input,
    OnChanges,
    OnInit,
    Output,
    ViewChild,
} from "@angular/core";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import { MatPaginator, MatPaginatorModule } from "@angular/material/paginator";
import { MatSort, MatSortModule } from "@angular/material/sort";
import { MatTableDataSource, MatTableModule } from "@angular/material/table";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { RollenConstant } from "../../../../shared/constants/rollen.constant";
import { DokumentKurz } from "../../../../shared/models/dokumente/dokumentKurz.model";
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../../shared/services/backend/user/user.service";
import { AlertService } from "../../../../shared/services/frontend/alert/alert.service";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

@Component({
    selector: "f360-dashlet-dokumente",
    templateUrl: "./dashlet-dokumente.component.html",
    styleUrls: ["./dashlet-dokumente.component.scss"],
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
export class DashletDokumenteComponent implements OnChanges, OnInit {
    bisFilterInput: string;
    columnNames: string[] = [
        "datumString",
        "art",
        "klasse",
        "kategorie",
        "type",
        "thema",
    ];
    dataSource: MatTableDataSource<DokumentKurz> =
        new MatTableDataSource<DokumentKurz>();
    @Input() dokumente: DokumentKurz[];
    @Input() error: ErrorMeldung;
    filterInput: string;
    @Output() openDokumentFormEvent: EventEmitter<number> = new EventEmitter();
    rollen = RollenConstant;
    vonFilterInput: string;
    private bisDate = new Date(8640000000000000);
    private currentFilterValue = " ";
    private vonDate = new Date(-8640000000000000);

    constructor(
        private cdr: ChangeDetectorRef,
        private as: AlertService,
        private sucheService: SucheService,
        public userService: UserService,
    ) {}

    @ViewChild(MatPaginator) set paginator(v: MatPaginator) {
        this.dataSource.paginator = v;
    }

    @ViewChild(MatSort) set sort(v: MatSort) {
        this.dataSource.sort = v;
        this.dataSource.sortingDataAccessor = (item, property) => {
            switch (property) {
                case "datumString":
                    return item.datum;
                default:
                    return item[property];
            }
        };
    }

    applyBisFilter(filterValue: string) {
        if (filterValue != null && filterValue.trim().length != 0) {
            let filterDate = this.formatStringToDate(filterValue);

            if (filterDate) {
                this.bisDate = filterDate;
                this.dataSource.filter = this.currentFilterValue;
                return;
            }
        }

        this.bisDate = new Date(8640000000000000);
        this.dataSource.filter = this.currentFilterValue;
    }

    applyFilter(filterValue: string) {
        this.dataSource.filter = filterValue;
        this.currentFilterValue = filterValue;
    }

    applyVonFilter(filterValue: string) {
        if (filterValue != null && filterValue.trim().length != 0) {
            let filterDate = this.formatStringToDate(filterValue);

            if (filterDate) {
                this.vonDate = filterDate;
                this.dataSource.filter = this.currentFilterValue;
                return;
            }
        }

        this.vonDate = new Date(-8640000000000000);
        this.dataSource.filter = this.currentFilterValue;
    }

    formatIfDate(rowElement: any) {
        if (rowElement instanceof Date) {
            return formatDate(rowElement, "dd.MM.yyyy", "en-GB");
        } else {
            return rowElement;
        }
    }

    formatStringToDate(dateString: string) {
        const regex = /^\d{2}.\d{2}.\d{4}$/;
        if (!regex.test(dateString)) {
            return null;
        }
        const splittedDateString = dateString.split(".");
        const newDateString =
            splittedDateString[1] +
            "." +
            splittedDateString[0] +
            "." +
            splittedDateString[2];
        let date = new Date(newDateString);
        if (date.toString() == "Invalid Date") {
            return null;
        }
        return date;
    }

    ngOnChanges() {
        this.dataSource.data = this.dokumente;
    }

    ngOnInit() {
        this.dataSource.data = this.dokumente;
        this.dataSource.filterPredicate = (
            data: DokumentKurz,
            filter: string,
        ) => {
            if (data.datum >= this.vonDate && data.datum <= this.bisDate) {
                return filter.trim().toLowerCase().length > 0
                    ? data
                          .toString()
                          .trim()
                          .toLowerCase()
                          .includes(filter.trim().toLowerCase())
                    : true;
            }
            return false;
        };
    }

    openDokument(row: any) {
        if (row.type == DokumentKurz._TYPELGK) {
            this.sucheService.leseDokumentLGK(row.dokumentreferenz);
        } else if (DokumentKurz._TYPEECM) {
            this.sucheService.leseDokumentECM(row.dokumentreferenz);
        } else {
            this.as.error("Der Übergebene Typ ist nicht bekannt!");
        }

        if (
            !this.userService?.userInfo?.containsRolle(
                this.rollen.ROLLE_DOKUMENT_ANZEIGEN,
            )
        ) {
            this.as.error(
                "Sie haben nicht die notwendige Berechtigung um ein Dokument anzuzeigen!",
            );
            return;
        }

        this.cdr.detectChanges();
    }
}
