import { ChangeDetectionStrategy, Component } from "@angular/core";
import { MatCardModule } from "@angular/material/card";

@Component({
    selector: "f360-dashlet-content",
    templateUrl: "./dashlet-content.component.html",
    styleUrls: ["./dashlet-content.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [MatCardModule],
})
export class DashletContentComponent {
    constructor() {}
}
