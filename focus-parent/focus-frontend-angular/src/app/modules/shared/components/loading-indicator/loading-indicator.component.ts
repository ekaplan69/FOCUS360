import { Component, OnInit } from "@angular/core";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";

@Component({
    selector: "f360-loading-indicator",
    templateUrl: "./loading-indicator.component.html",
    styleUrls: ["./loading-indicator.component.scss"],
    standalone: true,
    imports: [MatProgressSpinnerModule],
})
export class LoadingIndicatorComponent implements OnInit {
    constructor() {}

    ngOnInit() {}
}
