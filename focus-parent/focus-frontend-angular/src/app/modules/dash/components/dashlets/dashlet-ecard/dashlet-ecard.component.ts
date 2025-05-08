import { DatePipe } from "@angular/common";
import {
    ChangeDetectionStrategy,
    Component,
    Input,
    OnChanges,
} from "@angular/core";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { ECard } from "../../../../shared/models/eCard.model";
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { DashletContentDataComponent } from "../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

@Component({
    selector: "f360-dashlet-ecard",
    templateUrl: "./dashlet-ecard.component.html",
    styleUrls: ["./dashlet-ecard.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        DashletContentDataComponent,
        DashletErrorComponent,
        DatePipe,
    ],
})
export class DashletEcardComponent implements OnChanges {
    @Input() dashboardUrl: string;
    @Input() ecard: ECard;
    @Input() error: ErrorMeldung;
    private noData: boolean;

    constructor(private sucheService: SucheService) {
        this.loadUrl();
    }

    ngOnChanges() {
        if (
            this.ecard &&
            !this.ecard.ausstellungsDatum &&
            !this.ecard.letzteKonsultationDatum &&
            !this.ecard.laufNummer
        ) {
            this.noData = true;
        } else {
            this.noData = false;
        }
        this.loadUrl();
    }

    private loadUrl() {
        if (this.sucheService.getVersicherter().getValue()) {
            this.sucheService
                .getVersicherter()
                .getValue()
                .urlMap.subscribe((map) => {
                    if (map.get("ecadmin")) {
                        this.dashboardUrl = map.get("ecadmin");
                    }
                });
        }
    }
}
