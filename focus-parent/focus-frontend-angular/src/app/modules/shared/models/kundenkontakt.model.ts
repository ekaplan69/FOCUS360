export class Kundenkontakt {
    constructor(
        public kanalId: number,
        public abgabeDurchDritte: boolean,
        public detailId: number[],
        public unterdetailIds: number[],
        public anmerkungGenerell: string,
        public anmerkungSonstigerGrund: string,
        public externeGewaltFreitext: string,
        public artId: number,
        public abschlussartId: number,
        public artFreitext: string,
        public updateCount: number,
        public kontaktPunktId: number,
        public start_ts: Date,
        public ende_ts: Date,
        public id?: number,
    ) {}

    static empty() {
        return new Kundenkontakt(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
        );
    }

    static of(data: any): Kundenkontakt {
        if (!data) {
            return null;
        }
        return new Kundenkontakt(
            data.kanalId,
            data.abgabeDurchDritte,
            data.kontaktRubrikDetailIds,
            data.kontaktDetailDetailIds,
            data.anmerkungGenerell,
            data.anmerkungSonstigerKontaktgrund,
            data.externeGewalt,
            data.kontaktartId,
            data.abschlussartId,
            data.kontaktText,
            data.updateCount,
            data.orgeinheit,
            this.parseDate(data.startTs),
            this.parseDate(data.endeTs),
        );
    }

    static ofList(data: any[]): Kundenkontakt[] {
        if (!data) {
            return null;
        }
        return data.map((d) => Kundenkontakt.of(d));
    }

    static parseDate(externalDate): Date {
        if (!externalDate || externalDate.length < 5) {
            return null;
        }

        let date = new Date();

        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3]);
        date.setMinutes(externalDate[4]);
        if (externalDate[5]) {
            date.setSeconds(externalDate[5]);
        }

        return date;
    }
}
