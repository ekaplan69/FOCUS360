export class FremdId {
    constructor(
        public fs: string,
        public fsArt: string,
        public fsArtKurz: string,
        public gueltigVon: Date,
        public gueltigBis: Date,
    ) {}

    static findLatestValidFremdId(fremdIdList: FremdId[]): FremdId {
        let latestValid;
        let latestBisDate;

        if (fremdIdList == null || fremdIdList.length == 0) {
            return null;
        }

        return fremdIdList.reduce((a, b) => {
            if (a.gueltigBis == null) {
                return a;
            }
            if (b.gueltigBis == null) {
                return b;
            }

            return a.gueltigBis.getTime() >= b.gueltigBis.getTime() ? a : b;
        });
    }

    static of(data: any): FremdId {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }

        return new FremdId(
            data.fachschluessel,
            data.fachschluesselArt,
            data.fachschluesselArtKurz,
            new Date(data.gueltigVon),
            new Date(data.gueltigBis),
        );
    }

    static ofList(data: any): FremdId[] {
        if (!data) {
            return null;
        }

        return data.map((d) => FremdId.of(d));
    }
}
