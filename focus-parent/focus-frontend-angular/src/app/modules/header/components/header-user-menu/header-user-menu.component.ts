import { HttpClient } from "@angular/common/http";
import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    Input,
} from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MatDialog } from "@angular/material/dialog";
import { MatIconModule } from "@angular/material/icon";
import { MatMenuModule } from "@angular/material/menu";
import { MatTooltipModule } from "@angular/material/tooltip";
import { Router } from "@angular/router";
import { EMPTY } from "rxjs";
import { catchError } from "rxjs/operators";
import { ReleasenotesDialogComponent } from "../../../dash/components/releasenotes/releasenotes-dialog.component";
import { SubaufgabengebietFormComponent } from "../../../dash/components/sidebar/form-content/subaufgabengebiet-form/subaufgabengebiet-form.component";
import { ROUTE_DASH } from "../../../shared/constants/routes.constant";
import { ApplicationListItem } from "../../../shared/models/application-list-item.model";
import { KontaktForm } from "../../../shared/models/kundenkontakt/kontakt-form.model";
import { SubaufgabengebietKontaktForm } from "../../../shared/models/kundenkontakt/subaufgabengebiet-kontakt.model";
import { Aufgabengebiet } from "../../../shared/models/kundenkontaktNeu/aufgabengebiet.model";
import { UserInfo } from "../../../shared/models/userInfo.model";
import { UserService } from "../../../shared/services/backend/user/user.service";
import { AlertService } from "../../../shared/services/frontend/alert/alert.service";
import { ChipService } from "../../../shared/services/frontend/chip/chip.service";
import { DialogService } from "../../../shared/services/frontend/dialog/dialog.service";
import { ReleasenoteService } from "../../../shared/services/frontend/releasenotes/releasenote.service";
import { ApplicationListComponent } from "../application-list/application-list.component";

@Component({
    selector: "f360-header-user-menu",
    templateUrl: "./header-user-menu.component.html",
    styleUrls: ["./header-user-menu.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [
        MatButtonModule,
        MatTooltipModule,
        MatIconModule,
        MatMenuModule,
        ApplicationListComponent,
    ],
})
export class HeaderUserMenuComponent {
    applikationsListe: ApplicationListItem[];
    benutzerAktionenListe: ApplicationListItem[];
    public isReleasenotesLoaded: boolean = false;
    @Input() userInfo: UserInfo;
    private _clicked = false;

    constructor(
        private alertService: AlertService,
        private http: HttpClient,
        private cd: ChangeDetectorRef,
        public userService: UserService,
        private subaufgabengebietForm: SubaufgabengebietFormComponent,
        private router: Router,
        private dialogService: DialogService,
        private chipService: ChipService,
        private dialog: MatDialog,
        private releasenoteService: ReleasenoteService,
    ) {
        this.ladeBenutzerMenu();
    }

    getAdditionalUserInfoForHeader(): string {
        const aufg = localStorage.getItem("aufg");
        const org = localStorage.getItem("org");
        let additionalUserInfo = "";

        if (org) {
            additionalUserInfo = org;
        }
        if (org && aufg) {
            additionalUserInfo += " / ";
        }
        if (aufg) {
            additionalUserInfo += aufg;
        }

        if (additionalUserInfo !== "") {
            return " (" + additionalUserInfo + ")";
        } else {
            return "";
        }
    }

    ladeBenutzerMenu(): void {
        this.applikationsListe = [];
        this.benutzerAktionenListe = [];

        let endPoint =
            "/applikationen/material-menu.js" + "?v=" + Date.now().toString();

        if (location.hostname == "localhost") {
            endPoint = "http://localhost:8080" + endPoint;
        }

        this.http
            .jsonp(endPoint, "callback")
            .pipe(
                catchError((err) => {
                    console.log(err); //Den log evt belassen an der Stelle
                    return EMPTY;
                }),
            )
            .subscribe((data: any) => {
                if (!data) {
                    this.applikationsListe = [];
                    this.benutzerAktionenListe = [];
                } else {
                    this.applikationsListe = ApplicationListItem.ofList(
                        data.applikationen,
                    );
                    this.benutzerAktionenListe = ApplicationListItem.ofList(
                        data.benutzer,
                    );
                }
                this.cd.detectChanges();
            });
    }

    loadSubAufgabengebiet(aufgabengebiet: Aufgabengebiet) {
        if (this._clicked) {
            return;
        }
        this._clicked = true;
        if (
            SubaufgabengebietKontaktForm.registeredSVNR == null &&
            KontaktForm.registeredSVNR == null
        ) {
            this.chipService.unselectAll();
            this.subaufgabengebietForm.userService.selectedSubAufgabengebiet =
                aufgabengebiet.aufgabengebietBezeichnung;
            this.openSubAufggKontakt();
        } else {
            this.dialogService.openUnfinishedSubaufggDialog();
            this._clicked = false;
        }
    }

    openReleasenotes() {
        if (!this.isReleasenotesLoaded) {
            this.isReleasenotesLoaded = true;
            this.userService.readUserInfoObservable().subscribe(() => {
                this.releasenoteService
                    .readReleasenotesCSV()
                    .subscribe((value) => {
                        this.dialog
                            .open(ReleasenotesDialogComponent, {
                                data: value,
                                width: "30%",
                            })
                            .afterClosed()
                            .subscribe(
                                () => (this.isReleasenotesLoaded = false),
                            );
                    });
            });
        }
    }

    openSubAufggKontakt() {
        if (
            SubaufgabengebietKontaktForm.registeredSVNR == null &&
            KontaktForm.registeredSVNR == null
        ) {
            this.router.navigate([ROUTE_DASH]);
            this.subaufgabengebietForm.kontaktSavedSubscription =
                this.subaufgabengebietForm.saveKontaktShell().subscribe(
                    (data) => {
                        this.subaufgabengebietForm.subaufgabengebietKontaktForm =
                            this.subaufgabengebietForm.forms.subaufgabengebietKontaktForm;
                        this.subaufgabengebietForm.alertService.success(
                            "Hülle angelegt.",
                        );
                        this.subaufgabengebietForm.forms.openSubaufgabengebietKontaktForm(
                            data.protokollEintraege[0].zusatzinfo.zusatz30[0]
                                .value,
                            true,
                        );
                        this.cd.detectChanges();
                        SubaufgabengebietKontaktForm.register(
                            data.protokollEintraege[0].zusatzinfo.zusatz30[0]
                                .value,
                        );
                        this._clicked = false;
                    },
                    (error1) => {
                        this.subaufgabengebietForm.alertService.error(
                            error1.message,
                        );
                        this._clicked = false;
                    },
                );
        } else {
            this._clicked = false;
            this.subaufgabengebietForm.alertService.warning(
                "Es ist bereits ein Kontakt in arbeit! Schließen Sie diesen zuerst ab um einen neuen zu öffnen!",
            );
        }
    }
}
