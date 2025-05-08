export class PersonDetailSearchResult {
    constructor(
        public fachschluessel: string,
        public vorname: string,
        public nachname: string,
        public orgName: string,
        public geburtsdatum: Date,
        public adresse: string,
        public prid: string,
    ) {}

    static of(data: any) {
        if (!data) {
            return null;
        }

        return new PersonDetailSearchResult(
            data.fachschluessel,
            data.vorname,
            data.nachname,
            data.orgName,
            data.geburtsdatum,
            data.adresse + " " + data.ort + " " + data.plz,
            data.prid,
        );
    }

    static ofList(data: any) {
        if (!data) {
            return null;
        }

        return data.map((n) => PersonDetailSearchResult.of(n));
    }
}
