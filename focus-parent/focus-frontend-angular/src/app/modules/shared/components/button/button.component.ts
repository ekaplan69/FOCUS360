import {
    ChangeDetectionStrategy,
    Component,
    EventEmitter,
    Input,
    Output,
} from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MatIconModule } from "@angular/material/icon";

@Component({
    selector: "f360-button",
    templateUrl: "./button.component.html",
    styleUrls: ["./button.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [MatButtonModule, MatIconModule],
})
export class ButtonComponent {
    @Input() disabled: boolean;
    @Input() label: string;
    @Output() onClick: EventEmitter<MouseEvent> =
        new EventEmitter<MouseEvent>();
    @Input() prefixIcon: string;
    @Input() suffixIcon: string;
    @Input() type = "button";

    constructor() {}

    clickButton(event: MouseEvent) {
        this.onClick.emit(event);
    }
}
