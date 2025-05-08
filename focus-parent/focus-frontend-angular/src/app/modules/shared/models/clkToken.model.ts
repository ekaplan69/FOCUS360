export class ClkToken {
    constructor(public clkToken: string) {}

    static of(data: any): ClkToken {
        if (!data || Object.keys(data).length === 0) {
            return null;
        }
        return new ClkToken(data.clkToken);
    }

    static ofList(data: any[]): ClkToken[] {
        if (!data) {
            return null;
        }
        return data.map((d) => ClkToken.of(d));
    }
}
