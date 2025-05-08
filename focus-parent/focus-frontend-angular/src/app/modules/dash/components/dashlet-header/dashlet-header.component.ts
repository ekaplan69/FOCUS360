import {
    ChangeDetectionStrategy,
    Component,
    EventEmitter,
    Input,
    Output,
} from "@angular/core";
import { MatCardModule } from "@angular/material/card";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";

@Component({
    selector: "f360-dashlet-header",
    templateUrl: "./dashlet-header.component.html",
    styleUrls: ["./dashlet-header.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [MatCardModule, MatIconModule, MatTooltipModule],
})
export class DashletHeaderComponent {
    @Input() actionIcon: string;
    @Output() actionIconClicked: EventEmitter<any> = new EventEmitter();
    @Input() actionIconTooltipText: string;
    @Input() dashletIcon: string;
    @Input() launch: string;
    @Input() launchTooltipText: string;

    constructor() {}

    emitActionIconClicked() {
        this.actionIconClicked.emit();
    }
}
