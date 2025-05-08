import { Adresse } from "./adresse.model";
import { GeldAdresse } from "./geldAdresse.model";
import { Vollmacht } from "./vollmacht.model";

export class Stammdaten {
    constructor(
        public adresse: Adresse,
        public geburtsDatum: Date,
        public bestaetigtesSterbeDat: Date,
        public geldAdressen: GeldAdresse[],
        public geschlecht: string,
        public zustimmungSUEN: boolean,
        public gesetzlichVertreten: boolean,
        public auskunftsSperre: boolean,
        public andererMitarbeiter: boolean,
        public staatIsoA3: string,
        public staat: string,
        public strasse: string,
        public hausnummer: string,
        public gemeindecode: string,
        public gemeinde: string,
        public bundesland: string,
        public polBezirk: string,
        public auskunftsSperreGruende: String[],
        public mailAdresse: string,
        public name: string,
        public nameOhneAnrede: string,
        public nameFamiliennameGross: string,
        public vorname: string,
        public familienname: string,
        public anrede: string,
        public telefonNummer: string,
        public pid: string,
        public vollmachten: Vollmacht[],
        public gueltigeVSNR: string[],
        public storniert: boolean,
        public ppid?: string,
    ) {}

    static of(data: any): Stammdaten {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new Stammdaten(
            Adresse.of(data.adresse),
            data.geburtsDatum ? new Date(data.geburtsDatum) : null,
            data.bestaetigtesSterbeDat
                ? new Date(data.bestaetigtesSterbeDat)
                : null,
            GeldAdresse.ofList(data.geldAdressen),
            data.geschlecht,
            data.zustimmungSUEN,
            data.gesetzlichVertreten,
            data.auskunftsSperre,
            data.andererMitarbeiter,
            data.staatIsoA3,
            data.staat,
            data.strasse,
            data.hausnummer,
            data.gemeindecode,
            data.gemeinde,
            data.bundesland,
            data.polBezirk,
            data.auskunftsSperreGruende,
            data.mailAdresse,
            data.name,
            data.nameOhneAnrede,
            data.nameFamiliennameGross,
            data.vorname,
            data.familienname,
            data.anrede,
            data.telefonNummer,
            data.partnerVersicherterRolleId != null
                ? data.partnerVersicherterRolleId
                : data.partnerBetreuterRolleId,
            data.vollmachten,
            data.gueltigeVSNR,
            data.storniert,
            data.parParrolleIDPartnerrolle,
        );
    }

    getFullName() {
        return this.anrede + " " + this.vorname + " " + this.familienname;
    }

    getFullNameFamiliennameGross() {
        return (
            this.anrede +
            " " +
            this.vorname +
            " " +
            this.familienname.toUpperCase()
        );
    }

    getNachname() {
        return this.familienname;
    }

    getNameOhneAnrede() {
        return this.vorname + " " + this.familienname;
    }

    getNameOhneAnredeFamiliennameGross() {
        return this.vorname + " " + this.familienname.toUpperCase();
    }

    getVorname() {
        return this.vorname;
    }
}
