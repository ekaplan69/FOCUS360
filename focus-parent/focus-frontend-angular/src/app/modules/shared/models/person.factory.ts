import { Injectable } from "@angular/core";
import { Fachschluessel } from "./Fachschluessel.model";
import { FormsFactory } from "./forms.factory";
import { KundenkontaktKurz } from "./kundenkontakt/kundenkontakt-kurz.model";
import { Person } from "./Person.model";
import { Stammdaten } from "./stammdaten.model";
import { Versicherungszeit } from "./versicherungszeit.model";

@Injectable({
    providedIn: "root",
})
export class PersonFactory {
    constructor(private formsFactory: FormsFactory) {}

    empty() {
        return new Person(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
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

        return new Person(
            Fachschluessel.of(data.vsnr, data.fsArt),
            Stammdaten.of(data.stammdaten),
            KundenkontaktKurz.ofList(data.kundenKontakte),
            data.beschwerden,
            data.dokumente,
            data.notiz,
            data.ecard,
            data.krankenanspruch,
            data.schutzfrist,
            data.toleranzfrist,
            data.gebuehrenBefreiungen,
            Versicherungszeit.ofList(data.versicherungszeiten),
            data.betreuungsZeiten,
            data.mitversicherungen,
            data.leistungen,
            this.formsFactory.createForms(),
        );
    }
}
