export class ReleasenoteModel {
    constructor(
        releaseDate: Date,
        releaseNr: string,
        kind: string,
        group: string,
        description: string,
    ) {
        this._releaseDate = releaseDate;
        this._releaseNr = releaseNr;
        this._description = description;
        this._group = group;
        this._kind = kind;
    }

    private _description: string;

    get description(): string {
        return this._description;
    }

    set description(value: string) {
        this._description = value;
    }

    private _group: string;

    get group(): string {
        return this._group;
    }

    private _kind: string;

    get kind(): string {
        return this._kind;
    }

    private _releaseDate: Date;

    get releaseDate(): Date {
        return this._releaseDate;
    }

    private _releaseNr: string;

    get releaseNr(): string {
        return this._releaseNr;
    }
}
