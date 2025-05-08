export class Aufgabengebiet {
    constructor(
        public aufgabengebietId: number,
        public aufgabengebietBezeichnung: string,
        public aufgabengebietHilfetext: string,
        public gueltigVon: Date,
        public gueltigBis: Date,
        public anzeigeAls: string,
        public subAufgabengebietJN: string,
        public ticked: boolean,
    ) {}

    static getDescriptionFromList(
        aufgabengebiete: Aufgabengebiet[],
        id: number,
    ) {
        if (id === null || aufgabengebiete === null) {
            return "";
        }
        let a = aufgabengebiete.find((k) => k.aufgabengebietId == id);
        return a ? a.aufgabengebietBezeichnung : "";
    }

    static getIdFromList(
        aufgabengebiete: Aufgabengebiet[],
        bezeichnung: string,
    ) {
        let d = new Date();
        let arr = aufgabengebiete.filter(
            (k) =>
                k.gueltigVon <= d &&
                k.gueltigBis >= d &&
                k.aufgabengebietBezeichnung === bezeichnung,
        );
        return arr[0].aufgabengebietId;
    }

    static of(data) {
        if (data == null) {
            return null;
        }

        return new Aufgabengebiet(
            data.aufgabengebietId,
            data.aufgabengebietBezeichnung,
            data.aufgabengebietHilfetext,
            this.parseDate(data.gueltigVon),
            this.parseDate(data.gueltigBis),
            data.anzeigeAls,
            data.subAufgabengebietJN,
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => Aufgabengebiet.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
