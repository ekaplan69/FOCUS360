export class KontaktUnterDetail {
    constructor(
        public id: number,
        public bezeichnung: string,
        public hilfetext: string,
        public ticked?: boolean,
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        return new KontaktUnterDetail(
            data.unterdetailId,
            data.unterdetailBezeichnung,
            data.unterdetailHilfetext,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => KontaktUnterDetail.of(d));
    }
}
