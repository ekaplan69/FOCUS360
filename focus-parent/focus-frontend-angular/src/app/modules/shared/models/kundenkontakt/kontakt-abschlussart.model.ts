export class KontaktAbschlussart {
    constructor(
        public id: number,
        public bezeichnung: string,
        public ticked: boolean,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        return new KontaktAbschlussart(
            data.abschlussartId,
            data.abschlussartBezeichnung,
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KontaktAbschlussart.of(d));
    }
}
