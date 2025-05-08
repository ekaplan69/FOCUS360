import { NgTemplateOutlet } from "@angular/common";
import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    Input,
} from "@angular/core";
import { MatTabsModule } from "@angular/material/tabs";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { RollenConstant } from "../../../../shared/constants/rollen.constant";
import { BetreuungsZeiten } from "../../../../shared/models/betreuungsZeiten.model";
import { ErrorMeldung } from "../../../../shared/models/errorMeldung.model";
import { Versicherungszeit } from "../../../../shared/models/versicherungszeit.model";
import { SucheService } from "../../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../../shared/services/backend/user/user.service";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";
import { BetreutContentComponent } from "./betreut-content/betreut-content.component";
import { VersichertContentComponent } from "./versichert-content/versichert-content.component";

@Component({
    selector: "f360-dashlet-versicherungszeiten",
    templateUrl: "./dashlet-versicherungszeiten.component.html",
    styleUrls: ["./dashlet-versicherungszeiten.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [
        DashletComponent,
        DashletHeaderComponent,
        DashletContentComponent,
        LoadingIndicatorComponent,
        DashletErrorComponent,
        VersichertContentComponent,
        BetreutContentComponent,
        NgTemplateOutlet,
        MatTabsModule,
    ],
})
export class DashletVersicherungszeitenComponent {
    @Input() betreutenZeiten: BetreuungsZeiten[] = [];
    @Input() btnr: boolean;
    @Input() error: ErrorMeldung;
    @Input() vdaUrl: string;
    @Input() versicherungszeiten: Versicherungszeit[] = [];

    constructor(
        private userService: UserService,
        private cd: ChangeDetectorRef,
        private sucheService: SucheService,
    ) {
        this.loadUrl();
    }

    isBTNR(): boolean {
        return this.btnr;
    }

    ngOnChanges() {
        if (this.versicherungszeiten || this.betreutenZeiten || this.error) {
            this.cd.detectChanges();
        }
        this.loadUrl();
    }

    showBetreuungsZeiten() {
        if (!this.userService || !this.userService.userInfo) {
            return;
        }

        return (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_LGKK_LESEN,
            ) &&
            this.betreutenZeiten &&
            this.betreutenZeiten.length > 0
        );
    }

    private loadUrl() {
        if (this.sucheService.getVersicherter().getValue()) {
            this.sucheService
                .getVersicherter()
                .getValue()
                .urlMap.subscribe((map) => {
                    if (map.get("vda")) {
                        this.vdaUrl = map.get("vda");
                    }
                });
        }
    }
}
