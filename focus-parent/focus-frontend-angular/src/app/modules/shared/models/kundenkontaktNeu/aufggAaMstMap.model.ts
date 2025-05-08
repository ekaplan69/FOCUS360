export class AufggAaMstMap {
    constructor(
        public abschlussartId: number,
        public anzeigenAls: string,
        public aufgabengebietId: number,
        public gueltigVon: Date,
        public gueltigBis: Date,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        return new AufggAaMstMap(
            data.abschlussartId,
            data.anzeigenAls,
            data.aufgabengebietId,
            this.parseDate(data.gueltigVon),
            this.parseDate(data.gueltigBis),
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => AufggAaMstMap.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
