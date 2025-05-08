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
import { ButtonComponent } from "../../../../../shared/components/button/button.component";
import { Angehoeriger } from "../../../../../shared/models/angehoeriger.model";
import { ErrorMeldung } from "../../../../../shared/models/errorMeldung.model";
import { KontaktForm } from "../../../../../shared/models/kundenkontakt/kontakt-form.model";
import { VsnrPipe } from "../../../../../shared/pipes/vsnr.pipe";
import { SucheService } from "../../../../../shared/services/backend/suche/suche.service";
import { ZupService } from "../../../../../shared/services/backend/zup/zup.service";
import { DialogService } from "../../../../../shared/services/frontend/dialog/dialog.service";
import { DashletErrorComponent } from "../../../dashlet-error/dashlet-error.component";

@Component({
    selector: "f360-tab-versicherte",
    templateUrl: "./tab-versicherte.component.html",
    styleUrls: ["./tab-versicherte.component.scss"],
    standalone: true,
    imports: [
        MatTableModule,
        MatTooltipModule,
        MatPaginatorModule,
        ButtonComponent,
        DashletErrorComponent,
        DatePipe,
        VsnrPipe,
    ],
})
export class TabVersicherteComponent implements OnInit, OnChanges {
    clearText: boolean = false;
    contentLoaded: boolean = false;
    displayedColumns: string[] = ["zeit", "typ"];
    @Input() verError: ErrorMeldung;
    @Input() versicherte: Angehoeriger[] = [];
    versicherteTable: MatTableDataSource<any> = new MatTableDataSource();
    protected readonly length = length;

    constructor(
        private cdr: ChangeDetectorRef,
        private sucheService: SucheService,
        private dialogService: DialogService,
        private zupService: ZupService,
    ) {}

    @ViewChild("versichertePaginator") set versichertePaginator(
        v: MatPaginator,
    ) {
        this.versicherteTable.paginator = v;
    }

    isClearText() {
        return this.clearText;
    }

    loadAngehoerige() {
        this.zupService.logZUP(
            this.sucheService.selectCurrentFs(),
            "VSNR",
            this.sucheService.versicherter.getValue().stammdaten.pid,
            "F360_READ_KVA_MVS",
        );
        this.clearText = true;
    }

    ngOnChanges() {
        if (this.verError && this.verError.fehlerId == "FOCUS2") {
            this.verError.meldungstext = this.verError.fehlerkategorie;
            this.contentLoaded = true;
        }

        if (this.versicherte) {
            this.versicherteTable.data = this.versicherte;
            this.cdr.detectChanges();
            this.versicherteTable.paginator = this.versichertePaginator;
            this.contentLoaded = true;
        }
    }

    ngOnInit(): void {}

    readKVAVersicherter(vsnr: string) {
        if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
            return;
        }
        this.sucheService.readVersicherter(vsnr, "VSNR");
    }
}
