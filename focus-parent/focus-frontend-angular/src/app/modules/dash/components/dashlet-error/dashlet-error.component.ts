import { NgClass } from "@angular/common";
import { Component, Input, OnInit } from "@angular/core";
import { MatIconModule } from "@angular/material/icon";
import { ErrorMeldung } from "../../../shared/models/errorMeldung.model";

@Component({
    selector: "f360-dashlet-error",
    templateUrl: "./dashlet-error.component.html",
    styleUrls: ["./dashlet-error.component.scss"],
    standalone: true,
    imports: [NgClass, MatIconModule],
})
export class DashletErrorComponent implements OnInit {
    @Input() error: ErrorMeldung;

    constructor() {}

    ngOnInit() {}
}
