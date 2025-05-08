import { Fachschluessel } from "./Fachschluessel.model";

export class NotizDTO {
    constructor(
        public fachschluessel: Fachschluessel,
        public text: string,
        public updateCount: number,
    ) {}
}
