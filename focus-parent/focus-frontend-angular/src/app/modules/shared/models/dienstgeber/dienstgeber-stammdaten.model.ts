import { Adresse } from "../adresse.model";
import { GeldAdresse } from "../geldAdresse.model";
import { FremdId } from "./fremd-id.model";

export class DienstgeberStammdaten {
    constructor(
        public name: string,
        public firmenbuchNr: FremdId,
        public kur: FremdId,
        public uid: FremdId,
        public svtBeitragsKontoNr: string,
        public staatIsoA3: string,
        public gemeindecode: string,
        public gemeinde: string,
        public bundesland: string,
        public polBezirk: string,
        public mailAdresse: string,
        public telefonNummer: string,
        public geldAdressen: GeldAdresse[],
        public adresse: Adresse,
        public pid: string,
        public storniert: boolean,
    ) {}

    static of(data: any): DienstgeberStammdaten {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }

        return new DienstgeberStammdaten(
            data.name,
            FremdId.findLatestValidFremdId(FremdId.ofList(data.firmenbuchNr)),
            FremdId.findLatestValidFremdId(FremdId.ofList(data.kur)),
            FremdId.findLatestValidFremdId(FremdId.ofList(data.uid)),
            data.svtBeitragskontoNr,
            data.staatIsoA3,
            data.gemeindecode,
            data.gemeinde,
            data.bundesland,
            data.polBezirk,
            data.mailAdresse,
            data.telefonNummer,
            GeldAdresse.ofList(data.geldadressen),
            Adresse.of(data.adresse),
            data.parParrolleIDPartner,
            data.storniert,
        );
    }
}
