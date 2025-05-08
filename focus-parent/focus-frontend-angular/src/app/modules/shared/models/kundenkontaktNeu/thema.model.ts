export class Thema {
    constructor(
        public themaId: number,
        public themaBezeichnung: string,
        public themaHilfetext: string,
        public gueltigVon: Date,
        public gueltigBis: Date,
        public ticked: boolean,
    ) {}

    static getDescriptionFromList(themen: Thema[], id: number) {
        let t = themen.find((k) => k.themaId == id);
        if (!t) {
            return;
        }
        return t.themaBezeichnung;
    }

    static of(data) {
        if (data == null) {
            return null;
        }

        return new Thema(
            data.themaId,
            data.themaBezeichnung,
            data.themaHilfetext,
            this.parseDate(data.gueltigVon),
            this.parseDate(data.gueltigBis),
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => Thema.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
