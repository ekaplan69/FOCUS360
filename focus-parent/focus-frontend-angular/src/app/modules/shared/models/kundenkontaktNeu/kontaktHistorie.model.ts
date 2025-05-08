export class KontaktHistorie {
    constructor(public fachschluessel: string) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        return new KontaktHistorie(data.fachschluessel);
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KontaktHistorie.of(d));
    }
}
