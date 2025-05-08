export class CardContentPair {
    static NOTIZ = new CardContentPair("notiz", "notiz");

    private constructor(
        private _card: string,
        private _content: string,
    ) {}

    get card(): string {
        return this._card;
    }

    get content(): string {
        return this._content;
    }
}
