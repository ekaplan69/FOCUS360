import { NgClass } from "@angular/common";
import { Component, Input, OnInit } from "@angular/core";
import { LoadingIndicatorComponent } from "../../../../../shared/components/loading-indicator/loading-indicator.component";
import { DienstgeberStammdaten } from "../../../../../shared/models/dienstgeber/dienstgeber-stammdaten.model";
import { DashletContentDataComponent } from "../../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../../dashlet-content/dashlet-content.component";
import { DashletHeaderComponent } from "../../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../../dashlet/dashlet.component";

@Component({
    selector: "f360-dashlet-dg-stammdaten",
    templateUrl: "./dienstgeber-stammdaten.component.html",
    styleUrls: ["./dienstgeber-stammdaten.component.scss"],
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        DashletContentDataComponent,
        NgClass,
    ],
})
export class DienstgeberStammdatenComponent implements OnInit {
    dashboardUrl: string;
    @Input() stammdaten: DienstgeberStammdaten;

    constructor() {
        //TODO zpv weiterleitung für dg
        this.dashboardUrl = "";
    }

    ngOnInit(): void {}
}
