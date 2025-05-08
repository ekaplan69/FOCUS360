import { ChangeDetectionStrategy, Component } from "@angular/core";

@Component({
    selector: "f360-home-logo",
    templateUrl: "./home-logo.component.html",
    styleUrls: ["./home-logo.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
})
export class HomeLogoComponent {
    constructor() {}
}
