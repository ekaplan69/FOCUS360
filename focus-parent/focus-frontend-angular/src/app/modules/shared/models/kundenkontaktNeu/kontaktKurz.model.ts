import { formatDate } from "@angular/common";

export class KontaktKurz {
    constructor(
        public abschlussart: string,
        public aufgabengebiet: string,
        public zeitpunktEnde: Date,
        public zeitpunktEndeString: string,
        public id: number,
        public kontaktart: string,
        public mitarbeiterOe: string,
        public scBezeichnung: string,
        public zeitpunktStart: Date,
        public zeitpunktStartString: string,
        public thema: string,
        public zeitpunktDatum: Date,
        public zeitpunktDatumString: string,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        let kontakt = new KontaktKurz(
            data.abschlussart,
            data.aufgabengebiet,
            this.parseDate(data.endeTs),
            null,
            data.id,
            data.kontaktart,
            data.mitarbeiterOe,
            data.scBezeichnung,
            this.parseDate(data.startTs),
            null,
            data.thema,
            this.parseDate(data.startTs),
            null,
        );

        if (kontakt.zeitpunktStart) {
            kontakt.zeitpunktStartString = formatDate(
                kontakt.zeitpunktStart,
                "HH:mm",
                "en-GB",
            );
        }
        if (kontakt.zeitpunktDatum) {
            kontakt.zeitpunktDatumString = formatDate(
                kontakt.zeitpunktDatum,
                "dd.MM.yyyy",
                "en-GB",
            );
        }
        if (kontakt.zeitpunktEnde) {
            kontakt.zeitpunktEndeString = formatDate(
                kontakt.zeitpunktEnde,
                "HH:mm",
                "en-GB",
            );
        }

        return kontakt;
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KontaktKurz.of(d));
    }

    static parseDate(externalDate): Date {
        if (!externalDate) {
            return null;
        }
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
