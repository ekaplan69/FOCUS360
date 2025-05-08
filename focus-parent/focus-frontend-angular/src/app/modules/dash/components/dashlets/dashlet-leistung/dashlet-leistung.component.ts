import { DatePipe } from "@angular/common";
import { Component, Input } from "@angular/core";
import { MatTooltipModule } from "@angular/material/tooltip";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { IconMapping } from "../../../../shared/constants/icon-mapping.constant";
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { Leistung } from "../../../../shared/models/leistung.model";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { DashletContentDataComponent } from "../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

@Component({
    selector: "f360-dashlet-leistung",
    templateUrl: "./dashlet-leistung.component.html",
    styleUrls: ["./dashlet-leistung.component.scss"],
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        DashletErrorComponent,
        DashletContentDataComponent,
        MatTooltipModule,
        DatePipe,
    ],
})
export class DashletLeistungComponent {
    public static iconMap: Map<string, string> = IconMapping.iconMap;
    @Input() error: ErrorMeldung;
    @Input() leistung: Leistung;
    @Input() lgkkUrl: string;

    constructor(private sucheService: SucheService) {
        if (sucheService.versicherter.getValue()) {
            sucheService.versicherter.getValue().urlMap.subscribe((map) => {
                if (map.get("lgkk")) {
                    this.lgkkUrl = map.get("lgkk");
                }
            });
        }
    }

    iconFor(str: string): string {
        let icon = DashletLeistungComponent.iconMap.get(str);

        return icon ? icon : "block";
    }

    isLaufend(dateParam: any): boolean {
        if (dateParam == null) {
            return true;
        }

        return new Date(dateParam).getFullYear() === 2999;
    }
}
