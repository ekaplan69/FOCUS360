import { ChangeDetectionStrategy, Component } from "@angular/core";

@Component({
    selector: "f360-header-logo",
    templateUrl: "./header-logo.component.html",
    styleUrls: ["./header-logo.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
})
export class HeaderLogoComponent {
    constructor() {}
}
