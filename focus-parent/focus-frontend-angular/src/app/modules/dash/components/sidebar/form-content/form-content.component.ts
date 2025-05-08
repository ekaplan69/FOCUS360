import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";
import { Forms } from "../../../../shared/models/forms.model";
import { BeschwerdeFormComponent } from "./beschwerde-form/beschwerde-form.component";
import { KundenkontaktFormComponent } from "./kundenkontakt-form/kundenkontakt-form.component";
import { NotizFormComponent } from "./notiz-form/notiz-form.component";
import { SubaufgabengebietFormComponent } from "./subaufgabengebiet-form/subaufgabengebiet-form.component";

@Component({
    selector: "f360-form-content",
    templateUrl: "./form-content.component.html",
    styleUrls: ["./form-content.component.scss"],
    standalone: true,
    imports: [
        NotizFormComponent,
        BeschwerdeFormComponent,
        KundenkontaktFormComponent,
        SubaufgabengebietFormComponent,
    ],
})
export class FormContentComponent implements OnInit {
    FORM_TYPES = Forms.TYPES;
    @Output() cancelFormEvent: EventEmitter<string> =
        new EventEmitter<string>();
    @Input() forms: Forms;

    constructor() {}

    cancelForm(formType: string) {
        this.cancelFormEvent.emit(formType);
    }

    ngOnInit() {}
}
