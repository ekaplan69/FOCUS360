export class FeedbackLang {
    constructor(
        id: number,
        kontaktArt: number,
        mitarbeiterOE: string,
        feedbackArt: number,
        status: number,
        fachschluessel: string,
        beschreibung: string,
        verbesserung: string,
        erstellDatum: Date,
        grund: number,
        fullName: string,
        thema: number,
        unterkategorie: number,
        fachschluesselArt: string,
        updatecount: number,
    ) {
        this._id = id;
        this._mitarbeiterOE = mitarbeiterOE;
        this._kontaktArt = kontaktArt;
        this._feedbackArt = feedbackArt;
        this._status = status;
        this._fachschluessel = fachschluessel;
        this._beschreibung = beschreibung;
        this._erstellDatum = erstellDatum;
        this._grundId = grund;
        this._fullName = fullName;
        this._themaId = thema;
        this._unterkategorieId = unterkategorie;
        this._fachschluesselArt = fachschluesselArt;
        this._updatecount = updatecount;
        this._verbesserung = verbesserung;
    }

    private _beschreibung: string;

    get beschreibung(): string {
        return this._beschreibung;
    }

    set beschreibung(value: string) {
        this._beschreibung = value;
    }

    private _erstellDatum: Date;

    get erstellDatum(): Date {
        return this._erstellDatum;
    }

    private _fachschluessel: string;

    get fachschluessel(): string {
        return this._fachschluessel;
    }

    set fachschluessel(value: string) {
        this._fachschluessel = value;
    }

    private _fachschluesselArt: string;

    get fachschluesselArt(): string {
        return this._fachschluesselArt;
    }

    set fachschluesselArt(value: string) {
        this._fachschluesselArt = value;
    }

    private _feedbackArt: number;

    get feedbackArt(): number {
        return this._feedbackArt;
    }

    set feedbackArt(value: number) {
        this._feedbackArt = value;
    }

    private _fullName: string;

    get fullName(): string {
        return this._fullName;
    }

    set fullName(value: string) {
        this._fullName = value;
    }

    private _grundId: number;

    get grundId(): number {
        return this._grundId;
    }

    set grundId(value: number) {
        this._grundId = value;
    }

    private _id: number;

    get id(): number {
        return this._id;
    }

    private _kontaktArt: number;

    get kontaktArt(): number {
        return this._kontaktArt;
    }

    set kontaktArt(value: number) {
        this._kontaktArt = value;
    }

    private _mitarbeiterOE: string;

    get mitarbeiterOE(): string {
        return this._mitarbeiterOE;
    }

    set mitarbeiterOE(value: string) {
        this._mitarbeiterOE = value;
    }

    private _status: number;

    get status(): number {
        return this._status;
    }

    set status(value: number) {
        this._status = value;
    }

    private _themaId: number;

    get themaId(): number {
        return this._themaId;
    }

    set themaId(value: number) {
        this._themaId = value;
    }

    private _unterkategorieId: number;

    get unterkategorieId(): number {
        return this._unterkategorieId;
    }

    set unterkategorieId(value: number) {
        this._unterkategorieId = value;
    }

    private _updatecount: number;

    get updatecount(): number {
        return this._updatecount;
    }

    private _verbesserung: string;

    get verbesserung(): string {
        return this._verbesserung;
    }

    set verbesserung(value: string) {
        this._verbesserung = value;
    }

    public static createFeedbackLang(feedback: FeedbackLang) {
        return new FeedbackLang(
            feedback.id,
            feedback.kontaktArt,
            feedback.mitarbeiterOE,
            feedback.feedbackArt,
            feedback.status,
            feedback.fachschluessel,
            feedback.beschreibung,
            feedback.verbesserung,
            feedback.erstellDatum,
            feedback.grundId,
            feedback.fullName,
            feedback.themaId,
            feedback.unterkategorieId,
            feedback.fachschluesselArt,
            feedback.updatecount,
        );
    }

    static empty(): FeedbackLang {
        return new FeedbackLang(
            null,
            null,
            null,
            null,
            null,
            "",
            "",
            "",
            new Date(),
            null,
            "",
            null,
            null,
            "",
            0,
        );
    }

    public static of(data) {
        if (data == null) {
            return null;
        }
        return new FeedbackLang(
            data.id,
            data.kontaktartId,
            data.mitarbeiterOE,
            data.feedbackArt,
            data.statusId,
            data.fachschluessel,
            data.beschreibung,
            data.verbesserungspotential,
            this.parseDateArray(data.erstellTs),
            data.feedbackgrundId,
            data.name,
            data.themaId,
            data.unterkategorieId,
            data.fachschluesselArtKurz,
            data.updatecount,
        );
    }

    public static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => FeedbackLang.of(d));
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

    public copyValues(feedback: FeedbackLang) {
        feedback.mitarbeiterOE = this.mitarbeiterOE;
        feedback.themaId = this.themaId;
        feedback.unterkategorieId = this.unterkategorieId;
        feedback.kontaktArt = this.kontaktArt;
        feedback.grundId = this.grundId;
        feedback.verbesserung = this.verbesserung;
        feedback.beschreibung = this.beschreibung;
        feedback.feedbackArt = this.feedbackArt;
        feedback.fullName = this.fullName;
        feedback.status = this.status;
    }
}
