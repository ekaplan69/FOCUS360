import { ChangeDetectionStrategy, Component } from "@angular/core";

@Component({
    selector: "f360-error-titel",
    templateUrl: "./error-titel.component.html",
    styleUrls: ["./error-titel.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
})
export class ErrorTitelComponent {
    titel = "Ups...die Seite wurde leider nicht gefunden!";
}
