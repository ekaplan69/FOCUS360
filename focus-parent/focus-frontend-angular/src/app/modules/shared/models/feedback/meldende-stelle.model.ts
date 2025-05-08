export class MeldendeStelle {
    static data = [
        new MeldendeStelle(1, "Bürgerbüro der Landesregierung"),
        new MeldendeStelle(2, "Arbeiterkammer"),
        new MeldendeStelle(3, "Ärztekammer"),
        new MeldendeStelle(
            4,
            "Bundesministerium f. Arbeit, Soziales und Gesundheit",
        ),
        new MeldendeStelle(5, "Kronen Zeitung Ombudsstelle"),
        new MeldendeStelle(6, "Patienten- und Pflegeanwaltschaft"),
        new MeldendeStelle(7, "Volksanwaltschaft"),
        //1 bis 7 = Werte alt um die Daten von Entw nicht unbrauchbar zu machen bis auf DB zugegriffen wird
        new MeldendeStelle(8, "Rechtsanwaltskanzlei"),
        new MeldendeStelle(9, "Ombudsstelle"),
        new MeldendeStelle(11, "Bürgerbüro der Landesregierung"),
        new MeldendeStelle(12, "Arbeiterkammer"),
        new MeldendeStelle(13, "Ärztekammer"),
        new MeldendeStelle(
            14,
            "Bundesministerium f. Arbeit, Soziales und Gesundheit",
        ),
        new MeldendeStelle(15, "Kronen Zeitung Ombudsstelle"),
        new MeldendeStelle(16, "Patienten- und Pflegeanwaltschaft"),
        new MeldendeStelle(17, "Volksanwaltschaft"),
    ];

    constructor(
        public id: number,
        public bezeichnung: string,
    ) {}

    static findBezeichnung(id: number) {
        let m = this.data.find((d) => d.id === id);

        if (m == null) {
            return null;
        }

        return m.bezeichnung;
    }

    static findId(bezeichnung: string) {
        let m = this.data
            .filter((m) => m.id > 7)
            .find((d) => d.bezeichnung === bezeichnung);

        if (m == null) {
            return null;
        }

        return m.id;
    }
}
