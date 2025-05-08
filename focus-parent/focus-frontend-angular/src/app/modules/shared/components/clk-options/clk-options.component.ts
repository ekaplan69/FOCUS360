import { NgClass } from "@angular/common";
import { Component, OnInit, ViewChild } from "@angular/core";
import { MatDialogRef } from "@angular/material/dialog";
import { MatIconModule } from "@angular/material/icon";
import { MatPaginator, MatPaginatorModule } from "@angular/material/paginator";
import { MatSortModule } from "@angular/material/sort";
import { MatTableDataSource, MatTableModule } from "@angular/material/table";
import { ClkOptionModel } from "../../models/clk-option.model";
import { ErrorMeldung } from "../../models/errorMeldung.model";
import { ZpvClientCoopNeuService } from "../../services/frontend/zpv/zpv-client-coop-neu.service";
import { LoadingIndicatorComponent } from "../loading-indicator/loading-indicator.component";

@Component({
    selector: "clk-options",
    templateUrl: "./clk-options.component.html",
    styleUrls: ["./clk-options.component.scss"],
    standalone: true,
    imports: [
        LoadingIndicatorComponent,
        MatTableModule,
        MatSortModule,
        MatPaginatorModule,
        NgClass,
        MatIconModule,
    ],
})
export class ClkOptionsComponent implements OnInit {
    columnNames: string[] = ["fachschluessel", "fachschluesselArt"];
    dataSource: MatTableDataSource<ClkOptionModel>;
    public detailSearchError: ErrorMeldung;
    public resultList: ClkOptionModel[];

    constructor(
        private clkService: ZpvClientCoopNeuService,
        public dialogRef: MatDialogRef<ClkOptionsComponent>,
    ) {}

    @ViewChild(MatPaginator) set paginator(p: MatPaginator) {
        this.dataSource.paginator = p;
    }

    handleFsClicked(fachschluessel: string) {
        this.dialogRef.close(fachschluessel);
    }

    ngOnInit() {
        this.clkService._clkOptions.asObservable().subscribe((data) => {
            this.dataSource = new MatTableDataSource<ClkOptionModel>(data);
            this.resultList = data;
        });
    }
}
