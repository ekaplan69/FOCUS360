import { DatePipe, NgTemplateOutlet } from "@angular/common";
import { ChangeDetectionStrategy, Component, Input } from "@angular/core";
import { MatTabsModule } from "@angular/material/tabs";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { Stammdaten } from "../../../../shared/models/stammdaten.model";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";
import { DashletStammdatenContentComponent } from "./dashlet-stammdaten-content/dashlet-stammdaten-content.component";
import { DashletStammdatenVollmachtenContentComponent } from "./dashlet-stammdaten-vollmachten-content/dashlet-stammdaten-vollmachten-content.component";

@Component({
    providers: [DatePipe],
    selector: "f360-dashlet-stammdaten",
    templateUrl: "./dashlet-stammdaten.component.html",
    styleUrls: ["./dashlet-stammdaten.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        DashletStammdatenContentComponent,
        DashletStammdatenVollmachtenContentComponent,
        MatTabsModule,
        NgTemplateOutlet,
    ],
})
export class DashletStammdatenComponent {
    @Input() dashboardUrl: string;
    @Input() stammdaten: Stammdaten;

    constructor(private sucheService: SucheService) {
        if (sucheService.getVersicherter().getValue()) {
            sucheService
                .getVersicherter()
                .getValue()
                .urlMap.subscribe((map) => {
                    if (map.get("zpv")) {
                        this.dashboardUrl = map.get("zpv");
                    }
                });
        }
    }
}
