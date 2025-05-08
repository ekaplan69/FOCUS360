import { SelectOption } from "../../components/select/selectoption.interface";
import { FeedbackGrund } from "./feedback-grund.model";
import { FeedbackUnterkategorie } from "./feedback-unterkategorie.model";

export class FeedbackThema implements SelectOption {
    public gruende: FeedbackGrund[] = [];
    public gueltigBis: Date;
    public gueltigVon: Date;
    public ktThemaId: number;
    public label: string;
    public value: FeedbackThema;
    public themaBezeichnung: string;
    public themaId: number;
    public unterkategorien: FeedbackUnterkategorie[] = [];

    constructor(
        themaId: number,
        ktThemaId: number,
        themaBezeichnung: string,
        gueltigVon: Date,
        gueltigBis: Date,
    ) {
        this.themaId = themaId;
        this.ktThemaId = ktThemaId;
        this.themaBezeichnung = themaBezeichnung;
        this.gueltigVon = gueltigVon;
        this.gueltigBis = gueltigBis;
        this.unterkategorien = [];
        this.gruende = [];
        this.label = themaBezeichnung;
        this.value = this;
    }

    public static of(data) {
        if (data == null) {
            return null;
        }

        return new FeedbackThema(
            data.themaId,
            data.ktThemaId,
            data.themaBezeichnung,
            this.parseDateArray(data.gueltigVon),
            this.parseDateArray(data.gueltigBis),
        );
    }

    public static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => FeedbackThema.of(d));
    }

    private static parseDateArray(dateArray): Date {
        return new Date(
            dateArray[0],
            dateArray[1] - 1,
            dateArray[2],
            dateArray[3],
            dateArray[4],
            0,
            0,
        );
    }
}
