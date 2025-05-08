export class AufggSubMap {
    constructor(
        public id: number,
        public aufgabengebietId: number,
        public subAufgabengebietId: number,
        public gueltigVon: Date,
        public gueltigBis: Date,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        return new AufggSubMap(
            data.id,
            data.aufgabengebietId,
            data.subAufgabengebietId,
            this.parseDate(data.gueltigVon),
            this.parseDate(data.gueltigBis),
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => AufggSubMap.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
