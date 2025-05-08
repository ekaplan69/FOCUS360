import { Fachschluessel } from "../Fachschluessel.model";
import { Forms } from "../forms.model";
import { Kunde } from "../kunde.model";
import { KontaktKurz } from "../kundenkontaktNeu/kontaktKurz.model";
import { DienstgeberStammdaten } from "./dienstgeber-stammdaten.model";

export class Dienstgeber extends Kunde {
    openedKontakt: boolean;

    constructor(
        public fs: Fachschluessel,
        public stammdaten: DienstgeberStammdaten,
        public kontakteKurz: KontaktKurz[],
        public forms: Forms,
    ) {
        super();
    }
}
