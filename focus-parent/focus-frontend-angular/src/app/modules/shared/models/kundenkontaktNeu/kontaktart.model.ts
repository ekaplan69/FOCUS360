import { SelectOption } from "../../components/select/selectoption.interface";

export class Kontaktart implements SelectOption {
    public label: string;
    public value: SelectOption;

    constructor(
        public kontaktartId: number,
        public kontaktartBezeichnung: string,
        public kontaktartHilfetext: string,
        public gueltigVon: Date,
        public gueltigBis: Date,
        public ticked: boolean,
    ) {
        this.value = this;
        this.label = kontaktartBezeichnung;
    }

    static getDescriptionFromList(kontaktarten: Kontaktart[], id: number) {
        let k = kontaktarten.find((k) => k.kontaktartId == id);
        if (!k) {
            return;
        }
        return k.kontaktartBezeichnung;
    }

    static getIdFromList(kontaktarten: Kontaktart[], bezeichnung: string) {
        let d = new Date();
        let arr = kontaktarten.filter(
            (k) =>
                k.gueltigVon <= d &&
                k.gueltigBis >= d &&
                k.kontaktartBezeichnung == bezeichnung,
        );
        return arr[0].kontaktartId;
    }

    static of(data) {
        if (data == null) {
            return null;
        }

        return new Kontaktart(
            data.kontaktartId,
            data.kontaktartBezeichnung,
            data.kontaktartHilfetext,
            this.parseDate(data.gueltigVon),
            this.parseDate(data.gueltigBis),
            false,
        );
    }

    static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => Kontaktart.of(d));
    }

    static parseDate(externalDate): Date {
        let date = new Date();
        date.setFullYear(externalDate[0], externalDate[1] - 1, externalDate[2]);
        date.setHours(externalDate[3], externalDate[4]);
        return date;
    }
}
