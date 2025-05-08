import { formatDate } from "@angular/common";

export class KundenkontaktKurz {
    constructor(
        public id: number,
        public kanal: string,
        public kontaktDetail: string,
        public kontaktGrund: string,
        public kontaktPunkt: string,
        public zeitpunkt: Date,
        public zeitpunktString: string,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        let kontakt = new KundenkontaktKurz(
            data.kontaktId,
            data.kanalBez,
            data.kontaktdetailsBez,
            data.kontaktgrundBez,
            data.kontaktpunktBez,
            this.parseDate(data.zeitpunkt),
            null,
        );
        kontakt.zeitpunktString = formatDate(
            kontakt.zeitpunkt,
            "dd.MM.yyyy HH:mm",
            "en-GB",
        );
        return kontakt;
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KundenkontaktKurz.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
