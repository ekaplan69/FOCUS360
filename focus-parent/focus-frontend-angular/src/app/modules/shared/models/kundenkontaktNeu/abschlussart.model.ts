export class Abschlussart {
    constructor(
        public abschlussartId: number,
        public abschlussartBezeichnung: string,
        public abschlussartHilfetext: string,
        public gueltigVon: Date,
        public gueltigBis: Date,
        public ticked: boolean,
    ) {}

    static getDescriptionFromList(abschlussarten: Abschlussart[], id: number) {
        let a = abschlussarten.find((k) => k.abschlussartId == id);
        if (!a) {
            return;
        }
        return a.abschlussartBezeichnung;
    }

    static getIdFromList(abschlussarten: Abschlussart[], bezeichnung: string) {
        let d = new Date();
        let arr = abschlussarten.filter(
            (k) =>
                k.gueltigVon <= d &&
                k.gueltigBis >= d &&
                k.abschlussartBezeichnung == bezeichnung,
        );
        return arr[0].abschlussartId;
    }

    static of(data) {
        if (data == null) {
            return null;
        }

        return new Abschlussart(
            data.abschlussartId,
            data.abschlussartBezeichnung,
            data.abschlussartHilfetext,
            this.parseDate(data.gueltigVon),
            this.parseDate(data.gueltigBis),
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => Abschlussart.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
