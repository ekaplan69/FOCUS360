export class BetreuungsZeiten {
    constructor(
        public betreuungVon: Date,
        public betreuungBis: Date,
        public landesstelle: number,
        public status: string,
    ) {}

    static of(data: any): BetreuungsZeiten {
        if (!data) {
            return null;
        }
        return new BetreuungsZeiten(
            data.betreuungVon,
            data.betreuungBis,
            data.landesstelle,
            data.status,
        );
    }
}
