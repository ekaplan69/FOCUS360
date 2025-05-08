import { Component, Input, OnInit } from "@angular/core";

@Component({
    selector: "f360-tab-card",
    templateUrl: "./form-card.component.html",
    styleUrls: ["./form-card.component.scss"],
    standalone: true,
})
export class FormCardComponent implements OnInit {
    @Input() cardTitle: String;

    constructor() {}

    ngOnInit() {}
}
