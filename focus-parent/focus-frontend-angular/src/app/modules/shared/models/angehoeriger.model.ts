export class Angehoeriger {
    constructor(
        public gueltigVon: Date,
        public gueltigBis: Date,
        public vorname: string,
        public nachname: string,
        public meldendeStelle: string,
        public typ: string,
        public versicherungsnummer: string,
        public anspruchspruefung: boolean,
    ) {}

    static of(data: any): Angehoeriger {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new Angehoeriger(
            new Date(data.gueltigVon),
            new Date(data.gueltigBis),
            data.vorname,
            data.nachname,
            data.meldendeStelle,
            data.typ,
            data.versicherungsnummer,
            data.anspruchspruefung,
        );
    }

    static ofList(data: any[]): Angehoeriger[] {
        if (!data) {
            return null;
        }
        return data.map((d) => Angehoeriger.of(d));
    }
}
