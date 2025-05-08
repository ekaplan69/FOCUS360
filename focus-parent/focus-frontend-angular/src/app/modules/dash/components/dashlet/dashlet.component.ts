import { ChangeDetectionStrategy, Component, Input } from "@angular/core";
import { MatCardModule } from "@angular/material/card";

@Component({
    selector: "f360-dashlet",
    templateUrl: "./dashlet.component.html",
    styleUrls: ["./dashlet.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [MatCardModule],
})
export class DashletComponent {
    @Input() id: string;

    constructor() {}
}
