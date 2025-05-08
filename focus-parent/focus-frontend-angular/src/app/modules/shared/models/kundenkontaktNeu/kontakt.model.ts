export class Kontakt {
    constructor(
        public startTs: Date,
        public endeTs: Date,
        public aufgabengebietId: number,
        public kontaktartId: number,
        public themaId: number,
        public unterthemaId: number,
        public abschlussartId: number,
        public agd: boolean,
        public agdFachschluessel: string,
        public agdName: string,
        public anmerkung: string,
        public scBezeichnung: string,
        public scIdMa: number,
        public updatecount: number,
        public ersteller: string,
        public erstellTs: string,
        public subAufgabengebietId: number,
        public kontaktId?: number,
    ) {}

    static empty() {
        return new Kontakt(
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
            null,
            null,
        );
    }

    static of(data) {
        if (data == null) {
            return null;
        }

        return new Kontakt(
            this.parseDate(data.startTs),
            this.parseDate(data.endeTs),
            data.aufgabengebietId,
            data.kontaktartId,
            data.themaId,
            data.unterthemaId,
            data.abschlussartId,
            data.agd,
            data.agdFachschluessel,
            data.agdName,
            data.anmerkung,
            data.scBezeichnung,
            data.scIdMa,
            data.updatecount,
            data.erstelltName,
            data.erstellt,
            data.subAufgabengebietId,
            data.kontaktId,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => Kontakt.of(d));
    }

    static parseDate(externalDate): Date {
        if (!externalDate || externalDate.length < 5) {
            return null;
        }

        let date = new Date();

        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3]);
        date.setMinutes(externalDate[4]);
        if (externalDate[5]) {
            date.setSeconds(externalDate[5]);
        }

        return date;
    }
}
