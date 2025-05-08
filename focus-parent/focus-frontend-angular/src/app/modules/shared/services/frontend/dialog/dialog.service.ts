import { ComponentType } from "@angular/cdk/portal";
import { Injectable } from "@angular/core";
import { MatDialog } from "@angular/material/dialog";
import { Observable } from "rxjs";
import { DashletKundenkontakteComponent } from "../../../../dash/components/dashlets/dashlet-kundenkontakte/dashlet-kundenkontakte.component";
import { ErrorDialogComponent } from "../../../dialogs/error-dialog/error-dialog.component";
import { KontaktForm } from "../../../models/kundenkontakt/kontakt-form.model";

export interface DialogOptions {
    disableClose?: boolean;
    width?: string;
}

@Injectable({
    providedIn: "root",
})
export class DialogService {
    constructor(public dialog: MatDialog) {}

    private static _dashletKundenkontaktComponent: DashletKundenkontakteComponent;

    static set dashletKundenkontaktComponent(
        value: DashletKundenkontakteComponent,
    ) {
        this._dashletKundenkontaktComponent = value;
    }

    openDialog(
        component: ComponentType<any>,
        data: any,
        options: DialogOptions = {},
    ): Observable<any> {
        return this.dialog
            .open(component, {
                ...options,
                data: data,
            })
            .afterClosed();
    }

    openGueltigeVSNRWennStorniertDialog(gueltigeVSNR: string[] | undefined) {
        let vsnrString = "";
        for (let i = 0; i < gueltigeVSNR.length; i++) {
            vsnrString += gueltigeVSNR[i];
            if (i + 1 < gueltigeVSNR.length) {
                vsnrString += ", ";
            }
        }
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "VSNR storniert",
                message:
                    "Für diesen Partner existieren gültige VSNR: " + vsnrString,
            },
            { width: "300px" },
        );
    }

    openInvalidDgnrDialog(dgnr: string) {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message:
                    "Es wurde eine ungültige Dienstgebernummer '" +
                    dgnr +
                    "' angegeben!",
            },
            { width: "300px" },
        );
    }

    openInvalidFsDialog(fs: string) {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message:
                    "Es wurde ein ungültiger Fachschlüssel '" +
                    fs +
                    "' angegeben!",
            },
            { width: "300px" },
        );
    }

    openInvalidVsnrDialog(vsnr: string) {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message: vsnr
                    ? "Es wurde eine ungültige Versicherungsnummer '" +
                      vsnr +
                      "' angegeben!"
                    : "Es wurde eine ungültige Versicherungsnummer angegeben!",
            },
            { width: "300px" },
        );
    }

    openOffeneKontakteDialog(offenerKontakte: string) {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message:
                    "Für die VSNR " +
                    offenerKontakte +
                    " existiert noch ein offener Kontakt!",
            },
            { width: "300px" },
        );
    }

    openUnfinishedKontaktDialog() {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message:
                    "Es existiert für die aktuelle VSNR noch ein offener Kontakt!",
            },
            { width: "300px" },
        );
        if (!KontaktForm.unfinishedKontaktOffen) {
            DialogService._dashletKundenkontaktComponent.openExistingKontakt(
                KontaktForm.registeredSVNR,
            );
        }
    }

    openUnfinishedSubaufggDialog() {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message: "Es existiert noch ein offener Kontakt!",
            },
            { width: "300px" },
        );
    }

    showError(errorMessage: string) {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler",
                message: errorMessage,
            },
            { width: "300px" },
        );
    }

    switchToGueltigeVSNRWennStorniertDialog(vsnr: string | undefined) {
        this.openDialog(
            ErrorDialogComponent,
            {
                title: "VSNR gewechselt",
                message:
                    "Die eingegebene VSNR ist ungültig, es wurde zu einer gültigen VSNR gewechselt: " +
                    vsnr,
            },
            { width: "300px" },
        );
    }
}
