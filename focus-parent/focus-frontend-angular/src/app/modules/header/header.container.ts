import { AsyncPipe } from "@angular/common";
import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    EventEmitter,
    OnDestroy,
    OnInit,
    Output,
} from "@angular/core";
import {
    ActivatedRoute,
    NavigationStart,
    Params,
    Router,
} from "@angular/router";
import { Observable } from "rxjs";
import { ChipState } from "../shared/components/chip/chip.component";
import { ROUTE_DASH, ROUTE_HOME } from "../shared/constants/routes.constant";
import { Fachschluessel } from "../shared/models/Fachschluessel.model";
import { Kunde } from "../shared/models/kunde.model";
import { KontaktFormParameter } from "../shared/models/kundenkontakt/kontakt-form-parameter.model";
import { KontaktForm } from "../shared/models/kundenkontakt/kontakt-form.model";
import { SubaufgabengebietKontaktForm } from "../shared/models/kundenkontakt/subaufgabengebiet-kontakt.model";
import { UserInfo } from "../shared/models/userInfo.model";
import { SucheService } from "../shared/services/backend/suche/suche.service";
import { UserService } from "../shared/services/backend/user/user.service";
import { ChipService } from "../shared/services/frontend/chip/chip.service";
import { DialogService } from "../shared/services/frontend/dialog/dialog.service";
import { RouterService } from "../shared/services/frontend/router/router.service";
import { untilDestroyed } from "../shared/utilities/componentDestroyed.util";
import { validateFs } from "../shared/validators/fachschluessel.validator";
import { HeaderChipsComponent } from "./components/header-chips/header-chips.component";
import { HeaderEnvironmentComponent } from "./components/header-environment/header-environment.component";
import { HeaderLogoComponent } from "./components/header-logo/header-logo.component";
import { HeaderSearchFieldComponent } from "./components/header-search-field/header-search-field.component";
import { HeaderUserMenuComponent } from "./components/header-user-menu/header-user-menu.component";
import { InfoHeaderContainer } from "./containers/info-header/info-header.container";

@Component({
    selector: "f360-header",
    templateUrl: "./header.container.html",
    styleUrls: ["./header.container.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [
        HeaderLogoComponent,
        HeaderSearchFieldComponent,
        HeaderChipsComponent,
        HeaderEnvironmentComponent,
        HeaderUserMenuComponent,
        InfoHeaderContainer,
        AsyncPipe,
    ],
})
export class HeaderContainer implements OnInit, OnDestroy {
    $userInfo: Observable<UserInfo> = null;
    isDashScreen = true;

    @Output() openKontaktFormEvent: EventEmitter<KontaktFormParameter> =
        new EventEmitter();

    private currentFS: Fachschluessel = null;

    constructor(
        private router: Router,
        private route: ActivatedRoute,
        public userService: UserService,
        private routerService: RouterService,
        private sucheService: SucheService,
        private dialogService: DialogService,
        private cd: ChangeDetectorRef,
        private chipService: ChipService,
    ) {}

    ngOnDestroy() {}

    ngOnInit() {
        this._selectUserInfo();
        this._selectCurrentRouteState();
        this._selectRouteQueryParams();
        this._selectKunde();
    }

    onChipClick(chipState: ChipState) {
        if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
            chipState.cancel();
            return;
        }

        if (SubaufgabengebietKontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedSubaufggDialog();
            chipState.cancel();
            return;
        }

        if (chipState.id === "alle_schliessen") {
            this.chipService.clearChips();
            this.router.navigate([ROUTE_DASH]);
            return;
        }

        if (chipState.selected) {
            this.router.navigate([ROUTE_DASH], {
                queryParams: {
                    fs: chipState.id,
                    fsArt: Fachschluessel.of(chipState.id).fachschluesselArt,
                },
            });
        } else {
            this.router.navigate([ROUTE_DASH]);
        }
    }

    onChipRemove(chipState: ChipState) {
        if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
            chipState.cancel();
            return;
        }
        this.chipService.removeChip(chipState.id);
        this.sucheService.removeVersicherterFromCache(chipState.id);
        this.sucheService.removeKundeFromCache(chipState.id);
        if (!this.currentFS || chipState.id === this.currentFS.fachschluessel) {
            this.router.navigate([ROUTE_DASH]);
        }
    }

    onLogoClick() {
        if (SubaufgabengebietKontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedSubaufggDialog();
            return;
        } else if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
        } else {
            this.router.navigate([ROUTE_HOME]).then(() => {
                window.location.reload(); //Übergangslösung - ohne einem Neuladen der Seite aktualisiert sich die Liste an SVNR mit offenen Kontakten nicht
            });
        }
    }

    onSearchFieldEnter(fachschluessel: string) {
        if (SubaufgabengebietKontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedSubaufggDialog();
            return;
        } else if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
        } else {
            this.router.navigate([ROUTE_DASH], {
                queryParams: {
                    fs: fachschluessel,
                    fsArt: Fachschluessel.of(fachschluessel).fachschluesselArt,
                },
            });
        }
    }

    private _addOrActivateChip(kunde: Kunde) {
        this.chipService.addOrActivateChip(kunde.fs.fachschluessel);
        this.onSearchFieldEnter(kunde.fs.fachschluessel);
        this.cd.detectChanges();
    }

    private _selectCurrentRouteState() {
        this.routerService
            .selectCurrentRouteState()
            .pipe(untilDestroyed(this))
            .subscribe((currentRouteState: NavigationStart) => {
                const currentUrl = currentRouteState.url;
                this.isDashScreen = currentUrl.startsWith(ROUTE_DASH);
            });
    }

    private _selectKunde() {
        this.sucheService
            .selectKunde()
            .pipe(untilDestroyed(this))
            .subscribe((kunde: Kunde) => {
                if (!kunde) {
                    return;
                }

                this._addOrActivateChip(kunde);
            });
    }

    private _selectRouteQueryParams() {
        this.route.queryParams
            .pipe(untilDestroyed(this))
            .subscribe((queryParams: Params) => {
                if (this.isDashScreen) {
                    this.currentFS = Fachschluessel.of(queryParams.fs);

                    if (!this.currentFS || !this.currentFS.fachschluesselArt) {
                        this.sucheService.setCurrentVersicherter(null);
                        this.sucheService.setCurrentKunde(null);
                        return;
                    }

                    if (
                        this.currentFS.fachschluesselArt === "VSNR" ||
                        this.currentFS.fachschluesselArt === "BTNR"
                    ) {
                        if (!validateFs(this.currentFS.fachschluessel)) {
                            this.dialogService.openInvalidVsnrDialog(
                                this.currentFS.fachschluessel,
                            );
                            this.sucheService.setCurrentVersicherter(null);
                            return null;
                        }
                    } else if (this.currentFS.fachschluesselArt === "DGNR") {
                        if (this.currentFS.fachschluessel.length !== 9) {
                            this.dialogService.openInvalidDgnrDialog(
                                this.currentFS.fachschluessel,
                            );
                            this.sucheService.setCurrentKunde(null);
                            return;
                        }
                    } else {
                        this.sucheService.setCurrentKunde(null);
                        this.dialogService.openInvalidFsDialog(
                            this.currentFS.fachschluessel,
                        );
                    }

                    this.sucheService.readKunde(
                        this.currentFS.fachschluessel,
                        this.currentFS.fachschluesselArt,
                    );
                }
            });
    }

    private _selectUserInfo() {
        this.$userInfo = this.userService.selectUserInfo();
    }
}
