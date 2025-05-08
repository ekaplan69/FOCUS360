import { SelectOption } from "../../components/select/selectoption.interface";

export class FeedbackGrund implements SelectOption {
    constructor(
        id: number,
        bezeichnung: string,
        gueltigBis: Date,
        gueltigVon: Date,
    ) {
        this._id = id;
        this._bezeichnung = bezeichnung;
        this._gueltigBis = gueltigBis;
        this._gueltigVon = gueltigVon;
        this._label = bezeichnung;
        this._value = this;
    }

    private _bezeichnung: string;

    get bezeichnung(): string {
        return this._bezeichnung;
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

    private _value: FeedbackGrund;

    get value(): FeedbackGrund {
        return this._value;
    }

    set value(value: FeedbackGrund) {
        this._value = value;
    }

    public static of(data) {
        if (data == null) {
            return null;
        }

        return new FeedbackGrund(
            data.id,
            data.bezeichnung,
            this.parseDateArray(data.gueltigBis),
            this.parseDateArray(data.gueltigVon),
        );
    }

    public static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => FeedbackGrund.of(d));
    }

    public static ofMap(data) {
        if (data == null) {
            return null;
        }

        let map = new Map<number, FeedbackGrund>();
        data.forEach((value) => {
            let fbg = this.of(value);
            map.set(fbg.id, fbg);
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

    public equals(obj: FeedbackGrund): boolean {
        return obj.id === this.id;
    }
}
