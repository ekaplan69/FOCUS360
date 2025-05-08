export class Fachschluessel {
    constructor(
        public fachschluessel?: string,
        public fachschluesselArt?: string,
    ) {}

    static of(
        fachschluesselString: string,
        fachschluesselArt?: string,
    ): Fachschluessel {
        if (fachschluesselString == null) {
            return null;
        }

        if (fachschluesselArt == null) {
            if (fachschluesselString.length === 9) {
                fachschluesselArt = "DGNR";
            } else if (fachschluesselString.length === 10) {
                if (fachschluesselString.startsWith("0")) {
                    fachschluesselArt = "BTNR";
                } else {
                    fachschluesselArt = "VSNR";
                }
            }
        }

        return new Fachschluessel(fachschluesselString, fachschluesselArt);
    }
}
