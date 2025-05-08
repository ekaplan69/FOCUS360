import { KontaktArt } from "../kundenkontakt/kontakt-art.model";
import { FeedbackArt } from "./feedbackart.model";

export class FeedbackKurz {
    erstellDatum: Date;
    erstellDatumBez: string;
    feedbackArtBezeichnung: string;
    grundBezeichnung: string;
    id: number;
    kontaktArtBezeichnung: string;
    themaBezeichnung: string;
    unterkategorieBezeichnung: string;

    constructor(
        id: number,
        feedbackArtBezeichnung: string,
        kontaktArtBezeichnung: string,
        themaBezeichnung: string,
        unterkategorieBezeichnung: string,
        grundBezeichnung: string,
        erstellDatum: Date,
        erstellDatumBez: string,
    ) {
        this.id = id;
        this.kontaktArtBezeichnung = kontaktArtBezeichnung;
        this.feedbackArtBezeichnung = feedbackArtBezeichnung;
        this.themaBezeichnung = themaBezeichnung;
        this.unterkategorieBezeichnung = unterkategorieBezeichnung;
        this.grundBezeichnung = grundBezeichnung;
        this.erstellDatum = erstellDatum;
        this.erstellDatumBez = erstellDatumBez;
    }

    public static of(data) {
        if (data == null) {
            return null;
        }

        return new FeedbackKurz(
            data.id,
            FeedbackArt.getDescription(data.feedbackartId),
            KontaktArt.getDescription(data.kontaktartId),
            data.themaBezeichnung,
            data.unterkategorieBezeichnung,
            data.feedbackgrundBezeichnung,
            this.parseDateArray(data.erstellTs),
            this.parseDateArrayToString(data.erstellTs),
        );
    }

    public static ofList(data) {
        if (data == null) {
            return null;
        }

        return data.map((d) => FeedbackKurz.of(d));
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

    private static parseDateArrayToString(dateArray): string {
        return dateArray[2] + "." + dateArray[1] + "." + dateArray[0];
    }
}
