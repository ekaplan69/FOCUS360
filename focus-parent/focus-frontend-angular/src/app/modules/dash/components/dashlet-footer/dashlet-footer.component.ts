import { ChangeDetectionStrategy, Component } from "@angular/core";
import { MatCardModule } from "@angular/material/card";

@Component({
    selector: "f360-dashlet-footer",
    templateUrl: "./dashlet-footer.component.html",
    styleUrls: ["./dashlet-footer.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [MatCardModule],
})
export class DashletFooterComponent {
    constructor() {}
}
