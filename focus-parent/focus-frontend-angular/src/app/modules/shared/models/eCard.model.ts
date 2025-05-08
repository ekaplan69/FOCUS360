export class ECard {
    constructor(
        public ausstellungsDatum: Date,
        public letzteKonsultationDatum: Date,
        public laufNummer: number,
        public endeDatum: Date,
    ) {}

    static of(data: any): ECard {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new ECard(
            data.ausstellungsDatum === null
                ? null
                : new Date(data.ausstellungsDatum),
            data.letzteKonsultation === null
                ? null
                : new Date(data.letzteKonsultation),
            data.laufnummer,
            data.endeDatum === null ? null : new Date(data.endeDatum),
        );
    }
}
