import { DatePipe } from "@angular/common";
import {
    ChangeDetectorRef,
    Component,
    Input,
    OnChanges,
    OnInit,
    ViewChild,
} from "@angular/core";
import { MatPaginator, MatPaginatorModule } from "@angular/material/paginator";
import { MatTableDataSource, MatTableModule } from "@angular/material/table";
import { MatTooltipModule } from "@angular/material/tooltip";
import { BetreuungsZeiten } from "../../../../../shared/models/betreuungsZeiten.model";
import { ErrorMeldung } from "../../../../../shared/models/errorMeldung.model";
import { DashletErrorComponent } from "../../../dashlet-error/dashlet-error.component";

@Component({
    selector: "f360-betreut-content",
    templateUrl: "./betreut-content.component.html",
    styleUrls: ["./betreut-content.component.scss"],
    standalone: true,
    imports: [
        MatTableModule,
        MatTooltipModule,
        MatPaginatorModule,
        DashletErrorComponent,
        DatePipe,
    ],
})
export class BetreutContentComponent implements OnInit, OnChanges {
    betreutenDataSource: MatTableDataSource<any>;
    @ViewChild("betreutenPaginator") betreutenPaginator: MatPaginator;
    @Input() betreutenZeiten: BetreuungsZeiten[] = [];
    displayedColumns: string[] = ["zeit", "qualifikation"];
    @Input() error: ErrorMeldung;

    constructor(private cd: ChangeDetectorRef) {}

    isLaufend(dateParam: any) {
        if (dateParam == null) {
            return true;
        }

        return new Date(dateParam).getFullYear() === 2999;
    }

    ngOnChanges() {
        if (this.error && this.error.fehlerId == "FOCUS2") {
            this.error.meldungstext = this.error.fehlerkategorie;
        }

        if (this.betreutenZeiten) {
            this.betreutenDataSource = new MatTableDataSource(
                this.betreutenZeiten,
            );
            this.cd.detectChanges();
            this.betreutenDataSource.paginator = this.betreutenPaginator;
        }
    }

    ngOnInit(): void {}
}
