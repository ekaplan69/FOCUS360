export class ErrorMeldung {
    constructor(
        public fehlerId: string,
        public fehlerkategorie: string,
        public meldungstext: string,
        public open?: boolean,
    ) {
        this.open = false;
    }

    static of(data: any): ErrorMeldung {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new ErrorMeldung(
            data.fehlerId,
            data.fehlerkategorie,
            data.meldungstext,
        );
    }

    hasMeldungsText() {
        return this.meldungstext != null;
    }

    toggleOpenIfHasMeldungsText() {
        if (!this.hasMeldungsText()) {
            return;
        }
        this.open = !this.open;
    }
}
