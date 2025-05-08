export class Adresse {
    constructor(
        public anschrift?: string,
        public plz?: string,
        public ort?: string,
    ) {}

    static of(data: any): Adresse {
        if (!data) {
            return null;
        }
        return new Adresse(data.anschrift, data.plz, data.ort);
    }
}
