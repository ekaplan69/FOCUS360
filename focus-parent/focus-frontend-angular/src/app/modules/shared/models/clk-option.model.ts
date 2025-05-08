export class ClkOptionModel {
    constructor(
        public fachschluessel,
        public fachschluesselArt,
    ) {}

    static of(data: any) {
        if (!data) {
            return null;
        }

        return new ClkOptionModel(data.fachschluessel, data.fachschluesselArt);
    }

    static ofList(data: any) {
        if (!data) {
            return null;
        }

        return data.map((o) => ClkOptionModel.of(o));
    }
}
