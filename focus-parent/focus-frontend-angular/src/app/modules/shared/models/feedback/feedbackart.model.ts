import { SelectOption } from "../../components/select/selectoption.interface";

export class FeedbackArt implements SelectOption {
    static FeedbackArtOptionen: FeedbackArt[] = [
        new FeedbackArt(0, "Anregung"),
        new FeedbackArt(1, "Beschwerde"),
        new FeedbackArt(2, "Lob"),
    ];
    public label: string;
    public value: FeedbackArt;

    private constructor(
        public id: number,
        public description: string,
        public ticked: boolean = false,
    ) {
        this.value = this;
        this.label = description;
    }

    static getById(id: number): FeedbackArt {
        return this.FeedbackArtOptionen.find((value) => value.id == id);
    }

    static getDescription(id: number) {
        let foundStatus = this.FeedbackArtOptionen.find((s) => s.id === id);
        if (foundStatus != null) {
            return foundStatus.description;
        }
    }

    public static unselectAll(): void {
        this.FeedbackArtOptionen.forEach((option) => (option.ticked = false));
    }
}
