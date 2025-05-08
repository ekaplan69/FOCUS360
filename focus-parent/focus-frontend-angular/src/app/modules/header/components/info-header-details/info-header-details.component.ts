import { Clipboard } from "@angular/cdk/clipboard";
import { AsyncPipe, DatePipe } from "@angular/common";
import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    OnDestroy,
    OnInit,
} from "@angular/core";
import { MatButton, MatIconButton } from "@angular/material/button";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";
import { Observable, Subscription } from "rxjs";
import { RollenConstant } from "../../../shared/constants/rollen.constant";
import { Dienstgeber } from "../../../shared/models/dienstgeber/dienstgeber.model";
import { Forms } from "../../../shared/models/forms.model";
import { Kunde } from "../../../shared/models/kunde.model";
import { Person } from "../../../shared/models/Person.model";
import { SucheService } from "../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../shared/services/backend/user/user.service";
import { ZupService } from "../../../shared/services/backend/zup/zup.service";
import { AlertService } from "../../../shared/services/frontend/alert/alert.service";
import { FormActivationService } from "../../../shared/services/frontend/event-transmitter/open-editor-event.service";

@Component({
    selector: "f360-info-header-details",
    templateUrl: "./info-header-details.component.html",
    styleUrls: ["./info-header-details.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [
        MatIconModule,
        MatTooltipModule,
        AsyncPipe,
        DatePipe,
        MatButton,
        MatIconButton,
    ],
})
export class InfoHeaderDetailsComponent implements OnInit, OnDestroy {
    private static auskunftssperreZuppedVSNRs: string[] = [];
    dienstgeber: Dienstgeber;
    kunde: Observable<Kunde>;
    rollen = RollenConstant;
    versicherter: Person;
    private auskunftssperreOpen: boolean;
    private gebuehrenBefreiungOpen: boolean;
    private n: Subscription;
    private wichtigeInfoOpen: boolean;

    constructor(
        private alertService: AlertService,
        private clipboard: Clipboard,
        private formActivationService: FormActivationService,
        private userService: UserService,
        private sucheService: SucheService,
        private cd: ChangeDetectorRef,
        private zupService: ZupService,
    ) {
        this.wichtigeInfoOpen = false;
    }

    closeContentWrappers() {
        if (this.isGebuehrenBefreiungOpen()) {
            this.toggleGebuehrenBefreiung();
        }
        if (this.isAuskunftssperreOpen()) {
            this.toggleAuskunftssperre();
        }
        if (this.isWichtigeInfoOpen()) {
            this.toggleWichtigeInfo();
        }
    }

    copyVSNR() {
        this.clipboard.copy(this.versicherter.fs.fachschluessel);
        this.alertService.success("VSNR in Zwischenablage kopiert.");
    }

    editWichtigeInfo() {
        if (
            !this.userService.userInfo.containsRolle(
                this.rollen.ROLLE_NOTIZ_VERW,
            )
        ) {
            return;
        }

        if (this.isWichtigeInfoOpen()) {
            this.toggleWichtigeInfo();
        }

        this.formActivationService.formActivated.emit(Forms.TYPES.NOTIZ);
    }

    isAuskunftssperreOpen() {
        return this.auskunftssperreOpen;
    }

    isGebuehrenBefreiungOpen() {
        return this.gebuehrenBefreiungOpen;
    }

    isKeineAuskunftsperregruende() {
        let auskunftsSperreGruende =
            this.versicherter.stammdaten.auskunftsSperreGruende;
        for (let grund of auskunftsSperreGruende) {
            if (grund != null) {
                return false;
            }
        }
        return true;
    }

    isWichtigeInfoEmpty() {
        if (this.versicherter && !this.versicherter.notiz) {
            return true;
        }
        return (
            !this.versicherter.notiz.text ||
            this.versicherter.notiz.text.trim().length == 0
        );
    }

    isWichtigeInfoOpen() {
        return this.wichtigeInfoOpen;
    }

    loadNotizIcon() {
        return this.isWichtigeInfoEmpty() ? "chat_bubble" : "announcement";
    }

    ngOnDestroy(): void {
        if (this.n != null) {
            this.n.unsubscribe();
        }
    }

    ngOnInit(): void {
        this.kunde = this.sucheService.selectKunde();
        this.n = this.kunde.subscribe((value) => {
            this.versicherter = null;
            this.dienstgeber = null;

            if (value instanceof Person && value.stammdaten) {
                if (this.versicherter != value) {
                    this.closeContentWrappers();
                    this.cd.detectChanges();
                }

                this.versicherter = value;
                this.cd.detectChanges();
            } else if (value instanceof Dienstgeber && value.stammdaten) {
                this.dienstgeber = value;
                this.cd.detectChanges();
            }
        });
    }

    toggleAuskunftssperre() {
        this.auskunftssperreOpen = !this.auskunftssperreOpen;
        if (
            !InfoHeaderDetailsComponent.auskunftssperreZuppedVSNRs.includes(
                this.sucheService.selectCurrentFs(),
            )
        ) {
            this.zupService.logZUP(
                this.sucheService.selectCurrentFs(),
                this.sucheService.selectCurrentFsArt(),
                this.sucheService.selectCurrentPID(),
                "F360_READ_ZPV_AKSPER",
            );
            InfoHeaderDetailsComponent.auskunftssperreZuppedVSNRs.push(
                this.sucheService.selectCurrentFs(),
            );
        }
    }

    toggleGebuehrenBefreiung() {
        this.gebuehrenBefreiungOpen = !this.gebuehrenBefreiungOpen;
    }

    toggleWichtigeInfo() {
        if (
            !this.userService.userInfo.containsRolle(
                this.rollen.ROLLE_NOTIZ_VERW,
            ) &&
            !this.userService.userInfo.containsRolle(
                this.rollen.ROLLE_NOTIZ_LESEN,
            )
        ) {
            return;
        }

        this.wichtigeInfoOpen = !this.wichtigeInfoOpen;
    }
}
