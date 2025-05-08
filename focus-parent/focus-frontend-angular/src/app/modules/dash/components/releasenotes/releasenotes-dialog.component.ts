import { Component, inject, OnInit } from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MAT_DIALOG_DATA, MatDialogModule } from "@angular/material/dialog";
import { compareVersions } from "compare-versions";
import { ReleasenotesCollectionModel } from "../../../shared/models/releasenotes/ReleasenotesCollection.model";

@Component({
    selector: "f360-releasenotes-dialog",
    templateUrl: "./releasenotes-dialog.component.html",
    styleUrls: ["./releasenotes-dialog.component.scss"],
    standalone: true,
    imports: [MatDialogModule, MatButtonModule],
})
export class ReleasenotesDialogComponent implements OnInit {
    readonly data = inject<ReleasenotesCollectionModel>(MAT_DIALOG_DATA);
    private patchnoteKinds = ["a", "c", "f"];

    private _releaseNoteString: string;

    get releaseNoteString(): string {
        return this._releaseNoteString;
    }

    public getReleaseNotesString(): string {
        let releasenotesHTML: string = "";

        this.data
            .getVersionList()
            .sort(compareVersions)
            .reverse()
            .forEach((version) => {
                releasenotesHTML += `<h2>Release ${version}</h2>`;

                let notes = this.data.getReleasenotesByReleaseNr(version);
                this.patchnoteKinds.forEach((pnk) => {
                    if (notes.filter((n) => n.kind === pnk).length != 0) {
                        releasenotesHTML +=
                            "<h3>" +
                            this.getPatchnoteKindValue(pnk) +
                            "</h3><ul>" +
                            notes
                                .filter((n) => n.kind === pnk)
                                .map((n) => "<li>" + n.description + "</li>")
                                .join("") +
                            "</ul>";
                    }
                });
                releasenotesHTML += `<br>`;
            });

        return releasenotesHTML;
    }

    ngOnInit() {
        this._releaseNoteString = this.getReleaseNotesString();
    }

    openConfluence() {
        // letzter Release
        window.open("https://doku.seu.sozvers.at/confluence_secure/x/hCm_FQ");
    }

    openConfluenceRoles() {
        // Benutzerrollen
        window.open("https://doku.seu.sozvers.at/confluence_secure/x/Oim_FQ");
    }

    private getPatchnoteKindValue(pnk: string) {
        switch (pnk) {
            case "a":
                return "Neues";
            case "c":
                return "Änderungen";
            default:
                return "Bugfixes";
        }
    }
}
