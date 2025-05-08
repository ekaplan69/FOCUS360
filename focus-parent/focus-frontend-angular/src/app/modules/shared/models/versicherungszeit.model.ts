export class Versicherungszeit {
    constructor(
        public meldendeStelle: string,
        public beginnDatum: Date,
        public endeDatum: Date,
        public qualifikation: string,
        public dienstgebername: string,
    ) {}

    static convertEndeDatum(endDate: Date) {
        if (endDate.getFullYear() == 9999) {
            return null;
        } else {
            return endDate;
        }
    }

    static of(data: any): Versicherungszeit {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new Versicherungszeit(
            data.meldendeStelle,
            new Date(data.beginnDatum),
            this.convertEndeDatum(new Date(data.endeDatum)),
            data.qualifikation,
            data.dienstgebername,
        );
    }

    static ofList(data: any[]): Versicherungszeit[] {
        if (!data) {
            return null;
        }
        return data.map((d) => Versicherungszeit.of(d));
    }
}
