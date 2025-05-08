import { KontaktUnterDetail } from "./kontakt-unter-detail.model";

export class KontaktDetail {
    constructor(
        public id: number,
        public bezeichnung: string,
        public hilfetext: string,
        public unterDetails: KontaktUnterDetail[],
        public ticked: boolean,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        let unterdetails = KontaktUnterDetail.ofList(data.unterdetails);

        return new KontaktDetail(
            data.kontaktdetailId,
            data.kontaktdetailBezeichnung,
            data.kontaktdetailHilfetext,
            unterdetails,
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KontaktDetail.of(d));
    }
}
