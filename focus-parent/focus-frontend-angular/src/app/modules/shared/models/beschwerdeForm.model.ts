import { EventEmitter } from "@angular/core";
import { Observable } from "rxjs";
import { FeedbackLang } from "./feedback/feedback-lang.model";
import { FocusForm } from "./focusform.model";

export class BeschwerdeForm extends FocusForm {
    public bearbeitungsModus: boolean = false;
    public beschwerdeLoaded: EventEmitter<any> = new EventEmitter();
    public currentBeschwerde: FeedbackLang;
    public fehlermeldung: string;
    public fs: string;
    public fsArt: string;

    loadBeschwerde(
        fs: string,
        isBtnr: boolean,
        beschwerde$?: Observable<FeedbackLang>,
    ) {
        this.fs = fs;
        this.fsArt = isBtnr ? "BTNR" : "VSNR";

        if (beschwerde$ == null) {
            let b = FeedbackLang.empty();
            this.bearbeitungsModus = true;
            this.setCurrentBeschwerde(b);
            return;
        }

        this.currentBeschwerde = null;
        beschwerde$.subscribe(
            (res) => {
                this.setCurrentBeschwerde(res);
            },
            (err) => {
                this.fehlermeldung = err.valueOf().toString();
                this.setCurrentBeschwerde(null);
            },
        );
    }

    setCurrentBeschwerde(b: FeedbackLang) {
        this.currentBeschwerde = b;
        this.beschwerdeLoaded.emit();
    }
}
