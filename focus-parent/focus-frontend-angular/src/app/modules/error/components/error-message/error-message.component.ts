import { ChangeDetectionStrategy, Component, Input } from "@angular/core";

@Component({
    selector: "f360-error-message",
    templateUrl: "./error-message.component.html",
    styleUrls: ["./error-message.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
})
export class ErrorMessageComponent {
    @Input() url: string;
}
