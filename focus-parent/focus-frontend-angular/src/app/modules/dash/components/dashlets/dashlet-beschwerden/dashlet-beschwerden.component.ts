import {
    Component,
    EventEmitter,
    Input,
    OnChanges,
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
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { FeedbackKurz } from "../../../../shared/models/feedback/feedback-kurz.model";
import { UserService } from "../../../../shared/services/backend/user/user.service";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

@Component({
    selector: "f360-dashlet-beschwerden",
    templateUrl: "./dashlet-beschwerden.component.html",
    styleUrls: ["./dashlet-beschwerden.component.scss"],
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
export class DashletBeschwerdenComponent implements OnChanges {
    @Input() beschwerdeListe: FeedbackKurz[];
    columnNames: String[] = [
        "erstellDatumBez",
        "feedbackArtBezeichnung",
        "themaBezeichnung",
        "unterkategorieBezeichnung",
        "grundBezeichnung",
    ];
    dataSource: MatTableDataSource<FeedbackKurz> =
        new MatTableDataSource<FeedbackKurz>();
    @Input() error: ErrorMeldung;
    @Output() openBeschwerdeFormEvent: EventEmitter<FeedbackKurz> =
        new EventEmitter();
    rollen = RollenConstant;
    @ViewChild(MatSort) sort: MatSort;

    constructor(public userService: UserService) {}

    @ViewChild(MatPaginator) set paginator(v: MatPaginator) {
        this.dataSource.paginator = v;
    }

    applyFilter(filterValue: string) {
        this.dataSource.filter = filterValue.trim().toLowerCase();

        if (this.dataSource.paginator) {
            this.dataSource.paginator.firstPage();
        }
    }

    beschwerdeBearbeiten(feedback: FeedbackKurz) {
        this.openBeschwerdeFormEvent.emit(feedback);
    }

    neueBeschwerdeErfassen() {
        this.openBeschwerdeFormEvent.emit(null);
    }

    ngOnChanges() {
        this.dataSource.sort = this.sort;
        this.dataSource.data = this.beschwerdeListe;

        this.dataSource.sortingDataAccessor = (item, property) => {
            switch (property) {
                case "erstellDatumBez":
                    return item.erstellDatum;
                default:
                    return item[property];
            }
        };
    }
}
