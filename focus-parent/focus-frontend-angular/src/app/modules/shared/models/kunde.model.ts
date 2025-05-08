import { Fachschluessel } from "./Fachschluessel.model";

export abstract class Kunde {
    abstract fs: Fachschluessel;
    abstract openedKontakt: boolean;
}
