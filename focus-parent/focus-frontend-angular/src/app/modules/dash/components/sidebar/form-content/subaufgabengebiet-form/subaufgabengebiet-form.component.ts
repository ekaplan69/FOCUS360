import {
    AfterViewChecked,
    AfterViewInit,
    ChangeDetectorRef,
    Component,
    ElementRef,
    EventEmitter,
    Injectable,
    Input,
    OnDestroy,
    OnInit,
    Output,
    ViewChild,
} from "@angular/core";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatButtonModule } from "@angular/material/button";
// import {SelectComponent} from '../../../../../shared/components/select/select.component';
import { MatButtonToggleModule } from "@angular/material/button-toggle";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import { forkJoin, Observable, Subscription } from "rxjs";
import { LoadingIndicatorComponent } from "../../../../../shared/components/loading-indicator/loading-indicator.component";
import { RollenConstant } from "../../../../../shared/constants/rollen.constant";
import { Forms } from "../../../../../shared/models/forms.model";
import { SubaufgabengebietKontaktForm } from "../../../../../shared/models/kundenkontakt/subaufgabengebiet-kontakt.model";
import { Abschlussart } from "../../../../../shared/models/kundenkontaktNeu/abschlussart.model";
import { Aufgabengebiet } from "../../../../../shared/models/kundenkontaktNeu/aufgabengebiet.model";
import { AufggAaMstMap } from "../../../../../shared/models/kundenkontaktNeu/aufggAaMstMap.model";
import { AufggKtMstMap } from "../../../../../shared/models/kundenkontaktNeu/aufggKtMstMap.model";
import { AufggThemaMstMap } from "../../../../../shared/models/kundenkontaktNeu/aufggThemaMstMap.model";
import { Kontaktart } from "../../../../../shared/models/kundenkontaktNeu/kontaktart.model";
import { Thema } from "../../../../../shared/models/kundenkontaktNeu/thema.model";
import { KontaktService } from "../../../../../shared/services/backend/kontakt/kontakt.service";
import { SucheService } from "../../../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../../../shared/services/backend/user/user.service";
import { AlertService } from "../../../../../shared/services/frontend/alert/alert.service";
import { UiFunctionsService } from "../../../../../shared/services/frontend/util/ui-functions.service";
import { KundenkontaktFormTimerComponent } from "../kundenkontakt-form/kundenkontakt-form-timer/kundenkontakt-form-timer.component";

@Injectable({
    providedIn: "root",
})
@Component({
    selector: "f360-subaufgabengbiet-form",
    templateUrl: "./subaufgabengebiet-form.component.html",
    styleUrls: ["./subaufgabengebiet-form.component.scss"],
    standalone: true,
    imports: [
        LoadingIndicatorComponent,
        KundenkontaktFormTimerComponent,
        MatButtonToggleModule,
        /* SelectComponent,*/ ReactiveFormsModule,
        FormsModule,
        MatFormFieldModule,
        MatInputModule,
        MatButtonModule,
    ],
})
export class SubaufgabengebietFormComponent
    implements OnInit, OnDestroy, AfterViewInit, AfterViewChecked
{
    abschlussartOptions = [];
    abschlussarten;
    aufgabengebietOptions = [];
    aufgabengebiete;
    aufggAaMstMapLoadedSubscription: Subscription;
    aufggAaMstMaps;
    aufggKtMstMapLoadedSubscription: Subscription;
    aufggKtMstMaps;
    aufggThemaMstMapLoadedSubscription: Subscription;
    aufggThemaMstMaps;
    @Output() closeFormEvent: EventEmitter<string> = new EventEmitter();
    kontaktLoadedSubscription: Subscription;
    kontaktLoeschenSubscription: Subscription;
    kontaktSavedSubscription: Subscription;
    kontaktartFocused = false;
    kontaktartOptions = [];
    kontaktartOptionsRows = [];
    @ViewChild("kontaktartSection") kontaktartSection: ElementRef;
    kontaktarten;
    kontaktdetailsLoadedSubscription: Subscription; // Kontaktdetails: Aufgabengebiet, Abschlussart, Thema, Kontaktart
    rollen = RollenConstant;
    @Input() subaufgabengebietKontaktForm: SubaufgabengebietKontaktForm;
    themaAnzeigeAls;
    themaOptions = [];
    themaOptionsDD = [];
    themen;

    constructor(
        public kontaktService: KontaktService,
        private cd: ChangeDetectorRef,
        public userService: UserService,
        public alertService: AlertService,
        public sucheService: SucheService,
        public forms: Forms,
    ) {}

    autofocusKontaktart() {
        if (!this.kontaktartFocused && this.kontaktartSection) {
            const firstKontaktartCheckboxButton =
                this.kontaktartSection.nativeElement.firstChild;
            if (firstKontaktartCheckboxButton) {
                const firstKontaktartCheckboxLabels =
                    firstKontaktartCheckboxButton.getElementsByTagName("label");
                if (
                    firstKontaktartCheckboxLabels &&
                    firstKontaktartCheckboxLabels.length > 0
                ) {
                    // Es muss das Label fokussiert werden, die anderen Elemente können nicht fokussiert werden
                    firstKontaktartCheckboxLabels[0].focus();
                    this.kontaktartFocused = true;
                }
            }
        }
    }

    checkFormComplete(showErrorMessages: boolean): boolean {
        let complete = true;

        if (this.userService.selectedSubAufgabengebiet == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info(
                    "Aufgabengebiet muss ausgewählt werden.",
                );
            }
        }

        if (
            this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId ==
            null
        ) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Kontaktart muss ausgewählt werden.");
            }
        }

        if (
            this.subaufgabengebietKontaktForm.currentKontakt.abschlussartId ==
            null
        ) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Abschlussart muss ausgewählt werden.");
            }
        }

        if (this.subaufgabengebietKontaktForm.currentKontakt.themaId == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Thema muss ausgewählt werden.");
            }
        }

        return complete;
    }

    closeForm() {
        SubaufgabengebietKontaktForm.unfinishedKontaktOffen = false;
        if (
            !this.subaufgabengebietKontaktForm.currentKontakt.endeTs &&
            this.userService?.userInfo?.containsRolle(
                RollenConstant.ROLLE_KONT_VERW,
            )
        ) {
            this.kontaktLoeschenSubscription = this.kontaktService
                .deleteSubaufgabengebietKontakt(
                    this.subaufgabengebietKontaktForm.currentKontakt
                        .kontaktId ??
                        SubaufgabengebietKontaktForm.registeredSVNR,
                )
                .subscribe(
                    () => {
                        this.alertService.success(
                            "Unvollständiger Kontakt gelöscht.",
                        );
                        SubaufgabengebietKontaktForm.unregister();
                        this.closeFormEvent.emit();
                        this.userService.selectedSubAufgabengebiet = null;
                        this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId =
                            null;
                        this.subaufgabengebietKontaktForm.currentKontakt.themaId =
                            null;
                        this.subaufgabengebietKontaktForm.currentKontakt.abschlussartId =
                            null;
                    },
                    (error1) => {
                        this.alertService.error(error1.message);
                    },
                );
        } else {
            this.closeFormEvent.emit();
        }

        UiFunctionsService.focusSearchField();
    }

    getFormValues() {
        if (
            this.aufgabengebietOptions &&
            this.userService.selectedSubAufgabengebiet
        ) {
            this.subaufgabengebietKontaktForm.currentKontakt.aufgabengebietId =
                Aufgabengebiet.getIdFromList(
                    this.aufgabengebiete,
                    this.userService.selectedSubAufgabengebiet,
                );
        }
        if (!this.subaufgabengebietKontaktForm.currentKontakt.agd) {
            this.subaufgabengebietKontaktForm.currentKontakt.agdFachschluessel =
                null;
            this.subaufgabengebietKontaktForm.currentKontakt.agdName = null;
        }
    }

    handleAbschlussartCheckboxEvent(ticked: boolean, id: number) {
        if (!ticked) {
            // element exists, checkbox false
            this.subaufgabengebietKontaktForm.currentKontakt.abschlussartId =
                null;
        } else if (ticked) {
            // element does not exist, checkbox true
            this.subaufgabengebietKontaktForm.currentKontakt.abschlussartId =
                id;

            // alle weiteren details auf false setzen
            this.abschlussartOptions.forEach((el) => {
                if (el.abschlussartId != id) {
                    el.ticked = false;
                }
            });
        }

        if (this.subaufgabengebietKontaktForm.currentKontakt.endeTs == null) {
            this.saveSubaufgabengebietKontakt(true);
        }
        this.cd.detectChanges();
    }

    handleKontaktartCheckboxEvent(ticked: boolean, id: number) {
        if (!ticked) {
            // element exists, checkbox false
            this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId =
                null;
        } else if (ticked) {
            // element does not exist, checkbox true
            this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId = id;

            // alle weiteren details auf false setzen
            this.kontaktartOptions.forEach((el) => {
                if (el.kontaktartId != id) {
                    el.ticked = false;
                }
            });
        }

        if (this.subaufgabengebietKontaktForm.currentKontakt.endeTs == null) {
            this.saveSubaufgabengebietKontakt(false);
        }
        this.cd.detectChanges();
    }

    handleThemaCheckboxEvent(ticked: boolean, id: number) {
        if (!ticked) {
            // element exists, checkbox false
            this.subaufgabengebietKontaktForm.currentKontakt.themaId = null;
        } else if (ticked) {
            // element does not exist, checkbox true
            this.subaufgabengebietKontaktForm.currentKontakt.themaId = id;

            // alle weiteren details auf false setzen
            this.themaOptions.forEach((el) => {
                if (el.themaId != id) {
                    el.ticked = false;
                }
            });
        }

        if (this.subaufgabengebietKontaktForm.currentKontakt.endeTs == null) {
            this.saveSubaufgabengebietKontakt(false);
        }
        this.cd.detectChanges();
    }

    handleThemaSelectionChanged() {
        const thema = this.themaOptions.find(
            (t) =>
                t.themaBezeichnung ===
                this.subaufgabengebietKontaktForm.themaSelection,
        );
        this.subaufgabengebietKontaktForm.currentKontakt.themaId = thema
            ? thema.themaId
            : null;

        if (this.subaufgabengebietKontaktForm.currentKontakt.endeTs == null) {
            this.saveSubaufgabengebietKontakt(false);
        }
        this.cd.detectChanges();
    }

    initAbschlussarten(abschlussarten: Abschlussart[]) {
        this.abschlussarten = abschlussarten;
        this.abschlussarten.forEach((a) => (a.ticked = false));

        if (this.subaufgabengebietKontaktForm.currentKontakt !== null) {
            const abschlussart = this.abschlussarten.find(
                (a) =>
                    a.id ===
                    this.subaufgabengebietKontaktForm.currentKontakt
                        .abschlussartId,
            );

            if (abschlussart == null) {
                return;
            }

            this.subaufgabengebietKontaktForm.abschlussartSelection =
                abschlussart.bezeichnung;
            abschlussart.ticked = true;
        }
    }

    initAufgabengebiete(aufgabengebiete: Aufgabengebiet[]) {
        const d =
            this.subaufgabengebietKontaktForm &&
            this.subaufgabengebietKontaktForm.zeitpunktStart
                ? this.subaufgabengebietKontaktForm.zeitpunktStart
                : new Date();
        this.aufgabengebiete = aufgabengebiete.filter(
            (g) => d >= g.gueltigVon && d <= g.gueltigBis,
        );

        this.aufgabengebietOptions = this.aufgabengebiete.map(
            (a) => a.aufgabengebietBezeichnung,
        );

        if (
            this.aufgabengebietOptions &&
            this.subaufgabengebietKontaktForm.currentKontakt
                ?.aufgabengebietId != null
        ) {
            this.subaufgabengebietKontaktForm.aufgabengebietSelection =
                Aufgabengebiet.getDescriptionFromList(
                    this.aufgabengebiete,
                    this.subaufgabengebietKontaktForm.currentKontakt
                        .aufgabengebietId,
                );
        }
    }

    initKontaktarten(kontaktarten: Kontaktart[]) {
        this.kontaktarten = kontaktarten;
        this.kontaktarten.forEach((a) => (a.ticked = false));

        if (this.subaufgabengebietKontaktForm.currentKontakt !== null) {
            const kontaktart = this.kontaktarten.find(
                (a) =>
                    a.id ===
                    this.subaufgabengebietKontaktForm.currentKontakt
                        .kontaktartId,
            );

            if (kontaktart != null) {
                this.subaufgabengebietKontaktForm.kontaktartSelection =
                    kontaktart.bezeichnung;
                kontaktart.ticked = true;
            }
        }
    }

    initThemen(themen: Thema[]) {
        this.themen = themen;
        this.themen.forEach((a) => (a.ticked = false));

        if (this.subaufgabengebietKontaktForm.currentKontakt !== null) {
            const thema = this.themen.find(
                (a) =>
                    a.id ===
                    this.subaufgabengebietKontaktForm.currentKontakt.themaId,
            );

            if (thema == null) {
                return;
            }

            this.subaufgabengebietKontaktForm.themaSelection =
                thema.bezeichnung;
            thema.ticked = true;
        }
    }

    ngAfterViewChecked() {
        // Die Kontaktarten werden erst etwas später dazugeladen, das heißt sie sind nicht gleich beim Init vorhanden,
        // deshalb muss der Autofokus hier in ngAfterViewChecked passieren.
        // Da ngAfterViewChecked öfter aufgerufen wird (auch wenn der User bereits den Kontakt bearbeitet), muss über
        // this.kontaktartFocused gesteuert werden, dass die erste Kontaktart nur einmal am Anfang automatisch fokussiert wird.
        this.autofocusKontaktart();
        if (
            this.kontaktartOptions != null &&
            this.kontaktartOptions.length === 1 &&
            this.subaufgabengebietKontaktForm.currentKontakt != null &&
            this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId ==
                null
        ) {
            this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId =
                this.kontaktartOptions[0].kontaktartId;
            this.subaufgabengebietKontaktForm.kontaktartSelection =
                this.kontaktartOptions[0].kontaktartBezeichnung;
            this.kontaktartOptions[0].ticked = true;
        }
    }

    ngAfterViewInit() {
        this.kontaktartFocused = false;
    }

    ngOnDestroy(): void {
        if (this.kontaktLoadedSubscription) {
            this.kontaktLoadedSubscription.unsubscribe();
        }
        if (this.kontaktSavedSubscription) {
            this.kontaktSavedSubscription.unsubscribe();
        }
        if (this.kontaktLoeschenSubscription) {
            this.kontaktLoeschenSubscription.unsubscribe();
        }
        if (this.kontaktdetailsLoadedSubscription) {
            this.kontaktdetailsLoadedSubscription.unsubscribe();
        }
        if (this.aufggAaMstMapLoadedSubscription) {
            this.aufggAaMstMapLoadedSubscription.unsubscribe();
        }
        if (this.aufggKtMstMapLoadedSubscription) {
            this.aufggKtMstMapLoadedSubscription.unsubscribe();
        }
        if (this.aufggThemaMstMapLoadedSubscription) {
            this.aufggThemaMstMapLoadedSubscription.unsubscribe();
        }
    }

    ngOnInit() {
        this.setup();
    }

    saveKontaktShell(): Observable<any> {
        return this.kontaktService.saveSubaufggShell(
            this.userService.aufgabengebiete.find(
                (g) =>
                    g.aufgabengebietBezeichnung ==
                    this.userService.selectedSubAufgabengebiet,
            ).aufgabengebietId,
        );
    }

    saveSubaufgabengebietKontakt(showErrorMessages: boolean) {
        if (!this.checkFormComplete(showErrorMessages)) {
            return;
        }

        this.getFormValues();
        this.userService.selectedSubAufgabengebiet = null;

        this.kontaktService
            .loadKontaktOhneFS(
                this.subaufgabengebietKontaktForm.currentKontakt.kontaktId,
            )
            .subscribe(
                (value) => {
                    if (
                        value == null ||
                        value.updatecount >
                            this.subaufgabengebietKontaktForm.currentKontakt
                                .updatecount
                    ) {
                        this.alertService.error(
                            "Kontakt wurde bereits aktualisiert und konnte daher nicht gespeichert werden!",
                        );
                        this.closeFormEvent.emit();
                    } else {
                        this.kontaktSavedSubscription = this.kontaktService
                            .saveSubaufgabengebietKontakt(
                                this.subaufgabengebietKontaktForm,
                            )
                            .subscribe(
                                () => {
                                    this.alertService.success(
                                        "Erfolgreich gespeichert.",
                                    );
                                    this.closeFormEvent.emit();
                                    this.userService.selectedSubAufgabengebiet =
                                        null;
                                    this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId =
                                        null;
                                    this.subaufgabengebietKontaktForm.currentKontakt.themaId =
                                        null;
                                    this.subaufgabengebietKontaktForm.currentKontakt.abschlussartId =
                                        null;
                                },
                                (error1) => {
                                    this.alertService.error(error1.message);
                                },
                            );
                    }
                },
                () => {
                    this.alertService.error(
                        "Hülle konnte nicht gefunden werden!",
                    );
                    this.closeFormEvent.emit();
                },
            );
        SubaufgabengebietKontaktForm.unregister();

        UiFunctionsService.focusSearchField();
    }

    setup() {
        this.abschlussartOptions = null;
        this.aufgabengebietOptions = null;
        this.kontaktartOptions = null;
        this.themaOptions = null;
        this.themaOptionsDD = null;

        // Paralleles Laden der Kontaktdetails mittels forkJoin(). Erst wenn alle 4 geladen sind, die weitere
        // Initialisierung fortsetzen (initAufgabengebiete() usw.)
        this.kontaktdetailsLoadedSubscription = forkJoin({
            aufgabengebiete: this.kontaktService.loadAufgabengebiete(),
            abschlussarten: this.kontaktService.loadAbschlussarten(),
            themen: this.kontaktService.loadThemen(),
            kontaktarten: this.kontaktService.loadKontaktarten(),
        }).subscribe(
            ({ aufgabengebiete, abschlussarten, themen, kontaktarten }) => {
                this.initAufgabengebiete(aufgabengebiete);
                this.initAbschlussarten(abschlussarten);
                this.initThemen(themen);
                this.initKontaktarten(kontaktarten);
                this.setupDetailsForAufgabengebiet(); // erst ausführen, wenn loadAufgabengebiete() usw. ausgeführt wurde
                this.cd.detectChanges();
            },
        );
    }

    setupDetailsForAufgabengebiet() {
        this.abschlussartOptions = [];
        this.kontaktartOptions = [];
        this.themaOptions = [];
        this.themaOptionsDD = [];

        let aufgabengebiet;
        if (this.userService.selectedSubAufgabengebiet == null) {
            if (
                this.subaufgabengebietKontaktForm.currentKontakt
                    .aufgabengebietId === null
            ) {
                aufgabengebiet = this.aufgabengebiete.find(
                    (g) =>
                        g.aufgabengebietBezeichnung ===
                        this.userService.selectedSubAufgabengebiet,
                );
            } else {
                aufgabengebiet = this.aufgabengebiete.find(
                    (g) =>
                        g.aufgabengebietId ===
                        this.subaufgabengebietKontaktForm.currentKontakt
                            .aufgabengebietId,
                );
            }
        } else {
            aufgabengebiet = this.aufgabengebiete.find(
                (g) =>
                    g.aufgabengebietBezeichnung ===
                    this.userService.selectedSubAufgabengebiet,
            );
        }

        this.themaAnzeigeAls =
            aufgabengebiet != null ? aufgabengebiet.anzeigeAls : null;
        if (aufgabengebiet) {
            this.loadAbschlussartenForMapping(aufgabengebiet);
            this.loadKontaktartenForMapping(aufgabengebiet);
            this.loadThemenForMapping(aufgabengebiet);
        }

        this.subaufgabengebietKontaktForm.aufgabengebietOptions =
            this.aufgabengebiete;
        this.subaufgabengebietKontaktForm.abschlussartOptions =
            this.abschlussarten;
        this.subaufgabengebietKontaktForm.kontaktartOptions = this.kontaktarten;
        this.subaufgabengebietKontaktForm.themaOptions = this.themen;
        this.subaufgabengebietKontaktForm.themaOptionsDD =
            this.themen != null
                ? this.themen.map((t) => t.themaBezeichnung)
                : null;

        const kontaktart = this.kontaktarten.find(
            (g) =>
                g.kontaktartId ===
                this.subaufgabengebietKontaktForm.currentKontakt?.kontaktartId,
        );
        if (kontaktart) {
            this.subaufgabengebietKontaktForm.kontaktartSelection =
                kontaktart.kontaktartBezeichnung;
        }

        const thema = this.themen.find(
            (g) =>
                g.themaId ===
                this.subaufgabengebietKontaktForm.currentKontakt?.themaId,
        );
        if (thema) {
            this.subaufgabengebietKontaktForm.themaSelection =
                thema.themaBezeichnung;
        }

        const abschlussart = this.abschlussarten.find(
            (g) =>
                g.abschlussartId ===
                this.subaufgabengebietKontaktForm.currentKontakt
                    ?.abschlussartId,
        );
        if (abschlussart) {
            this.subaufgabengebietKontaktForm.abschlussartSelection =
                abschlussart.abschlussartBezeichnung;
        }
    }

    /**
     * Abschlussarten fürs Mapping laden.
     * Hinweis CONCURRENCY: Lädt im Hintergrund Daten, diese sind nach Abschluss der Methode noch nicht verfügbar.
     * @param aufgabengebiet
     * @private
     */
    private loadAbschlussartenForMapping(aufgabengebiet) {
        this.aufggAaMstMapLoadedSubscription = this.kontaktService
            .loadAufggAaMstMap()
            .subscribe((map: AufggAaMstMap[]) => {
                const d =
                    this.subaufgabengebietKontaktForm &&
                    this.subaufgabengebietKontaktForm.zeitpunktStart
                        ? this.subaufgabengebietKontaktForm.zeitpunktStart
                        : new Date();
                this.aufggAaMstMaps = map
                    .filter(
                        (g) =>
                            g.aufgabengebietId ===
                            aufgabengebiet.aufgabengebietId,
                    )
                    .filter((g) => d >= g.gueltigVon && d <= g.gueltigBis);
                const abschlussartIds = this.aufggAaMstMaps.map(
                    (abschlussart) => abschlussart.abschlussartId,
                );
                this.abschlussarten.forEach((abschlussart: Abschlussart) => {
                    if (
                        !this.abschlussartOptions.includes(abschlussart) &&
                        abschlussartIds.includes(abschlussart.abschlussartId)
                    ) {
                        this.abschlussartOptions.push(abschlussart);
                    }
                });
                this.abschlussartOptions.forEach(
                    (abschlussart) => (abschlussart.ticked = false),
                );
                const foundAa = this.abschlussartOptions.find(
                    (abschlussart) =>
                        abschlussart.abschlussartId ===
                        this.subaufgabengebietKontaktForm.currentKontakt
                            ?.abschlussartId,
                );
                if (foundAa != null) {
                    foundAa.ticked = true;
                }
                this.cd.detectChanges();
            });
    }

    /**
     * Kontaktarten fürs Mapping laden.
     * Hinweis CONCURRENCY: Lädt im Hintergrund Daten, diese sind nach Abschluss der Methode noch nicht verfügbar.
     * @param aufgabengebiet
     * @private
     */
    private loadKontaktartenForMapping(aufgabengebiet) {
        this.aufggKtMstMapLoadedSubscription = this.kontaktService
            .loadAufggKtMstMap()
            .subscribe((map: AufggKtMstMap[]) => {
                const d =
                    this.subaufgabengebietKontaktForm &&
                    this.subaufgabengebietKontaktForm.zeitpunktStart
                        ? this.subaufgabengebietKontaktForm.zeitpunktStart
                        : new Date();
                this.aufggKtMstMaps = map
                    .filter(
                        (g) =>
                            g.aufgabengebietId ===
                            aufgabengebiet.aufgabengebietId,
                    )
                    .filter((g) => d >= g.gueltigVon && d <= g.gueltigBis);
                const ktIds = this.aufggKtMstMaps.map((kt) => kt.kontaktartId);
                this.kontaktarten.forEach((kt: Kontaktart) => {
                    if (
                        !this.kontaktartOptions.includes(kt) &&
                        ktIds.includes(kt.kontaktartId)
                    ) {
                        this.kontaktartOptions.push(kt);
                    }
                });

                if (
                    this.kontaktartOptions.length === 1 &&
                    this.subaufgabengebietKontaktForm.currentKontakt !== null
                ) {
                    this.subaufgabengebietKontaktForm.currentKontakt.kontaktartId =
                        this.kontaktartOptions[0].kontaktartId;
                    this.kontaktartOptions[0].ticked = true;
                } else {
                    this.kontaktartOptions.forEach((kt) => (kt.ticked = false));
                    const foundKt = this.kontaktartOptions.find(
                        (kt) =>
                            kt.kontaktartId ===
                            this.subaufgabengebietKontaktForm.currentKontakt
                                ?.kontaktartId,
                    );
                    if (foundKt != null) {
                        foundKt.ticked = true;
                    }
                }
                this.cd.detectChanges();
            });
    }

    /**
     * Themen fürs Mapping laden.
     * Hinweis CONCURRENCY: Lädt im Hintergrund Daten, diese sind nach Abschluss der Methode noch nicht verfügbar.
     * @param aufgabengebiet
     * @private
     */
    private loadThemenForMapping(aufgabengebiet) {
        this.aufggThemaMstMapLoadedSubscription = this.kontaktService
            .loadAufggThemaMstMap()
            .subscribe((map: AufggThemaMstMap[]) => {
                const d =
                    this.subaufgabengebietKontaktForm &&
                    this.subaufgabengebietKontaktForm.zeitpunktStart
                        ? this.subaufgabengebietKontaktForm.zeitpunktStart
                        : new Date();
                this.aufggThemaMstMaps = map
                    .filter(
                        (g) =>
                            g.aufgabengebietId ===
                            aufgabengebiet.aufgabengebietId,
                    )
                    .filter((g) => d >= g.gueltigVon && d <= g.gueltigBis);
                const thIds = this.aufggThemaMstMaps.map((th) => th.themaId);
                this.themen.forEach((th: Thema) => {
                    if (
                        !this.themaOptions.includes(th) &&
                        thIds.includes(th.themaId)
                    ) {
                        this.themaOptions.push(th);
                    }
                });
                if (this.themaOptions != null) {
                    this.themaOptions.sort((a, b) =>
                        a.themaBezeichnung
                            .toUpperCase()
                            .localeCompare(b.themaBezeichnung.toUpperCase()),
                    );
                }
                this.themaOptions.forEach((th) => (th.ticked = false));
                const thema = this.themaOptions.find(
                    (th) =>
                        th.themaId ===
                        this.subaufgabengebietKontaktForm.currentKontakt
                            ?.themaId,
                );
                if (thema != null) {
                    thema.ticked = true;
                }
                this.themaOptionsDD =
                    this.themaOptions != null
                        ? this.themaOptions.map((t) => t.themaBezeichnung)
                        : null;
                this.cd.detectChanges();
            });
    }
}
