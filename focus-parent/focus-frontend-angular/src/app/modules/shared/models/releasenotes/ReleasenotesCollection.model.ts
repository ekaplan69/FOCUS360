import { ReleasenoteModel } from "./releasenote.model";

export class ReleasenotesCollectionModel {
    private readonly _releasenotes: ReleasenoteModel[];

    constructor(releasenotes?: ReleasenoteModel[]) {
        this._releasenotes = releasenotes ? releasenotes : [];
    }

    get releasenotes(): ReleasenoteModel[] {
        return this._releasenotes;
    }

    public getReleasenotesByReleaseNr(releaseNr: string) {
        return this._releasenotes.filter(
            (value) => value.releaseNr == releaseNr,
        );
    }

    public getVersionList(): string[] {
        let releasenumbers = [];

        this._releasenotes.forEach((value) =>
            releasenumbers.push(value.releaseNr),
        );

        // filter Array to only get uniques
        return releasenumbers.filter(
            (value, index) => releasenumbers.indexOf(value) === index,
        );
    }
}
