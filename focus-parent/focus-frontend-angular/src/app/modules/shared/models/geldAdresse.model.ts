export class GeldAdresse {
    constructor(
        public iban?: string,
        public bic?: string,
        public verwendungsartKurz?: string,
        public institut?: string,
    ) {}

    static of(data: any): GeldAdresse {
        if (!data) {
            return null;
        }

        return new GeldAdresse(
            data.iban,
            data.bic,
            data.verwendungsartKurz,
            data.institut,
        );
    }

    static ofList(data: any[]): GeldAdresse[] {
        if (!data) {
            return null;
        }
        return data.map((d) => GeldAdresse.of(d));
    }
}
