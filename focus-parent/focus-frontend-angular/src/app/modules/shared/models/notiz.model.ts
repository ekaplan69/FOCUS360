export class Notiz {
    constructor(
        public text?: string,
        public updateCount?: number,
    ) {}

    static of(data: any): Notiz {
        if (!data) {
            return null;
        }
        return new Notiz(data.text, data.updateCount);
    }

    static ofList(data: any[]): Notiz[] {
        if (!data) {
            return null;
        }
        return data.map((d) => Notiz.of(d));
    }
}
