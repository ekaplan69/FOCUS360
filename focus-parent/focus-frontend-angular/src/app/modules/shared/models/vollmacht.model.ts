export class Vollmacht {
    constructor(
        public name: string,
        public gueltigVon: Date,
        public gueltigBis: Date,
        public artDerVollmacht: string,
        public beziehungsart: string,
    ) {}

    static of(data: any) {
        if (!data) {
            return null;
        }

        return new Vollmacht(
            data.name,
            data.gueltigVon,
            data.gueltigBis,
            data.artDerVollmacht,
            data.beziehungsart,
        );
    }

    static ofList(data: any[]): Vollmacht[] {
        return !data ? null : data.map((d) => Vollmacht.of(d));
    }
}
