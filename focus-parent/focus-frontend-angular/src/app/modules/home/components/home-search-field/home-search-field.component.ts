import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    EventEmitter,
    Injectable,
    OnDestroy,
    OnInit,
    Output,
} from "@angular/core";
import {
    ControlValueAccessor,
    ReactiveFormsModule,
    UntypedFormBuilder,
    UntypedFormControl,
    UntypedFormGroup,
    Validators,
} from "@angular/forms";
import { MatButtonModule } from "@angular/material/button";
import { MatSelectModule } from "@angular/material/select";
import { Observable, Subscription } from "rxjs";
import { LoadingIndicatorComponent } from "../../../shared/components/loading-indicator/loading-indicator.component";
import { RadioOption } from "../../../shared/components/radio/radio.component";
import { RollenConstant } from "../../../shared/constants/rollen.constant";
import { Dienstgeber } from "../../../shared/models/dienstgeber/dienstgeber.model";
import { Kunde } from "../../../shared/models/kunde.model";
import { Aufgabengebiet } from "../../../shared/models/kundenkontaktNeu/aufgabengebiet.model";
import { Person } from "../../../shared/models/Person.model";
import { UserInfo } from "../../../shared/models/userInfo.model";
import { KontaktService } from "../../../shared/services/backend/kontakt/kontakt.service";
import { SucheService } from "../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../shared/services/backend/user/user.service";
import { DialogService } from "../../../shared/services/frontend/dialog/dialog.service";
import { AufgValidator } from "../../../shared/validators/aufg.validator";
import { FachschluesselValidator } from "../../../shared/validators/fachschluessel.validator";
import { OrgidValidator } from "../../../shared/validators/orgid.validator";

@Component({
    selector: "f360-home-search-field",
    templateUrl: "./home-search-field.component.html",
    styleUrls: ["./home-search-field.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [
        LoadingIndicatorComponent,
        ReactiveFormsModule,
        MatSelectModule,
        MatButtonModule,
    ],
})
@Injectable({
    providedIn: "root",
})
export class HomeSearchFieldComponent
    implements ControlValueAccessor, OnInit, OnDestroy
{
    dienstgeber: Dienstgeber;
    kunde: Observable<Kunde>;
    kundeSubscription: Subscription;
    n: Subscription;
    @Output() onSearchFieldEnter: EventEmitter<string> =
        new EventEmitter<string>();
    rollen = RollenConstant;
    searchFieldForm: UntypedFormGroup;
    searchOptions: RadioOption[] = [];
    userInfo: UserInfo;
    versicherter: Person;
    private a: Aufgabengebiet;
    private unfilteredAufgabengebiete: Aufgabengebiet[] = [];

    constructor(
        private dialogService: DialogService,
        private kontaktService: KontaktService,
        private userService: UserService,
        private fb: UntypedFormBuilder,
        private sucheService: SucheService,
        private cd: ChangeDetectorRef,
    ) {
        this.searchOptions.push(
            { value: 0, label: "Versicherter" },
            { value: 1, label: "Dienstgeber" },
        );
    }

    manualSearch(searchFieldInput: string) {
        this.onSearchFieldEnter.emit(searchFieldInput);
    }

    ngOnDestroy(): void {
        if (this.n != null) {
            this.n.unsubscribe();
        }
        if (this.kundeSubscription != null) {
            this.kundeSubscription.unsubscribe();
        }
    }

    ngOnInit(): void {
        // TODO: localStorage auf SessionStorage umstellen, da so oder so bei jedem init alles gelöscht wird
        localStorage.removeItem("aufg");
        localStorage.removeItem("org");
        localStorage.removeItem("aufgId");
        localStorage.removeItem("subaufgg");
        this.userService.selectedAufgabengebiet = null;
        this.userService.selectedOrganisationseinheit = null;
        this._buildFormGroup();
        if (this.userService.userInfo) {
            this.userInfo = this.userService.userInfo;
        } else {
            this.n = this.userService.selectUserInfo().subscribe((userInfo) => {
                this.userInfo = userInfo;
                this.userService.userInfo = userInfo;
            });
        }

        this.versicherter = null;
        this.dienstgeber = null;

        this.kunde = this.sucheService.selectKunde();
        this.n = this.kunde.subscribe((value) => {
            if (value instanceof Person) {
                this.versicherter = value;
                this.cd.detectChanges();
            } else if (value instanceof Dienstgeber) {
                this.dienstgeber = value;
                this.cd.detectChanges();
            }
        });
    }

    onAufgabengebietChanged(event) {
        this.userService.selectedAufgabengebiet = event.valueOf();
    }

    onEnter(searchFieldInput: string) {
        if (this.searchFieldForm.valid) {
            this.onSearchFieldEnter.emit(searchFieldInput);
        } else {
            this.dialogService.openInvalidFsDialog(searchFieldInput);
        }
    }

    onSelectChange(event) {
        this.userService.selectedOrganisationseinheit = event.valueOf();
    }

    proceedToDash() {
        if (
            this.userService.selectedOrganisationseinheit ===
            "Ohne Organisationseinheit"
        ) {
            this.userService.selectedOrganisationseinheit = null;
            localStorage.setItem("org", null);
        } else if (
            this.userService.selectedOrganisationseinheit == null &&
            this.userInfo.containsRolle(RollenConstant.ROLLE_KONT_VERW)
        ) {
            this.dialogService.showError(
                "Sie müssen ein Kundenservice auswählen!",
            );
            return;
        }
        if (
            this.userService.selectedAufgabengebiet == null &&
            this.userInfo.containsRolle(RollenConstant.ROLLE_KONT_VERW)
        ) {
            this.dialogService.showError(
                "Sie müssen ein Aufgabengebiet auswählen!",
            );
            return;
        }

        localStorage.setItem("aufg", this.userService.selectedAufgabengebiet);
        localStorage.setItem(
            "org",
            this.userService.selectedOrganisationseinheit,
        );

        if (this.versicherter && this.versicherter.fs) {
            this.onSearchFieldEnter.emit(this.versicherter.fs.fachschluessel);
        } else if (this.dienstgeber && this.dienstgeber.fs) {
            this.onSearchFieldEnter.emit(this.dienstgeber.fs.fachschluessel);
        } else {
            this.onSearchFieldEnter.emit(null);
        }
        if (this.userInfo.offeneKontakte.length != 0) {
            if (this.userInfo.offeneKontakte[0].split(";", 1)[0] != "null") {
                this.manualSearch(
                    this.userInfo.offeneKontakte[0].split(";", 1)[0],
                );
                this.dialogService.openOffeneKontakteDialog(
                    this.userInfo.offeneKontakte[0].split(";", 1)[0],
                );
            }
        }

        if (this.userInfo.containsRolle(RollenConstant.ROLLE_KONT_VERW)) {
            this.kontaktService.loadAufgabengebiete().subscribe((value) => {
                this.unfilteredAufgabengebiete = value;
                this.a = this.unfilteredAufgabengebiete.find(
                    (g) =>
                        g.aufgabengebietBezeichnung ===
                        this.userService.selectedAufgabengebiet,
                );
                localStorage.setItem(
                    "aufgId",
                    JSON.stringify(this.a.aufgabengebietId),
                );
                this.kontaktService
                    .loadAufggSubMap(this.a.aufgabengebietId)
                    .subscribe((subaufggmaps) => {
                        this.userService.aufgabengebiete =
                            this.unfilteredAufgabengebiete.filter((aufgg) =>
                                subaufggmaps
                                    .map(
                                        (subaufggmap) =>
                                            subaufggmap.subAufgabengebietId,
                                    )
                                    .includes(aufgg.aufgabengebietId),
                            );
                        localStorage.setItem(
                            "subaufgg",
                            JSON.stringify(this.userService.aufgabengebiete),
                        );
                    });
            });
        }
    }

    registerOnChange(fn: any): void {}

    registerOnTouched(fn: any): void {}

    setDisabledState(isDisabled: boolean): void {}

    writeValue(obj: any): void {}

    setDefaultValue(userInfo: any) {
        this.userInfo = userInfo;
        if (
            this.userInfo.organisationseinheiten &&
            localStorage.getItem("org") == null
        ) {
            this.userService.selectedOrganisationseinheit =
                this.userInfo.organisationseinheiten[0];
            this.searchFieldForm
                .get("selectField")
                .setValue(this.userInfo.organisationseinheiten[0]);
            localStorage.setItem(
                "org",
                this.userService.selectedOrganisationseinheit,
            );
        }
        if (
            this.userInfo.aufgabengebiete &&
            localStorage.getItem("aufg") == null
        ) {
            this.userService.selectedAufgabengebiet =
                this.userInfo.aufgabengebiete[0];
            this.searchFieldForm
                .get("selectFieldAufg")
                .setValue(this.userInfo.aufgabengebiete[0]);
            localStorage.setItem(
                "aufg",
                this.userService.selectedAufgabengebiet,
            );
        }
        this.cd.detectChanges();
    }

    private _buildFormGroup() {
        this.searchFieldForm = new UntypedFormGroup({
            searchOption: new UntypedFormControl(0, [Validators.required]),
            searchField: new UntypedFormControl("", [
                Validators.required,
                FachschluesselValidator,
            ]),
            selectField: new UntypedFormControl("", [
                Validators.required,
                OrgidValidator,
            ]),
            selectFieldAufg: new UntypedFormControl("", [
                Validators.required,
                AufgValidator,
            ]),
        });
    }
}
