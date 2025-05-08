import { Angehoeriger } from "./angehoeriger.model";

export class Mitversicherung {
    constructor(
        public angehoerige: Angehoeriger[],
        public versicherte: Angehoeriger[],
    ) {}
}
