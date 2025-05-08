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
    selector: "f360-tab-angehoerige",
    templateUrl: "./tab-angehoerige.component.html",
    styleUrls: ["./tab-angehoerige.component.scss"],
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
export class TabAngehoerigeComponent implements OnChanges {
    @Input() angError: ErrorMeldung;
    @Input() angehoerige: Angehoeriger[] = [];
    angehoerigeTable: MatTableDataSource<any> = new MatTableDataSource<any>();
    clearText: boolean = false;
    displayedColumns: string[] = ["zeit", "typ"];

    constructor(
        private cdr: ChangeDetectorRef,
        private sucheService: SucheService,
        private dialogService: DialogService,
        private zupService: ZupService,
    ) {}

    @ViewChild("angehoerigePaginator") set angehoerigePaginator(
        v: MatPaginator,
    ) {
        this.angehoerigeTable.paginator = v;
    }

    isClearText() {
        return this.clearText;
    }

    loadAngehoerige() {
        console.log(this.angehoerige?.length);
        this.zupService.logZUP(
            this.sucheService.selectCurrentFs(),
            "VSNR",
            this.sucheService.versicherter.getValue().stammdaten.pid,
            "F360_READ_KVA_ANG",
        );
        this.clearText = true;
    }

    ngOnChanges(): void {
        if (this.angError && this.angError.fehlerId == "FOCUS2") {
            this.angError.meldungstext = this.angError.fehlerkategorie;
        }

        if (this.angehoerige) {
            this.angehoerigeTable.data = this.angehoerige;
            this.cdr.detectChanges();
        }
    }

    readKVAVersicherter(vsnr: string) {
        if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
            return;
        }
        this.sucheService.readVersicherter(vsnr, "VSNR");
    }
}
