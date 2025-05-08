import { NgClass } from "@angular/common";
import { Component, Input } from "@angular/core";
import { Stammdaten } from "../../../../../shared/models/stammdaten.model";
import { IbanPipe } from "../../../../../shared/pipes/iban.pipe";
import { DashletContentDataComponent } from "../../../dashlet-content-data/dashlet-content-data.component";

@Component({
    selector: "f360-dashlet-stammdaten-content",
    templateUrl: "./dashlet-stammdaten-content.component.html",
    styleUrls: ["./dashlet-stammdaten-content.component.scss"],
    standalone: true,
    imports: [DashletContentDataComponent, NgClass, IbanPipe],
})
export class DashletStammdatenContentComponent {
    @Input() stammdaten: Stammdaten;

    constructor() {}

    ngOnInit() {}
}
