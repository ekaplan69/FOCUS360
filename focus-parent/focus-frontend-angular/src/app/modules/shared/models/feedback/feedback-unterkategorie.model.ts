import { SelectOption } from "../../components/select/selectoption.interface";
import { FeedbackGrund } from "./feedback-grund.model";

export class FeedbackUnterkategorie implements SelectOption {
    constructor(
        id: number,
        themaId: number,
        bezeichnung: string,
        gueltigVon: Date,
        gueltigBis: Date,
    ) {
        this._id = id;
        this._themaId = themaId;
        this._bezeichnung = bezeichnung;
        this._gueltigVon = gueltigVon;
        this._gueltigBis = gueltigBis;
        this._gruende = [];
        this._label = bezeichnung;
        this._value = this;
    }

    private _bezeichnung: string;

    get bezeichnung(): string {
        return this._bezeichnung;
    }

    private _gruende: FeedbackGrund[] = [];

    get gruende(): FeedbackGrund[] {
        return this._gruende;
    }

    set gruende(value: FeedbackGrund[]) {
        this._gruende = value;
    }

    private _gueltigBis: Date;

    get gueltigBis(): Date {
        return this._gueltigBis;
    }

    private _gueltigVon: Date;

    get gueltigVon(): Date {
        return this._gueltigVon;
    }

    private _id: number;

    get id(): number {
        return this._id;
    }

    private _label: string;

    get label(): string {
        return this._label;
    }

    set label(value: string) {
        this._label = value;
    }

    private _themaId: number;

    get themaId(): number {
        return this._themaId;
    }

    private _value: FeedbackUnterkategorie;

    get value(): FeedbackUnterkategorie {
        return this._value;
    }

    set value(value: FeedbackUnterkategorie) {
        this._value = value;
    }

    public static compareSelect(
        o1: FeedbackUnterkategorie,
        o2: FeedbackUnterkategorie,
    ): boolean {
        if (o1 == null || o2 == null) {
            return false;
        }
        return o1.id === o2.id;
    }

    public static of(data) {
        if (data == null) {
            return null;
        }

        return new FeedbackUnterkategorie(
            data.id,
            data.themaId,
            data.bezeichnung,
            this.parseDateArray(data.gueltigVon),
            this.parseDateArray(data.gueltigBis),
        );
    }

    public static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => FeedbackUnterkategorie.of(d));
    }

    public static ofMap(data) {
        if (data == null) {
            return null;
        }
        let map = new Map<number, FeedbackUnterkategorie>();
        data.forEach((value) => {
            let fbk = this.of(value);
            map.set(fbk.id, fbk);
        });
        return map;
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

    public toString = (): string => {
        return this._bezeichnung;
    };
}
