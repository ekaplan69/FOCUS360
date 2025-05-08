import { NgFor, NgIf } from "@angular/common";
import {
    AfterViewChecked,
    AfterViewInit,
    ChangeDetectorRef,
    Component,
    ElementRef,
    EventEmitter,
    inject,
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
import {
    MatButtonToggleChange,
    MatButtonToggleModule,
} from "@angular/material/button-toggle";
import { MatChipsModule } from "@angular/material/chips";
import { MatOptionModule } from "@angular/material/core";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import { MatSelectModule } from "@angular/material/select";
import { forkJoin, Observable, Subscription } from "rxjs";
import { FabButtonComponent } from "../../../../../shared/components/fab-button/fab-button.component";
import { LoadingIndicatorComponent } from "../../../../../shared/components/loading-indicator/loading-indicator.component";
import { RollenConstant } from "../../../../../shared/constants/rollen.constant";
import { Dienstgeber } from "../../../../../shared/models/dienstgeber/dienstgeber.model";
import { FeedbackGrund } from "../../../../../shared/models/feedback/feedback-grund.model";
import { FeedbackThema } from "../../../../../shared/models/feedback/feedback-thema.model";
import { FeedbackUnterkategorie } from "../../../../../shared/models/feedback/feedback-unterkategorie.model";
import { FeedbackArt } from "../../../../../shared/models/feedback/feedbackart.model";
import { Forms } from "../../../../../shared/models/forms.model";
import { KontaktForm } from "../../../../../shared/models/kundenkontakt/kontakt-form.model";
import { Abschlussart } from "../../../../../shared/models/kundenkontaktNeu/abschlussart.model";
import { Aufgabengebiet } from "../../../../../shared/models/kundenkontaktNeu/aufgabengebiet.model";
import { AufggAaMstMap } from "../../../../../shared/models/kundenkontaktNeu/aufggAaMstMap.model";
import { AufggKtMstMap } from "../../../../../shared/models/kundenkontaktNeu/aufggKtMstMap.model";
import { AufggThemaMstMap } from "../../../../../shared/models/kundenkontaktNeu/aufggThemaMstMap.model";
import { Kontaktart } from "../../../../../shared/models/kundenkontaktNeu/kontaktart.model";
import { Thema } from "../../../../../shared/models/kundenkontaktNeu/thema.model";
import { Unterthema } from "../../../../../shared/models/kundenkontaktNeu/unterthema.model";
import { Person } from "../../../../../shared/models/Person.model";
import { BeschwerdeService } from "../../../../../shared/services/backend/beschwerde/beschwerde.service";
import { FeedbackCheckService } from "../../../../../shared/services/backend/beschwerde/FeedbackCheckService";
import { KontaktService } from "../../../../../shared/services/backend/kontakt/kontakt.service";
import { SucheService } from "../../../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../../../shared/services/backend/user/user.service";
import { AlertService } from "../../../../../shared/services/frontend/alert/alert.service";
import { UiFunctionsService } from "../../../../../shared/services/frontend/util/ui-functions.service";
import { KundenkontaktFormTimerComponent } from "./kundenkontakt-form-timer/kundenkontakt-form-timer.component";

@Injectable({
    providedIn: "root",
})
@Component({
    selector: "f360-kundenkontakt-form",
    templateUrl: "./kundenkontakt-form.component.html",
    styleUrls: ["./kundenkontakt-form.component.scss"],
    standalone: true,
    imports: [
        LoadingIndicatorComponent,
        NgIf,
        FabButtonComponent,
        KundenkontaktFormTimerComponent,
        MatButtonToggleModule,
        NgFor,
        /*SelectComponent,*/ ReactiveFormsModule,
        FormsModule,
        MatFormFieldModule,
        MatInputModule,
        MatSelectModule,
        MatOptionModule,
        MatButtonModule,
        MatChipsModule,
    ],
})
export class KundenkontaktFormComponent
    implements OnInit, OnDestroy, AfterViewInit, AfterViewChecked
{
    abschlussartOptions: Abschlussart[] = [];
    abschlussarten;
    aufgabengebietOptions: string[] = [];
    aufgabengebiete: Aufgabengebiet[];
    aufggAaMstMapLoadedSubscription: Subscription;
    aufggAaMstMaps;
    aufggKtMstMapLoadedSubscription: Subscription;
    aufggKtMstMaps;
    aufggThemaMstMapLoadedSubscription: Subscription;
    aufggThemaMstMaps;
    @Output() closeFormEvent: EventEmitter<string> = new EventEmitter();
    gruende: FeedbackGrund[] = [];
    gruendeThema: FeedbackGrund[] = [];
    gruendeUnterkat: FeedbackGrund[] = [];
    @Input() kontaktForm: KontaktForm;
    kontaktLoadedSubscription: Subscription;
    kontaktLoeschenSubscription: Subscription;
    kontaktSavedSubscription: Subscription;
    kontaktartFocused = false;
    kontaktartOptions: Kontaktart[] = [];
    @ViewChild("kontaktartSection") kontaktartSection: ElementRef;
    kontaktarten;
    kontaktdetailsLoadedSubscription: Subscription; // Kontaktdetails: Aufgabengebiet, Abschlussart, Thema, Kontaktart
    rollen = RollenConstant;
    saveRunning: boolean = false;
    themaAnzeigeAls;
    themaOptions: Thema[] = [];
    themaOptionsDD: string[] = [];
    themaUnterkat: FeedbackUnterkategorie[] = [];
    themen;
    themenFeedback: FeedbackThema[] = null;
    unterthemen: Unterthema[];
    protected readonly FeedbackArt = FeedbackArt;
    private feedbackCheckService = inject(FeedbackCheckService);

    constructor(
        public kontaktService: KontaktService,
        public beschwerdeService: BeschwerdeService,
        private cd: ChangeDetectorRef,
        private userService: UserService,
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

        if (this.userService.selectedAufgabengebiet == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info(
                    "Aufgabengebiet muss ausgewählt werden.",
                );
            }
        }

        if (this.kontaktForm.currentKontakt.kontaktartId == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Kontaktart muss ausgewählt werden.");
            }
        }

        if (
            this.kontaktForm.currentKontakt.agd &&
            (this.kontaktForm.currentKontakt.agdName == null ||
                this.kontaktForm.currentKontakt.agdName.trim().length == 0)
        ) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info(
                    "Daten zur Drittperson muss ausgefüllt werden.",
                );
            }
        }

        if (this.kontaktForm.currentKontakt.abschlussartId == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Abschlussart muss ausgewählt werden.");
            }
        }

        if (this.kontaktForm.currentKontakt.themaId == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Thema muss ausgewählt werden.");
            }
        }

        if (
            this.kontaktForm.currentKontakt.themaId == 16 &&
            this.kontaktForm.currentKontakt.unterthemaId == null &&
            !this.kontaktForm.currentKontakt.anmerkung?.match(".*[a-z].*")
        ) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.error(
                    'Bei dem Thema "Sonstiges" muss eine Anmerkung angegeben oder Unterthema ausgewählt werden.',
                );
            }
        }

        if (
            (this.themaUnterkat.length > 0 || this.gruende.length > 0) &&
            !this.kontaktForm.currentKontakt.endeTs &&
            this.userService?.userInfo?.containsRolle(
                this.rollen.ROLLE_BESW_VERW,
            )
        ) {
            if (this.kontaktForm.currentFeedback.feedbackArt != null) {
                complete = !complete
                    ? false
                    : this.feedbackCheckService.checkConstraints(
                          this.kontaktForm.currentFeedback,
                          showErrorMessages,
                      );
            }
        }

        return complete;
    }

    closeForm() {
        KontaktForm.unfinishedKontaktOffen = false;
        if (
            !this.kontaktForm.currentKontakt.endeTs &&
            this.userService?.userInfo?.containsRolle(
                RollenConstant.ROLLE_KONT_VERW,
            )
        ) {
            KontaktForm.unregister();
            this.kontaktLoeschenSubscription = this.kontaktService
                .deleteKontakt(this.kontaktForm)
                .subscribe(
                    () => {
                        this.reloadKontakteList();
                        this.alertService.success(
                            "Unvollständiger Kontakt gelöscht.",
                        );
                        this.closeFormEvent.emit();
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

    createdTodayByUser() {
        return (
            this.userService.userInfo.benutzername ==
                this.kontaktForm.currentKontakt.ersteller &&
            this.kontaktForm.currentKontakt.erstellTs.substring(0, 10) ==
                this.formatDate(new Date())
        );
    }

    formatDate(date) {
        return [
            date.getFullYear(),
            this.padTo2Digits(date.getMonth() + 1),
            this.padTo2Digits(date.getDate()),
        ].join("-");
    }

    getFormValues() {
        if (
            this.aufgabengebietOptions &&
            this.userService.selectedAufgabengebiet
        ) {
            this.kontaktForm.currentKontakt.aufgabengebietId =
                Aufgabengebiet.getIdFromList(
                    this.aufgabengebiete,
                    this.userService.selectedAufgabengebiet,
                );
        }
        if (!this.kontaktForm.currentKontakt.agd) {
            this.kontaktForm.currentKontakt.agdFachschluessel = null;
            this.kontaktForm.currentKontakt.agdName = null;
        }

        let versicherter: Person = this.sucheService.versicherter.getValue();

        this.kontaktForm.fsArt = versicherter.fs.fachschluesselArt;
        this.kontaktForm.fsArt = versicherter.fs.fachschluessel;

        this.kontaktForm.currentFeedback.fachschluesselArt =
            versicherter.fs.fachschluesselArt;
        this.kontaktForm.currentFeedback.fachschluessel =
            versicherter.fs.fachschluessel;

        this.kontaktForm.currentFeedback.kontaktArt =
            this.kontaktForm.currentKontakt.kontaktartId;

        if (
            this.themaUnterkat.findIndex(
                (value) =>
                    value.id ==
                    this.kontaktForm.currentFeedback.unterkategorieId,
            ) == -1
        ) {
            this.kontaktForm.currentFeedback.unterkategorieId = null;
        }

        this.kontaktForm.currentFeedback.fullName =
            versicherter.stammdaten.name;
        this.kontaktForm.currentFeedback.beschreibung =
            this.kontaktForm.currentFeedback.beschreibung?.trim();
        this.kontaktForm.currentFeedback.verbesserung =
            this.kontaktForm.currentFeedback.verbesserung?.trim();
    }

    getGruendeThema(id: number) {
        this.gruende = [];
        this.gruendeUnterkat = [];
        this.kontaktForm.currentFeedback.grundId = null;
        this.kontaktForm.currentFeedback.unterkategorieId = null;

        this.themenFeedback.forEach((value) => {
            if (value.themaId == id) {
                this.gruendeThema = value.gruende.filter(
                    (value1) =>
                        value1.gueltigVon < new Date() &&
                        value1.gueltigBis > new Date(),
                );
            }
        });
        this.gruende = this.gruende.concat(this.gruendeThema);
        this.gruende = this.gruende.filter(
            (e, i) => this.gruende.findIndex((a) => a.equals(e)) === i,
        );
    }

    getGruendeUnterkat(unterKat: FeedbackUnterkategorie) {
        this.kontaktForm.currentFeedback.unterkategorieId = unterKat
            ? unterKat.id
            : null;
        this.gruende = [];
        this.gruende = this.gruende.concat(this.gruendeThema);
        this.gruendeUnterkat = unterKat.gruende.filter(
            (value1) =>
                value1.gueltigVon < new Date() &&
                value1.gueltigBis > new Date(),
        );
        this.gruende = this.gruende.concat(this.gruendeUnterkat);
        this.gruende = this.gruende.filter(
            (e, i) => this.gruende.findIndex((a) => a.equals(e)) === i,
        );

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(false);
        }
    }

    getUnterkatThema(themaId: number) {
        this.themenFeedback.forEach((value) => {
            if (themaId == value.themaId) {
                this.themaUnterkat = value.unterkategorien.filter(
                    (value1) =>
                        value1.gueltigVon < new Date() &&
                        value1.gueltigBis > new Date(),
                );
            }
        });
    }

    handleAGDCheckboxChanged(ticked: boolean) {
        if (this.saveRunning) {
            return;
        }
        this.kontaktForm.currentKontakt.agdName = null;
        this.kontaktForm.currentKontakt.agd = !ticked;
    }

    handleAbschlussartCheckboxEvent(ticked: boolean, id: number) {
        if (this.saveRunning) {
            return;
        }

        // alle weiteren details auf false setzen
        this.abschlussartOptions.forEach((el) => {
            if (el.abschlussartId != id) {
                el.ticked = false;
            }
        });

        if (!ticked) {
            this.kontaktForm.currentKontakt.abschlussartId = null;
        } else if (ticked) {
            this.kontaktForm.currentKontakt.abschlussartId = id;
            this.abschlussartOptions.find(
                (value) => value.abschlussartId == id,
            ).ticked = true;
        }

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(true);
        }
        this.cd.detectChanges();
    }

    handleFeedbackArtCheckboxEvent(event: MatButtonToggleChange) {
        if (
            event.source.value == this.kontaktForm.currentFeedback.feedbackArt
        ) {
            this.kontaktForm.currentFeedback.feedbackArt = null;
        } else {
            this.kontaktForm.currentFeedback.feedbackArt = event.source.value;
        }

        FeedbackArt.unselectAll();
        FeedbackArt.getById(event.source.value).ticked = true;

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(false);
        }
    }

    handleGrundChanged() {
        if (this.saveRunning) {
            return;
        }

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(false);
        }
    }

    handleKontaktartCheckboxEvent(ticked: boolean, id: number) {
        if (this.saveRunning) {
            return;
        }

        if (!ticked) {
            //element exists, checkbox false
            this.kontaktForm.currentKontakt.kontaktartId = null;
            this.kontaktForm.currentFeedback.kontaktArt = null;
        } else if (ticked) {
            //element does not exist, checkbox true
            this.kontaktForm.currentKontakt.kontaktartId = id;
            this.kontaktForm.currentFeedback.kontaktArt = id;

            //alle weiteren details auf false setzen
            this.kontaktartOptions.forEach((el) => {
                if (el.kontaktartId != id) {
                    el.ticked = false;
                }
            });
        }

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(false);
        }
        this.cd.detectChanges();
    }

    handleThemaCheckboxEvent(ticked: boolean, id: number) {
        if (this.saveRunning) {
            return;
        }

        if (!ticked) {
            //element exists, checkbox false
            this.kontaktForm.currentKontakt.themaId = null;
            this.kontaktForm.currentFeedback.themaId = null;
        } else if (ticked) {
            //element does not exist, checkbox true
            this.kontaktForm.currentKontakt.themaId = id;
            this.kontaktForm.currentFeedback.themaId = id;
            this.getUnterkatThema(id);
            this.getGruendeThema(id);

            //alle weiteren details auf false setzen
            this.themaOptions.forEach((el) => {
                if (el.themaId != id) {
                    el.ticked = false;
                }
            });
        }

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(false);
        }
        this.cd.detectChanges();
    }

    handleThemaSelectionChanged() {
        if (this.saveRunning) {
            return;
        }

        const thema = this.themaOptions.find(
            (t) => t.themaBezeichnung === this.kontaktForm.themaSelection,
        );
        this.kontaktForm.currentKontakt.themaId = thema ? thema.themaId : null;
        this.kontaktForm.currentFeedback.themaId = thema ? thema.themaId : null;

        if (this.kontaktForm.currentKontakt.endeTs == null) {
            this.saveKontakt(false);
        }
        this.getGruendeThema(thema ? thema.themaId : null);
        this.cd.detectChanges();
    }

    public handleUnterthemaCheckboxEvent(unterthema: Unterthema) {
        if (this.saveRunning) {
            return;
        }

        if (
            this.kontaktForm.currentKontakt.unterthemaId ==
            unterthema.unterthemaId
        ) {
            this.kontaktForm.currentKontakt.unterthemaId = null;
        } else {
            this.kontaktForm.currentKontakt.unterthemaId =
                unterthema.unterthemaId;
        }
    }

    initAbschlussarten(abschlussarten: Abschlussart[]) {
        this.abschlussarten = abschlussarten;
        this.abschlussarten.forEach((a) => (a.ticked = false));

        if (this.kontaktForm.currentKontakt !== null) {
            const abschlussart = this.abschlussarten.find(
                (a) => a.id === this.kontaktForm.currentKontakt.abschlussartId,
            );

            if (abschlussart == null) {
                return;
            }

            this.kontaktForm.abschlussartSelection = abschlussart.bezeichnung;
            abschlussart.ticked = true;
        }
    }

    initAufgabengebiete(aufgabengebiete: Aufgabengebiet[]) {
        const d =
            this.kontaktForm && this.kontaktForm.zeitpunktStart
                ? this.kontaktForm.zeitpunktStart
                : new Date();
        this.aufgabengebiete = aufgabengebiete.filter(
            (g) => d >= g.gueltigVon && d <= g.gueltigBis,
        );

        this.aufgabengebietOptions = this.aufgabengebiete.map(
            (a) => a.aufgabengebietBezeichnung,
        );

        if (
            this.aufgabengebietOptions &&
            this.kontaktForm.currentKontakt.aufgabengebietId != null
        ) {
            this.kontaktForm.aufgabengebietSelection =
                Aufgabengebiet.getDescriptionFromList(
                    this.aufgabengebiete,
                    this.kontaktForm.currentKontakt.aufgabengebietId,
                );
        }
    }

    initKontaktarten(kontaktarten: Kontaktart[]) {
        this.kontaktarten = kontaktarten;
        this.kontaktarten.forEach((a) => (a.ticked = false));

        if (this.kontaktForm.currentKontakt !== null) {
            const kontaktart = this.kontaktarten.find(
                (a) => a.id === this.kontaktForm.currentKontakt.kontaktartId,
            );

            if (kontaktart != null) {
                this.kontaktForm.kontaktartSelection = kontaktart.bezeichnung;
                kontaktart.ticked = true;
            }
        }
    }

    initThemen(themen: Thema[]) {
        this.themen = themen;
        this.themen.forEach((a) => (a.ticked = false));

        if (this.kontaktForm.currentKontakt !== null) {
            const thema = this.themen.find(
                (a) => a.themaId === this.kontaktForm.currentKontakt.themaId,
            );

            if (thema == null) {
                return;
            }

            this.kontaktForm.themaSelection = thema.themaBezeichnung;
            thema.ticked = true;
        }
    }

    initUnterthemen(unterthemen: Unterthema[]) {
        this.unterthemen = unterthemen;
        this.unterthemen.forEach((a) => (a.ticked = false));

        if (this.kontaktForm.currentKontakt !== null) {
            const unterthema = this.unterthemen.find(
                (a) =>
                    a.unterthemaId ===
                    this.kontaktForm.currentKontakt.unterthemaId,
            );

            if (unterthema == null) {
                return;
            }

            this.kontaktForm.unterthemaSelection =
                unterthema.unterthemaBezeichnung;
            unterthema.ticked = true;
        }
    }

    isSelectedThemaSonstige() {
        if (this.kontaktForm.currentKontakt.themaId === null) {
            return false;
        }

        return (
            this.themaOptions.find((t) => t.themaBezeichnung === "Sonstiges")
                ?.themaId === this.kontaktForm.currentKontakt.themaId
        );
    }

    kontaktBearbeitenPressed() {
        this.kontaktForm.bearbeitungsmodus = true;
        this.cd.detectChanges();
    }

    ngAfterViewChecked() {
        // Die Kontaktarten werden erst etwas später dazugeladen, das heißt sie sind nicht gleich beim Init vorhanden,
        // deshalb muss der Autofokus hier in ngAfterViewChecked passieren.
        // Da ngAfterViewChecked öfter aufgerufen wird (auch wenn der User bereits den Kontakt bearbeitet), muss über
        // this.kontaktartFocused gesteuert werden, dass die erste Kontaktart nur einmal am Anfang automatisch fokussiert wird.
        this.autofocusKontaktart();
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
        if (this.kontaktForm.currentKontakt == null) {
            this.kontaktForm.kontaktLoadedEvent.subscribe(() => {
                this.setup();
            });
        } else {
            this.setup();
        }
    }

    padTo2Digits(num) {
        return num.toString().padStart(2, "0");
    }

    public reloadFeedbackList() {
        this.sucheService.getFeedbackListeFS(
            this.sucheService.versicherter.getValue().fs.fachschluessel,
            this.sucheService.versicherter.getValue().fs.fachschluesselArt,
            this.sucheService.versicherter.getValue().stammdaten.pid,
        );
    }

    public reloadKontakteList() {
        if (
            this.sucheService.kunde.getValue().fs.fachschluesselArt ===
                "VSNR" ||
            this.sucheService.kunde.getValue().fs.fachschluesselArt === "BTNR"
        ) {
            this.sucheService.getKundenkontaktListe(
                this.sucheService.versicherter.getValue().fs.fachschluessel,
                this.sucheService.versicherter.getValue().fs.fachschluesselArt,
                this.sucheService.versicherter.getValue().stammdaten.pid,
            );
        } else if (
            this.sucheService.kunde.getValue().fs.fachschluesselArt === "DGNR"
        ) {
            const dienstgeber =
                this.sucheService.kunde.getValue() as Dienstgeber;
            this.sucheService.getKundenkontaktListe(
                dienstgeber.fs.fachschluessel,
                dienstgeber.fs.fachschluesselArt,
                dienstgeber.stammdaten.pid,
            );
        }
    }

    saveKontakt(showErrorMessages: boolean) {
        if (!this.checkFormComplete(showErrorMessages)) {
            return;
        }

        this.saveRunning = true;

        if (this.kontaktForm.currentKontakt.agd) {
            this.kontaktForm.currentKontakt.agdName =
                this.kontaktForm.currentKontakt.agdName.trim();
        }

        this.getFormValues();

        this.kontaktService
            .loadKontakt(
                this.kontaktForm.currentKontakt.kontaktId,
                this.sucheService.kunde.getValue().fs.fachschluessel,
                this.sucheService.kunde.getValue().fs.fachschluesselArt,
                this.sucheService.versicherter.getValue().stammdaten.pid,
            )
            .subscribe(
                (value) => {
                    if (
                        value == null ||
                        value.updatecount >
                            this.kontaktForm.currentKontakt.updatecount
                    ) {
                        this.alertService.error(
                            "Kontakt wurde bereits aktualisiert und konnte daher nicht gespeichert werden!",
                        );
                        this.reloadKontakteList();
                        this.closeFormEvent.emit();
                    } else {
                        if (
                            (this.themaUnterkat.length > 0 ||
                                this.gruende.length > 0) &&
                            !this.kontaktForm.currentKontakt.endeTs &&
                            this.userService?.userInfo?.containsRolle(
                                this.rollen.ROLLE_BESW_VERW,
                            ) &&
                            this.kontaktForm.currentFeedback.feedbackArt != null
                        ) {
                            this.kontaktSavedSubscription = forkJoin({
                                saveKontakt: this.kontaktService.saveKontakt(
                                    this.kontaktForm,
                                    this.sucheService.kunde.getValue(),
                                ),
                                saveBeschwerde:
                                    this.beschwerdeService.createFeedback(
                                        this.kontaktForm.currentFeedback,
                                    ),
                            }).subscribe(
                                () => {
                                    this.reloadKontakteList();
                                    this.reloadFeedbackList();
                                    this.alertService.success(
                                        "Erfolgreich gespeichert.",
                                    );
                                    this.closeFormEvent.emit();
                                    if (value.endeTs == null) {
                                        KontaktForm.unregister();
                                    }
                                },
                                (error1) => {
                                    this.alertService.error(error1.message);
                                },
                            );
                        } else {
                            this.kontaktService
                                .saveKontakt(
                                    this.kontaktForm,
                                    this.sucheService.kunde.getValue(),
                                )
                                .subscribe(() => {
                                    this.reloadKontakteList();
                                    this.alertService.success(
                                        "Erfolgreich gespeichert.",
                                    );
                                    this.closeFormEvent.emit();
                                    if (value.endeTs == null) {
                                        KontaktForm.unregister();
                                    }
                                });
                        }
                    }
                },
                () => {
                    this.alertService.error(
                        "Kontakt wurde bereits aktualisiert und konnte daher nicht gespeichert werden!",
                    );
                    this.reloadKontakteList();
                    this.closeFormEvent.emit();
                },
            );

        UiFunctionsService.focusSearchField();
    }

    saveKontaktShell(): Observable<any> {
        return this.kontaktService.saveKontaktShell(
            this.sucheService.kunde.getValue(),
        );
    }

    setup() {
        this.abschlussartOptions = null;
        this.aufgabengebietOptions = null;
        this.kontaktartOptions = null;
        this.themaOptions = null;
        this.themaOptionsDD = null;

        if (this.kontaktForm.currentFeedback.feedbackArt == null) {
            this.FeedbackArt.unselectAll();
        }

        // Paralleles Laden der Kontaktdetails mittels forkJoin(). Erst wenn alle 4 geladen sind, die weitere
        // Initialisierung fortsetzen (initAufgabengebiete() usw.)
        this.kontaktdetailsLoadedSubscription = forkJoin({
            aufgabengebiete: this.kontaktService.loadAufgabengebiete(),
            abschlussarten: this.kontaktService.loadAbschlussarten(),
            themen: this.kontaktService.loadThemen(),
            unterthemen: this.kontaktService.loadUnterthemen(),
            themenFeedback: this.beschwerdeService.getThemenAuswahl(),
            kontaktarten: this.kontaktService.loadKontaktarten(),
        }).subscribe(
            ({
                aufgabengebiete,
                abschlussarten,
                themen,
                unterthemen,
                kontaktarten,
                themenFeedback,
            }) => {
                this.themenFeedback = themenFeedback;
                this.initAufgabengebiete(aufgabengebiete);
                this.initAbschlussarten(abschlussarten);
                this.initThemen(themen);
                this.initUnterthemen(unterthemen);
                this.initKontaktarten(kontaktarten);
                this.setupDetailsForAufgabengebiet(); // erst ausführen, wenn loadAufgabengebiete() usw. ausgeführt wurde
                this.cd.detectChanges();
                if (this.kontaktForm.currentFeedback.themaId) {
                    this.getUnterkatThema(
                        this.kontaktForm.currentFeedback.themaId,
                    );
                    this.getGruendeThema(
                        this.kontaktForm.currentFeedback.themaId,
                    );
                }
            },
        );
    }

    setupDetailsForAufgabengebiet() {
        this.abschlussartOptions = [];
        this.kontaktartOptions = [];
        this.themaOptions = [];
        this.themaOptionsDD = [];

        let aufgabengebiet;
        if (this.userService.selectedAufgabengebiet == null) {
            return;
        }

        if (this.userService.selectedAufgabengebiet.length === 0) {
            this.userService.selectedAufgabengebiet =
                localStorage.getItem("aufg");
        }

        if (this.kontaktForm.currentKontakt.aufgabengebietId === null) {
            aufgabengebiet = this.aufgabengebiete.find(
                (g) =>
                    g.aufgabengebietBezeichnung ===
                    this.userService.selectedAufgabengebiet,
            );
        } else {
            aufgabengebiet = this.aufgabengebiete.find(
                (g) =>
                    g.aufgabengebietId ===
                    this.kontaktForm.currentKontakt.aufgabengebietId,
            );
        }

        this.themaAnzeigeAls =
            aufgabengebiet != null ? aufgabengebiet.anzeigeAls : null;
        if (aufgabengebiet) {
            this.loadAbschlussartenForMapping(aufgabengebiet);
            this.loadKontaktartenForMapping(aufgabengebiet);
            this.loadThemenForMapping(aufgabengebiet);
        }

        this.kontaktForm.aufgabengebietOptions = this.aufgabengebiete;
        this.kontaktForm.abschlussartOptions = this.abschlussarten;
        this.kontaktForm.kontaktartOptions = this.kontaktarten;
        this.kontaktForm.themaOptions = this.themen;
        this.kontaktForm.themaOptionsDD =
            this.themen != null
                ? this.themen.map((t) => t.themaBezeichnung)
                : null;

        const kontaktart = this.kontaktarten.find(
            (g) =>
                g.kontaktartId === this.kontaktForm.currentKontakt.kontaktartId,
        );
        if (kontaktart) {
            this.kontaktForm.kontaktartSelection =
                kontaktart.kontaktartBezeichnung;
        }

        const unterthema = this.unterthemen.find(
            (g) =>
                g.unterthemaId === this.kontaktForm.currentKontakt.unterthemaId,
        );
        if (unterthema) {
            this.kontaktForm.unterthemaSelection =
                unterthema.unterthemaBezeichnung;
        }

        const abschlussart = this.abschlussarten.find(
            (g) =>
                g.abschlussartId ===
                this.kontaktForm.currentKontakt.abschlussartId,
        );
        if (abschlussart) {
            this.kontaktForm.abschlussartSelection =
                abschlussart.abschlussartBezeichnung;
        }
    }

    showFeedback(): boolean {
        return (
            !this.kontaktForm.currentKontakt.endeTs &&
            this.userService?.userInfo?.containsRolle(
                this.rollen.ROLLE_BESW_VERW,
            ) &&
            (this.themaUnterkat?.find((value) => value.gruende.length > 0) !==
                undefined ||
                this.gruende.length > 0)
        );
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
                    this.kontaktForm && this.kontaktForm.zeitpunktStart
                        ? this.kontaktForm.zeitpunktStart
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
                        this.kontaktForm.currentKontakt.abschlussartId,
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
                    this.kontaktForm && this.kontaktForm.zeitpunktStart
                        ? this.kontaktForm.zeitpunktStart
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

                if (this.kontaktartOptions.length === 1) {
                    this.kontaktForm.currentKontakt.kontaktartId =
                        this.kontaktartOptions[0].kontaktartId;
                    this.kontaktartOptions[0].ticked = true;
                } else {
                    this.kontaktartOptions.forEach((kt) => (kt.ticked = false));
                    const foundKt = this.kontaktartOptions.find(
                        (kt) =>
                            kt.kontaktartId ===
                            this.kontaktForm.currentKontakt.kontaktartId,
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
                    this.kontaktForm && this.kontaktForm.zeitpunktStart
                        ? this.kontaktForm.zeitpunktStart
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
                        th.themaId === this.kontaktForm.currentKontakt.themaId,
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
