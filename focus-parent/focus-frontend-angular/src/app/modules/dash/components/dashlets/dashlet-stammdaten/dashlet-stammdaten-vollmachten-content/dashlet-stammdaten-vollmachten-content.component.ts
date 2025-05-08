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
import { Vollmacht } from "../../../../../shared/models/vollmacht.model";

@Component({
    selector: "f360-dashlet-stammdaten-vollmachten-content",
    templateUrl: "./dashlet-stammdaten-vollmachten-content.component.html",
    styleUrls: ["./dashlet-stammdaten-vollmachten-content.component.scss"],
    standalone: true,
    imports: [MatTableModule, MatTooltipModule, MatPaginatorModule, DatePipe],
})
export class DashletStammdatenVollmachtenContentComponent implements OnChanges {
    dataSource: MatTableDataSource<any>;
    displayedColumns: string[] = ["zeit", "person"];
    @ViewChild(MatPaginator) paginator: MatPaginator;
    @Input() vollmachten: Vollmacht[];

    constructor(private cd: ChangeDetectorRef) {}

    ngOnChanges(): void {
        if (this.vollmachten) {
            this.dataSource = new MatTableDataSource(this.vollmachten);
            this.cd.detectChanges();
            this.dataSource.paginator = this.paginator;
        }
    }
}
