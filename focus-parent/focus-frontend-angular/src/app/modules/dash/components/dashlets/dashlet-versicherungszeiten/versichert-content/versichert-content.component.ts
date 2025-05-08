import { DatePipe } from "@angular/common";
import {
    ChangeDetectorRef,
    Component,
    Input,
    OnChanges,
    ViewChild,
} from "@angular/core";
import { MatPaginator, MatPaginatorModule } from "@angular/material/paginator";
import { MatTableDataSource, MatTableModule } from "@angular/material/table";
import { MatTooltipModule } from "@angular/material/tooltip";
import { ErrorMeldung } from "../../../../../shared/models/errorMeldung.model";
import { Versicherungszeit } from "../../../../../shared/models/versicherungszeit.model";
import { DashletErrorComponent } from "../../../dashlet-error/dashlet-error.component";

@Component({
    selector: "f360-versichert-content",
    templateUrl: "./versichert-content.component.html",
    styleUrls: ["./versichert-content.component.scss"],
    standalone: true,
    imports: [
        MatTableModule,
        MatTooltipModule,
        MatPaginatorModule,
        DashletErrorComponent,
        DatePipe,
    ],
})
export class VersichertContentComponent implements OnChanges {
    dataSource: MatTableDataSource<any>;
    displayedColumns: string[] = ["zeit", "qualifikation"];
    @Input() error: ErrorMeldung;
    @ViewChild(MatPaginator) paginator: MatPaginator;
    @Input() versicherungszeiten: Versicherungszeit[] = [];

    constructor(private cd: ChangeDetectorRef) {}

    ngOnChanges(): void {
        if (this.error && this.error.fehlerId == "FOCUS2") {
            this.error.meldungstext = this.error.fehlerkategorie;
        }

        if (this.versicherungszeiten) {
            this.dataSource = new MatTableDataSource(this.versicherungszeiten);
            this.cd.detectChanges();
            this.dataSource.paginator = this.paginator;
        }
    }
}
