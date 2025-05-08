import { Injectable } from "@angular/core";
import { Fachschluessel } from "../Fachschluessel.model";
import { FormsFactory } from "../forms.factory";
import { DienstgeberStammdaten } from "./dienstgeber-stammdaten.model";
import { Dienstgeber } from "./dienstgeber.model";

@Injectable({
    providedIn: "root",
})
export class DienstgeberFactory {
    constructor(private formsFactory: FormsFactory) {}

    empty() {
        return new Dienstgeber(
            null,
            null,
            null,
            this.formsFactory.createForms(),
        );
    }

    of(data: any) {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }

        return new Dienstgeber(
            Fachschluessel.of(data.dgnr, "DGNR"),
            DienstgeberStammdaten.of(data.stammdatenDTO),
            null,
            this.formsFactory.createForms(),
        );
    }
}
