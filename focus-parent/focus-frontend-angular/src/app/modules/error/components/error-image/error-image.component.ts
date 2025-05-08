import { ChangeDetectionStrategy, Component } from "@angular/core";

@Component({
    selector: "f360-error-image",
    templateUrl: "./error-image.component.html",
    styleUrls: ["./error-image.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
})
export class ErrorImageComponent {}
