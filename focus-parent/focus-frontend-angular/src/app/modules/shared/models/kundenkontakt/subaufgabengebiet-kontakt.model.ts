import { EventEmitter } from "@angular/core";
import { Observable } from "rxjs";
import { FocusForm } from "../focusform.model";
import { Abschlussart } from "../kundenkontaktNeu/abschlussart.model";
import { Aufgabengebiet } from "../kundenkontaktNeu/aufgabengebiet.model";
import { Kontakt } from "../kundenkontaktNeu/kontakt.model";
import { Kontaktart } from "../kundenkontaktNeu/kontaktart.model";
import { Thema } from "../kundenkontaktNeu/thema.model";

export class SubaufgabengebietKontaktForm extends FocusForm {
    public static unfinishedKontaktOffen: boolean = false;
    abschlussartOptions = [];
    public abschlussartSelection: string;
    aufgabengebietOptions = [];
    public aufgabengebietSelection: string;
    public currentKontakt: Kontakt = null;
    public externeGewalt: boolean;
    public highlightTab = false;
    public kontaktLoadedEvent = new EventEmitter();
    kontaktartOptions = [];
    public kontaktartSelection: string;
    themaOptions = [];
    themaOptionsDD = [];
    public themaSelection: string;
    public zeitpunktStart;

    constructor() {
        super();
    }

    private static _registeredSVNR: number;

    static get registeredSVNR(): number {
        return this._registeredSVNR;
    }

    static getCurrentZeitPunktAsArray() {
        let now = new Date();
        return [
            now.getFullYear(),
            now.getMonth() + 1,
            now.getDate(),
            now.getHours(),
            now.getMinutes(),
            now.getSeconds(),
        ];
    }

    static register(pid: number) {
        SubaufgabengebietKontaktForm._registeredSVNR = pid;
    }

    static unregister() {
        SubaufgabengebietKontaktForm._registeredSVNR = null;
    }

    loadSubaufggKontakt(kontakt$?: Observable<Kontakt>, id?: number) {
        if (kontakt$ == null) {
            let k = Kontakt.empty();
            k.aufgabengebietId = null;
            k.themaId = null;
            k.abschlussartId = null;
            k.kontaktartId = null;
            this.zeitpunktStart =
                SubaufgabengebietKontaktForm.getCurrentZeitPunktAsArray();
            this.setCurrentKontakt(k);
            this.setFormValues();
            return;
        }

        this.currentKontakt = null;
        kontakt$.subscribe(
            (res) => {
                res.kontaktId = id;
                this.setCurrentKontakt(res);
                this.setFormValues();
            },
            (err) => {
                //TODO: fehlermeldung anzeige implementieren
            },
        );
    }

    setCurrentKontakt(k: Kontakt) {
        this.currentKontakt = k;
        this.kontaktLoadedEvent.emit();
    }

    setFormValues() {
        this.kontaktartSelection = Kontaktart.getDescriptionFromList(
            this.kontaktartOptions,
            this.currentKontakt.kontaktartId,
        );
        this.abschlussartSelection = Abschlussart.getDescriptionFromList(
            this.abschlussartOptions,
            this.currentKontakt.abschlussartId,
        );
        this.themaSelection = Thema.getDescriptionFromList(
            this.themaOptions,
            this.currentKontakt.themaId,
        );
        this.aufgabengebietSelection = Aufgabengebiet.getDescriptionFromList(
            this.aufgabengebietOptions,
            this.currentKontakt.aufgabengebietId,
        );
    }
}
