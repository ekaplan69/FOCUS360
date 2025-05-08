export class Betreuungszeit {
    constructor(
        public beginn: Date,
        public ende: Date,
        public betreuendeStelle: string,
    ) {}

    static of(data: any): Betreuungszeit {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new Betreuungszeit(
            new Date(data.beginn),
            new Date(data.ende),
            data.betreuendeStelle,
        );
    }
}
