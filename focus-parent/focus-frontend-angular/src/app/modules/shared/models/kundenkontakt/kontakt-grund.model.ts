import { KontaktDetail } from "./kontakt-detail.model";

export class KontaktGrund {
    constructor(
        public id: number,
        public bezeichnung: string,
        public details?: KontaktDetail[],
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        let details = KontaktDetail.ofList(data.kontaktdetails);

        return new KontaktGrund(
            data.kontaktgrundId,
            data.kontaktgrundBezeichnung,
            details,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KontaktGrund.of(d));
    }
}
