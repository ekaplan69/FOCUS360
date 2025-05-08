export class PartnerId {
    constructor(public partnerId: string) {}

    static of(data: any): PartnerId {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new PartnerId(data.partnerId);
    }

    static ofList(data: any[]): PartnerId[] {
        if (!data) {
            return null;
        }
        return data.map((d) => PartnerId.of(d));
    }
}
