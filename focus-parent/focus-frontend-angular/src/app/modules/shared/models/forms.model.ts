import { Injectable } from "@angular/core";
import { BeschwerdeService } from "../services/backend/beschwerde/beschwerde.service";
import { KontaktService } from "../services/backend/kontakt/kontakt.service";
import { BeschwerdeForm } from "./beschwerdeForm.model";
import { FocusForm } from "./focusform.model";
import { KontaktForm } from "./kundenkontakt/kontakt-form.model";
import { SubaufgabengebietKontaktForm } from "./kundenkontakt/subaufgabengebiet-kontakt.model";
import { NotizForm } from "./notizForm.model";

@Injectable({
    providedIn: "root",
})
export class Forms {
    static TYPES = {
        NOTIZ: "Notiz",
        BESCHWERDE: "Beschwerde",
        KONTAKT: "Kundenkontakt",
        SUBAUFGABENGEBIETKONTAKT: "SubaufgabengebietKontakt",
    };
    public beschwerdeForm: BeschwerdeForm = new BeschwerdeForm();
    public currentOpenForm: FocusForm;
    public kontaktForm: KontaktForm = new KontaktForm();
    public notizForm: NotizForm = new NotizForm();
    public subaufgabengebietKontaktForm: SubaufgabengebietKontaktForm =
        new SubaufgabengebietKontaktForm();

    constructor(
        private beschwerdeService: BeschwerdeService,
        private kontaktService: KontaktService,
    ) {}

    public anyFormActive(): boolean {
        return (
            this.notizForm.active ||
            this.beschwerdeForm.active ||
            this.kontaktForm.active
        );
    }

    public cancelForm(formType: string) {
        this.currentOpenForm = null;

        switch (formType) {
            case Forms.TYPES.NOTIZ:
                this.notizForm = new NotizForm();
                break;
            case Forms.TYPES.BESCHWERDE:
                this.beschwerdeForm = new BeschwerdeForm();
                break;
            case Forms.TYPES.KONTAKT:
                this.kontaktForm = new KontaktForm();
        }
    }

    public closeForm() {
        if (KontaktForm.unfinishedKontaktOffen) {
            KontaktForm.register(this.kontaktForm.currentKontakt.kontaktId);
        }
        KontaktForm.unfinishedKontaktOffen = false;
        this.currentOpenForm = null;
    }

    public isBeschwerdeFormOpen() {
        return this.currentOpenForm == this.beschwerdeForm;
    }

    public isKontaktFormHighlight() {
        return this.kontaktForm.highlightTab;
    }

    public isKontaktFormOpen() {
        return this.currentOpenForm == this.kontaktForm;
    }

    public isNotizFormOpen() {
        return this.currentOpenForm == this.notizForm;
    }

    public isSubaufgabengebietKontaktFormOpen() {
        return this.currentOpenForm == this.subaufgabengebietKontaktForm;
    }

    public notizFormOpen() {
        return this.currentOpenForm === this.notizForm;
    }

    openBeschwerdeForm(fs: string, isBtnr: boolean, pid: string, id?: number) {
        let fsArt = isBtnr ? "BTNR" : "VSNR";
        if (id !== null) {
            this.beschwerdeForm.loadBeschwerde(
                fs,
                isBtnr,
                this.beschwerdeService.getFeedback(id, pid),
            );
        } else {
            this.beschwerdeForm.loadBeschwerde(fs, isBtnr);
        }

        this.beschwerdeForm.active = true;
        if (this.currentOpenForm !== this.beschwerdeForm) {
            this.toggleForm(Forms.TYPES.BESCHWERDE);
        }
    }

    openKontaktForm(
        fs: string,
        fsArt: string,
        pid: string,
        id?: number,
        openForm?: boolean,
    ) {
        if (id != null) {
            this.kontaktForm.loadKontakt(
                fs,
                fsArt,
                this.kontaktService.loadKontakt(id, fs, fsArt, pid),
                id,
            );
        } else {
            this.kontaktForm.loadKontakt(fs, fsArt);
        }

        this.kontaktForm.active = true;

        if (!openForm) {
            this.kontaktForm.highlightTab = true;
        }

        if (this.currentOpenForm !== this.kontaktForm) {
            if (openForm) {
                this.toggleForm(Forms.TYPES.KONTAKT);
            }
        } else {
            if (!openForm) {
                this.currentOpenForm = null;
            }
        }
    }

    openSubaufgabengebietKontaktForm(id?: number, openForm?: boolean) {
        if (id != null) {
            this.subaufgabengebietKontaktForm.loadSubaufggKontakt(
                this.kontaktService.loadKontaktOhneFS(id),
                id,
            );
        } else {
            return;
        }

        this.subaufgabengebietKontaktForm.active = true;

        if (!openForm) {
            this.subaufgabengebietKontaktForm.highlightTab = true;
        }

        if (this.currentOpenForm !== this.subaufgabengebietKontaktForm) {
            if (openForm) {
                this.toggleForm(Forms.TYPES.SUBAUFGABENGEBIETKONTAKT);
            }
        } else {
            if (!openForm) {
                this.currentOpenForm = null;
            }
        }
    }

    public toggleForm(formType: string) {
        switch (formType) {
            case Forms.TYPES.NOTIZ:
                this.toggleNotizForm();
                break;
            case Forms.TYPES.BESCHWERDE:
                this.toggleBeschwerdeForm();
                break;
            case Forms.TYPES.KONTAKT:
                this.toggleKontaktForm();
                break;
            case Forms.TYPES.SUBAUFGABENGEBIETKONTAKT:
                this.toggleSubaufgabengebietKontaktForm();
        }
    }

    toggleKontaktForm() {
        this.kontaktForm.highlightTab = false;
        if (this.currentOpenForm === this.kontaktForm) {
            this.closeForm();
        } else {
            this.currentOpenForm = this.kontaktForm;
        }
    }

    toggleSubaufgabengebietKontaktForm() {
        this.subaufgabengebietKontaktForm.highlightTab = false;
        if (this.currentOpenForm === this.subaufgabengebietKontaktForm) {
            this.closeForm();
        } else {
            this.currentOpenForm = this.subaufgabengebietKontaktForm;
        }
    }

    private toggleBeschwerdeForm() {
        if (this.currentOpenForm === this.beschwerdeForm) {
            this.closeForm();
        } else {
            this.currentOpenForm = this.beschwerdeForm;
        }
    }

    private toggleNotizForm() {
        if (this.currentOpenForm === this.notizForm) {
            this.closeForm();
        } else {
            this.currentOpenForm = this.notizForm;
        }
    }
}
