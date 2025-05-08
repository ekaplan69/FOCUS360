export class GebuehrenBefreiung {
    constructor(
        public befreiung: string,
        public befreiungsgrund: string,
    ) {}

    static of(data: any): GebuehrenBefreiung {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }

        return new GebuehrenBefreiung(data.befreiung, data.befreiungsgrund);
    }

    static ofList(data: any[]): GebuehrenBefreiung[] {
        if (!data) {
            return null;
        }
        return data.map((d) => GebuehrenBefreiung.of(d));
    }
}
