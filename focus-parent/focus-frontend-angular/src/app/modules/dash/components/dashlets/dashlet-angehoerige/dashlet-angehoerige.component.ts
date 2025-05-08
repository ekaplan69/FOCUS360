import { Component, Input, OnChanges } from "@angular/core";
import { MatTabsModule } from "@angular/material/tabs";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { Angehoeriger } from "../../../../shared/models/angehoeriger.model";
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";
import { TabAngehoerigeComponent } from "./tab-angehoerige/tab-angehoerige.component";
import { TabVersicherteComponent } from "./tab-versicherte/tab-versicherte.component";

@Component({
    selector: "f360-dashlet-angehoerige",
    templateUrl: "./dashlet-angehoerige.component.html",
    styleUrls: ["./dashlet-angehoerige.component.scss"],
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        MatTabsModule,
        TabAngehoerigeComponent,
        TabVersicherteComponent,
    ],
})
export class DashletAngehoerigeComponent implements OnChanges {
    @Input() angError: ErrorMeldung;
    @Input() angehoerige: Angehoeriger[] = [];
    contentLoaded: boolean = false;
    @Input() verError: ErrorMeldung;
    @Input() versicherte: Angehoeriger[] = [];

    constructor() {}

    contentAvailable() {
        return this.contentLoaded;
    }

    ngOnChanges(): void {
        if (
            this.angehoerige ||
            this.versicherte ||
            this.angError ||
            this.verError
        ) {
            this.contentLoaded = true;
        }
    }
}
