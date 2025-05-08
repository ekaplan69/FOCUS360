import { BehaviorSubject } from "rxjs";
import { Betreuungszeit } from "./betreuungszeit.model";
import { DokumentKurz } from "./dokumente/dokumentKurz.model";
import { ECard } from "./eCard.model";
import { Fachschluessel } from "./Fachschluessel.model";
import { FeedbackKurz } from "./feedback/feedback-kurz.model";
import { Forms } from "./forms.model";
import { GebuehrenBefreiung } from "./gebuehrenBefreiung.model";
import { Kunde } from "./kunde.model";
import { KontaktKurz } from "./kundenkontaktNeu/kontaktKurz.model";
import { Leistung } from "./leistung.model";
import { Mitversicherung } from "./mitversicherung.model";
import { Notiz } from "./notiz.model";
import { Stammdaten } from "./stammdaten.model";
import { Versicherungszeit } from "./versicherungszeit.model";

export class Person extends Kunde {
    openedKontakt: boolean;

    constructor(
        public fs: Fachschluessel,
        public stammdaten: Stammdaten,
        public kontakteKurz: KontaktKurz[],
        public feedbackKurz: FeedbackKurz[] = [],
        public dokumenteKurz: DokumentKurz[],
        public notiz: Notiz,
        public ecard: ECard,
        public krankenanspruch: boolean,
        public toleranzfrist: string,
        public schutzfrist: string,
        public gebuehrenBefreiungen: GebuehrenBefreiung[],
        public versicherungszeiten: Versicherungszeit[],
        public betreuungsZeiten: Betreuungszeit[],
        public mitversicherungen: Mitversicherung,
        public leistungen: Leistung,
        public forms: Forms,
        public urlMap: BehaviorSubject<
            Map<string, string>
        > = new BehaviorSubject<Map<string, string>>(new Map<string, string>()),
    ) {
        super();
    }

    getName(anrede: boolean) {
        if (!this.stammdaten) {
            return null;
        }

        return anrede ? this.stammdaten.name : this.stammdaten.nameOhneAnrede;
    }

    getOrt() {
        if (!this.stammdaten || !this.stammdaten.adresse) {
            return null;
        }

        return this.stammdaten.adresse.ort;
    }

    getPlz() {
        if (!this.stammdaten || !this.stammdaten.adresse) {
            return null;
        }

        return this.stammdaten.adresse.plz;
    }

    isBTNR(): boolean {
        return this.fs.fachschluessel.startsWith("0");
    }
}
