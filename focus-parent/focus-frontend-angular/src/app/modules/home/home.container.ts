import { ChangeDetectionStrategy, Component } from "@angular/core";
import { Router } from "@angular/router";
import { ROUTE_DASH } from "../shared/constants/routes.constant";
import { Fachschluessel } from "../shared/models/Fachschluessel.model";
import { HomeFooterComponent } from "./components/home-footer/home-footer.component";
import { HomeLogoComponent } from "./components/home-logo/home-logo.component";
import { HomeSearchFieldComponent } from "./components/home-search-field/home-search-field.component";

@Component({
    selector: "f360-home",
    templateUrl: "./home.container.html",
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [HomeLogoComponent, HomeSearchFieldComponent, HomeFooterComponent],
})
export class HomeContainer {
    constructor(private router: Router) {}

    onSearchFieldEnter(fachschluesselString: string) {
        if (fachschluesselString == null) {
            this.router.navigate([ROUTE_DASH]);
        } else {
            let fachschluessel: Fachschluessel =
                Fachschluessel.of(fachschluesselString);
            this.router.navigate([ROUTE_DASH], {
                queryParams: {
                    fs: fachschluessel.fachschluessel,
                    fsArt: fachschluessel.fachschluesselArt,
                },
            });
        }
    }
}
