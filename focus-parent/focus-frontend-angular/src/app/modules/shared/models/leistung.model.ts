import { BetreuungsZeiten } from "./betreuungsZeiten.model";

export class Leistung {
    constructor(
        public hbhm?: {
            status: string;
            verordnungsDat: Date;
        },
        public vwst?: {
            gueltigBisDat: Date;
            leistungsType: string;
        }[],
        public unfallerh?: {
            eingelangtDat: Date;
            erstellDat: Date;
            urgenz1Dat: Date;
            urgenz2Dat: Date;
        },
        public ekos?: {
            antragStatus: string;
            eingelangtDat: Date;
        },
        public medSt?: {
            gueltigBisDat: Date;
            lgebiet: string;
            stellungnahme: string;
        }[],
        public frt?: {
            status: string;
            transportDat: Date;
        },
        public wazaKo?: {
            status: string;
            antragDat: Date;
        },
        public auMhRgWeg?: {
            anweisungsDat: Date;
            lvonDat: Date;
            lbisDat: Date;
            lgebiet: string;
            status: string;
        },
        public kh?: {
            aufnahmeArt: string;
            lvonDat: Date;
            lbisDat: Date;
            leName: string;
            vpnr: string;
        },
        public wahWaza?: {
            behDat: Date;
            lgebiet: string;
            status: string;
        },
        public betreute?: BetreuungsZeiten[],
        public lohnPf?: {
            lohnpfaendung: boolean;
        },
        public gbs?: {
            befreiung: string;
            befreiungsgrund: string;
            lvonDat: Date;
            lbisDat: Date;
        }[],
    ) {}

    static of(data) {
        if (data == null) {
            return null;
        }

        let leistung = new Leistung();

        if (data.gbs) {
            leistung.gbs = [];
            for (let g of data.gbs) {
                leistung.gbs.push({
                    befreiung: g.befreiung,
                    befreiungsgrund: g.befreiungsgrund,
                    lvonDat: this.parseDate(g.gueltigVon),
                    lbisDat: this.parseDate(g.gueltigBis),
                });
            }
        }

        if (data.hbhm) {
            leistung.hbhm = {
                status: data.hbhm.status,
                verordnungsDat: this.parseDate(data.hbhm.verordnungsDat),
            };
        }

        if (data.vwst) {
            leistung.vwst = [];
            for (let v of data.vwst) {
                leistung.vwst.push({
                    gueltigBisDat: this.parseDate(v.gueltigBisDat),
                    leistungsType: v.leistungsType,
                });
            }
        }

        if (data.unfallerh) {
            leistung.unfallerh = {
                eingelangtDat: this.parseDate(data.unfallerh.eingelangtDat),
                erstellDat: this.parseDate(data.unfallerh.erstellDat),
                urgenz1Dat: this.parseDate(data.unfallerh.urgenz1Dat),
                urgenz2Dat: this.parseDate(data.unfallerh.urgenz2Dat),
            };
        }

        if (data.ekos) {
            leistung.ekos = {
                eingelangtDat: this.parseDate(data.ekos.eingelangtDat),
                antragStatus: data.ekos.antragStatus,
            };
        }

        if (data.medSt) {
            leistung.medSt = [];
            for (let m of data.medSt) {
                leistung.medSt.push({
                    gueltigBisDat: this.parseDate(m.gueltigBisDat),
                    stellungnahme: m.stellungnahme,
                    lgebiet: m.lgebiet,
                });
            }
        }

        if (data.frt) {
            leistung.frt = {
                status: data.frt.status,
                transportDat: this.parseDate(data.frt.transportDat),
            };
        }

        if (data.wazaKo) {
            leistung.wazaKo = {
                status: data.wazaKo.status,
                antragDat: this.parseDate(data.wazaKo.antragDat),
            };
        }

        if (data.auMhRgWeg) {
            leistung.auMhRgWeg = {
                lgebiet: data.auMhRgWeg.lgebiet,
                lvonDat: this.parseDate(data.auMhRgWeg.lvonDat),
                lbisDat: this.parseDate(data.auMhRgWeg.lbisDat),
                anweisungsDat: this.parseDate(data.auMhRgWeg.anweisungsDat),
                status: data.auMhRgWeg.status,
            };
        }

        if (data.kh) {
            leistung.kh = {
                aufnahmeArt: data.kh.aufnahmeArt,
                lvonDat: this.parseDate(data.kh.lvonDat),
                lbisDat: this.parseDate(data.kh.lbisDat),
                leName: data.kh.leName,
                vpnr: data.kh.vpnr,
            };
        }

        if (data.wahWaza) {
            leistung.wahWaza = {
                lgebiet: data.wahWaza.lgebiet,
                status: data.wahWaza.status,
                behDat: this.parseDate(data.wahWaza.behDat),
            };
        }

        if (data.betreute) {
            leistung.betreute = [];
            for (let b of data.betreute) {
                leistung.betreute.push(
                    new BetreuungsZeiten(
                        this.parseDate(b.betreuungVon),
                        this.parseDate(b.betreuungBis),
                        b.landesstelle,
                        b.status,
                    ),
                );
            }
        }

        if (data.lohnPf) {
            leistung.lohnPf = {
                lohnpfaendung: data.lohnPf.lohnpfaendung,
            };
        }

        return leistung;
    }

    static parseDate(externalDate): Date {
        if (
            !externalDate ||
            externalDate.length < 3 ||
            externalDate[0] === 1800
        ) {
            return null;
        }

        const date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);

        if (externalDate.length >= 5) {
            date.setHours(externalDate[3]);
            date.setMinutes(externalDate[4]);
            if (externalDate[5]) {
                date.setSeconds(externalDate[5]);
            }
        }

        return date;
    }
}
