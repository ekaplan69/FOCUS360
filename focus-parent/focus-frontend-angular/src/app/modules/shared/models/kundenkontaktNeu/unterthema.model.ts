export class Unterthema {
    constructor(
        public unterthemaId: number,
        public unterthemaBezeichnung: string,
        public ticked: boolean,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        return new Unterthema(
            data.unterthemaId,
            data.unterthemaBezeichnung,
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => Unterthema.of(d));
    }
}
