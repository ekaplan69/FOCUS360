export class KontaktArt {
    static artOptions: KontaktArt[] = [
        new KontaktArt(1, "Auskunft und/oder Beratung"),
        new KontaktArt(2, "Antragstellung/Bearbeitung"),
        new KontaktArt(3, "Sonstiges"),
        new KontaktArt(4, "Abgabe"),
    ];

    constructor(
        public id: number,
        public description: string,
    ) {}

    static getById(id: number): KontaktArt {
        this.artOptions.forEach((value) => {
            if (value.id == id) {
                return value;
            }
        });
        return null;
    }

    static getDescription(id: number) {
        let art = this.artOptions.find((a) => a.id == id);

        if (art == null) {
            return null;
        }

        return art.description;
    }

    static getId(description: string) {
        let art = this.artOptions.find((a) => a.description == description);

        if (art == null) {
            return null;
        }

        return art.id;
    }

    static optionsAsListOfStrings() {
        return this.artOptions.map((a) => a.description);
    }
}
