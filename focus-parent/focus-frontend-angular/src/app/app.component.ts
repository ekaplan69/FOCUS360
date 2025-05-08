import { AsyncPipe, NgClass } from "@angular/common";
import { Component, OnDestroy, OnInit } from "@angular/core";
import { MatDialog, MatDialogModule } from "@angular/material/dialog";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";
import { NavigationStart, RouterOutlet } from "@angular/router";
import { Observable } from "rxjs";
import { HeaderContainer } from "./modules/header/header.container";
import {
    ROUTE_DASH,
    ROUTE_HOME,
} from "./modules/shared/constants/routes.constant";
import { KontaktHistorie } from "./modules/shared/models/kundenkontaktNeu/kontaktHistorie.model";
import { UserInfo } from "./modules/shared/models/userInfo.model";
import { KontaktService } from "./modules/shared/services/backend/kontakt/kontakt.service";
import { UserService } from "./modules/shared/services/backend/user/user.service";
import { ChipService } from "./modules/shared/services/frontend/chip/chip.service";
import { DialogService } from "./modules/shared/services/frontend/dialog/dialog.service";
import { RouterService } from "./modules/shared/services/frontend/router/router.service";
import { SpinnerService } from "./modules/shared/services/frontend/spinner/spinner.service";
import { untilDestroyed } from "./modules/shared/utilities/componentDestroyed.util";

@Component({
    selector: "app-root",
    templateUrl: "./app.component.html",
    styleUrls: ["./app.component.scss"],
    standalone: true,
    imports: [
        NgClass,
        HeaderContainer,
        RouterOutlet,
        MatProgressSpinnerModule,
        AsyncPipe,
        MatDialogModule,
    ],
    providers: [DialogService, MatDialogModule, MatDialog],
})
export class AppComponent implements OnDestroy, OnInit {
    $showSpinner: Observable<boolean>;
    currentPage: string;
    public instantiated: boolean = false;

    constructor(
        private routerService: RouterService,
        private userService: UserService,
        private spinnerService: SpinnerService,
        private chipService: ChipService,
        private kontaktService: KontaktService,
    ) {
        this._selectFromRouteState();
        this._selectCurrentRouteState();
        this._selectSpinnerStatus();
    }

    public isIEOrEdge() {
        return /msie\s|trident\/|edge\//i.test(window.navigator.userAgent);
    }

    ngOnDestroy() {}

    ngOnInit() {
        this.userService.readUserInfoObservable().subscribe(() => {
            this.userService.selectedAufgabengebiet =
                localStorage.getItem("aufg");
            this.userService.selectedOrganisationseinheit =
                localStorage.getItem("org");
            this.instantiated = true;
        });
    }

    private _selectCurrentRouteState() {
        this.routerService
            .selectCurrentRouteState()
            .pipe(untilDestroyed(this))
            .subscribe((currentRouteState: NavigationStart) => {
                const currentUrl = currentRouteState.url;
                if (currentUrl.startsWith(ROUTE_HOME)) {
                    this.currentPage = "focus360-home-screen";
                } else if (currentUrl.startsWith(ROUTE_DASH)) {
                    this.currentPage = "focus360-dash-screen";
                } else {
                    this.currentPage = null;
                }
            });
    }

    private _selectFromRouteState() {
        this.routerService
            .selectFromRouteState()
            .pipe(untilDestroyed(this))
            .subscribe((fromRouterState: NavigationStart) => {
                if (!fromRouterState) {
                    this.userService
                        .readUserInfoObservable()
                        .subscribe((userInfo: UserInfo) => {
                            userInfo.organisationseinheiten =
                                userInfo.organisationseinheiten.filter(
                                    (e) =>
                                        e.match("^[(Tr)(tr)].*ger.*") == null,
                                );
                            this.userService.setUserInfo(userInfo);
                            this.kontaktService
                                .loadKontaktHistorie()
                                .subscribe((historie: KontaktHistorie[]) => {
                                    historie.forEach((h) =>
                                        this.chipService.addChip(
                                            h.fachschluessel,
                                            false,
                                        ),
                                    );
                                });
                        });
                }
            });
    }

    private _selectSpinnerStatus() {
        this.$showSpinner = this.spinnerService.selectSpinnerStatus();
    }
}
