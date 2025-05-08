import { formatDate } from "@angular/common";

export class DokumentKurz {
    public static _TYPEECM: string = "ECM";
    public static _TYPELGK: string = "LGK";

    constructor(
        public datum: Date,
        public dokumentreferenz: string,
        public datumString: string,
        public art: string,
        public klasse: string,
        public kategorie: string,
        public thema: string,
        public type: string,
    ) {}

    static empty() {
        return new DokumentKurz(null, null, null, null, null, null, null, null);
    }

    static of(data, type) {
        if (data == null) {
            return null;
        }

        let doc;
        if (type == this._TYPELGK) {
            doc = new DokumentKurz(
                this.parseDate(data.einlangdatum),
                data.dokumentreferenz,
                null,
                data.versendungsart,
                data.dokumentklasse,
                data.kategorie,
                data.thema,
                type,
            );
        } else if (type == this._TYPEECM) {
            doc = new DokumentKurz(
                this.parseDate(data.datum),
                data.dokumentId,
                null,
                data.art,
                data.dokumentenklasse,
                data.kategorie,
                data.thema,
                type,
            );
        } else {
            return;
        }

        doc.datumString = formatDate(doc.datum, "dd.MM.yyyy", "en-GB");
        return doc;
    }

    static ofList(data, type) {
        if (data == null) {
            return null;
        }

        return data.map((d) => DokumentKurz.of(d, type));
    }

    static parseDate(externalDate): Date {
        if (!externalDate || externalDate.length != 3) {
            return null;
        }

        let date = new Date();

        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(0);
        date.setMinutes(0);
        if (externalDate[5]) {
            date.setSeconds(0);
        }
        return date;
    }

    public toString = (): string => {
        return (
            this.datum.toString() +
            this.art +
            this.kategorie +
            this.klasse +
            this.type +
            this.thema
        );
    };
}
