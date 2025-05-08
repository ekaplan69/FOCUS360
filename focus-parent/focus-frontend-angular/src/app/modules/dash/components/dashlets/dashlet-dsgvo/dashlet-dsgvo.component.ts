import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

@Component({
    selector: "f360-dashlet-dsgvo",
    templateUrl: "./dashlet-dsgvo.component.html",
    styleUrls: ["./dashlet-dsgvo.component.scss"],
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
    ],
})
export class DashletDsgvoComponent implements OnInit {
    constructor(
        private sucheService: SucheService,
        private actRoute: ActivatedRoute,
    ) {}

    ngOnInit(): void {}

    pdfHerunterladen() {
        const currParams = this.actRoute.snapshot.queryParamMap;
        const paramFs = currParams.get("fs");
        const paramFsArt = currParams.get("fsArt");
        this.sucheService.getDSGVOPdf(paramFs, paramFsArt);
    }
}
