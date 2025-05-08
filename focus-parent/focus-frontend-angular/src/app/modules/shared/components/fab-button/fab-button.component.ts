import {
    ChangeDetectionStrategy,
    Component,
    EventEmitter,
    Input,
    Output,
} from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";

@Component({
    selector: "f360-fab-button",
    templateUrl: "./fab-button.component.html",
    styleUrls: ["./fab-button.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [MatButtonModule, MatTooltipModule, MatIconModule],
})
export class FabButtonComponent {
    @Input() disabled: boolean;
    @Input() icon: string;
    @Output() onClick: EventEmitter<MouseEvent> =
        new EventEmitter<MouseEvent>();
    @Input() tooltipText: string;
    @Input() type = "button";

    constructor() {}

    clickButton(event: MouseEvent) {
        this.onClick.emit(event);
    }
}
