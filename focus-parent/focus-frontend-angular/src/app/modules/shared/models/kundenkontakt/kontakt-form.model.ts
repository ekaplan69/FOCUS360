import { EventEmitter } from "@angular/core";
import { Observable } from "rxjs";
import { FeedbackLang } from "../feedback/feedback-lang.model";
import { FocusForm } from "../focusform.model";
import { Abschlussart } from "../kundenkontaktNeu/abschlussart.model";
import { Aufgabengebiet } from "../kundenkontaktNeu/aufgabengebiet.model";
import { Kontakt } from "../kundenkontaktNeu/kontakt.model";
import { Kontaktart } from "../kundenkontaktNeu/kontaktart.model";
import { Thema } from "../kundenkontaktNeu/thema.model";

export class KontaktForm extends FocusForm {
    public static unfinishedKontaktOffen: boolean = false;
    abschlussartOptions = [];
    public abschlussartSelection: string;
    aufgabengebietOptions = [];
    public aufgabengebietSelection: string;
    public bearbeitungsmodus = false;
    public currentFeedback: FeedbackLang;
    public currentKontakt: Kontakt;
    public externeGewalt: boolean;
    public fs: string;
    public fsArt: string;
    public highlightTab = false;
    public kontaktLoadedEvent = new EventEmitter();
    kontaktartOptions = [];
    public kontaktartSelection: string;
    themaOptions = [];
    themaOptionsDD = [];
    public themaSelection: string;
    public unterthemaSelection: string;
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
        KontaktForm._registeredSVNR = pid;
    }

    static unregister() {
        KontaktForm._registeredSVNR = null;
    }

    loadKontakt(
        fs: string,
        fsArt: string,
        kontakt$?: Observable<Kontakt>,
        id?: number,
    ) {
        this.fs = fs;
        this.fsArt = fsArt;
        this.currentFeedback = FeedbackLang.empty();

        if (kontakt$ == null) {
            this.bearbeitungsmodus = true;
            let k = Kontakt.empty();
            k.aufgabengebietId = null;
            k.themaId = null;
            k.abschlussartId = null;
            k.kontaktartId = null;
            this.zeitpunktStart = KontaktForm.getCurrentZeitPunktAsArray();
            this.setCurrentKontakt(k);
            this.setFormValues();
            return;
        }

        this.currentKontakt = null;
        kontakt$.subscribe(
            (res) => {
                res.kontaktId = id;
                this.setCurrentKontakt(res);
                this.bearbeitungsmodus = this.currentKontakt.updatecount === 0;
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
