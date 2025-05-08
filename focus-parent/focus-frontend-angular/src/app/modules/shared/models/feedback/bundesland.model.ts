export class Bundesland {
    static bundeslandOptions: Bundesland[] = [
        new Bundesland(11, "Wien"),
        new Bundesland(12, "Niederösterreich"),
        new Bundesland(13, "Burgenland"),
        new Bundesland(14, "Oberösterreich"),
        new Bundesland(15, "Steiermark"),
        new Bundesland(16, "Kärnten"),
        new Bundesland(17, "Salzburg"),
        new Bundesland(18, "Tirol"),
        new Bundesland(19, "Vorarlberg"),
    ];

    private constructor(
        public id: number,
        public description: string,
    ) {}

    static getById(id: number) {
        let foundStatus = this.bundeslandOptions.find((s) => s.id === id);
        if (foundStatus != null) {
            return foundStatus.description;
        }
    }
}
