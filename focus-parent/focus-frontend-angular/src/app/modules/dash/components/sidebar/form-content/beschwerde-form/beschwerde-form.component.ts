import {
    ChangeDetectorRef,
    Component,
    EventEmitter,
    inject,
    Input,
    OnChanges,
    OnDestroy,
    OnInit,
    Output,
} from "@angular/core";
import {
    FormsModule,
    ReactiveFormsModule,
    UntypedFormBuilder,
} from "@angular/forms";
import { MatButtonModule } from "@angular/material/button";
import { MatOptionModule } from "@angular/material/core";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import { MatSelectModule } from "@angular/material/select";
import { Subscription } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { FabButtonComponent } from "../../../../../shared/components/fab-button/fab-button.component";
import { LoadingIndicatorComponent } from "../../../../../shared/components/loading-indicator/loading-indicator.component";
import { RadioOption } from "../../../../../shared/components/radio/radio.component";
import { RollenConstant } from "../../../../../shared/constants/rollen.constant";
import { BeschwerdeForm } from "../../../../../shared/models/beschwerdeForm.model";
import { FeedbackGrund } from "../../../../../shared/models/feedback/feedback-grund.model";
import { FeedbackLang } from "../../../../../shared/models/feedback/feedback-lang.model";
import { FeedbackThema } from "../../../../../shared/models/feedback/feedback-thema.model";
import { FeedbackUnterkategorie } from "../../../../../shared/models/feedback/feedback-unterkategorie.model";
import { FeedbackArt } from "../../../../../shared/models/feedback/feedbackart.model";
import { MeldendeStelle } from "../../../../../shared/models/feedback/meldende-stelle.model";
import { Status } from "../../../../../shared/models/feedback/status.model";
import { Kontaktart } from "../../../../../shared/models/kundenkontaktNeu/kontaktart.model";
import { BeschwerdeService } from "../../../../../shared/services/backend/beschwerde/beschwerde.service";
import { FeedbackCheckService } from "../../../../../shared/services/backend/beschwerde/FeedbackCheckService";
import { SucheService } from "../../../../../shared/services/backend/suche/suche.service";
import { UserService } from "../../../../../shared/services/backend/user/user.service";
import { AlertService } from "../../../../../shared/services/frontend/alert/alert.service";

@Component({
    selector: "f360-beschwerde-form",
    templateUrl: "./beschwerde-form.component.html",
    styleUrls: ["./beschwerde-form.component.scss"],
    standalone: true,
    imports: [
        LoadingIndicatorComponent,
        FabButtonComponent,
        MatFormFieldModule,
        MatInputModule,
        ReactiveFormsModule,
        FormsModule,
        MatSelectModule,
        MatOptionModule,
        MatButtonModule,
    ],
})
export class BeschwerdeFormComponent implements OnInit, OnDestroy, OnChanges {
    @Input() beschwerdeForm: BeschwerdeForm;
    beschwerdeGruende: RadioOption[] = [];
    beschwerdeLoadedSubscription: Subscription;
    @Output() closeFormEvent: EventEmitter<string> = new EventEmitter();
    currentFeedback: FeedbackLang;
    feedbackArtenAuswahl: FeedbackArt[];
    feedbackGruendeAuswahl: FeedbackGrund[];
    feedbackThemenAuswahl: FeedbackThema[];
    feedbackUnterkategorieAuswahl: FeedbackUnterkategorie[];
    grundAnzeige: Map<number, FeedbackGrund>;
    kontaktartAnzeige: Kontaktart[];
    meldendeStelleOptions = MeldendeStelle.data
        .filter((m) => m.id > 7)
        .sort((m1, m2) => m1.bezeichnung.localeCompare(m2.bezeichnung))
        .map((m) => m.bezeichnung);
    rollen = RollenConstant;
    themaAnzeige: FeedbackThema[];
    unterkategorieAnzeige: Map<number, FeedbackUnterkategorie>;
    protected readonly Kontaktart = Kontaktart;
    protected readonly Status = Status;
    private beschwerdeActive: boolean = false;
    private feedbackCheckService = inject(FeedbackCheckService);
    private themaGruende: FeedbackGrund[] = [];

    constructor(
        private userService: UserService,
        private cd: ChangeDetectorRef,
        private beschwerdeService: BeschwerdeService,
        private formBuilder: UntypedFormBuilder,
        private alertService: AlertService,
        private sucheService: SucheService,
    ) {}

    closeForm() {
        this.closeFormEvent.emit();
    }

    createdTodayByUser() {
        let feedback = this.beschwerdeForm.currentBeschwerde;
        let now: Date = new Date();
        return (
            feedback.erstellDatum.getUTCDay() == now.getUTCDay() &&
            feedback.erstellDatum.getUTCMonth() == now.getUTCMonth() &&
            feedback.erstellDatum.getUTCFullYear() == now.getUTCFullYear()
        );
    }

    feedbackBearbeitenPressed() {
        this.beschwerdeForm.bearbeitungsModus = true;
        this.cd.detectChanges();
    }

    getGrundDisplayName() {
        return this.beschwerdeForm.currentBeschwerde.grundId
            ? this.grundAnzeige.get(
                  this.beschwerdeForm.currentBeschwerde.grundId,
              ).bezeichnung
            : "";
    }

    getKontaktartDisplayName() {
        return this.beschwerdeForm.currentBeschwerde.kontaktArt
            ? this.kontaktartAnzeige?.find(
                  (value) =>
                      value.kontaktartId ===
                      this.beschwerdeForm.currentBeschwerde.kontaktArt,
              ).kontaktartBezeichnung
            : "";
    }

    getRueckmeldungValueById(id: number) {
        return FeedbackArt.getDescription(id);
    }

    getThemaById(themaId: number) {
        if (themaId) {
            return this.beschwerdeService.getThemaById(themaId);
        } else {
            return null;
        }
    }

    getThemaDisplayName() {
        return this.beschwerdeForm.currentBeschwerde.themaId
            ? this.themaAnzeige.find(
                  (value) =>
                      value.themaId ===
                      this.beschwerdeForm.currentBeschwerde.themaId,
              ).themaBezeichnung
            : "";
    }

    getTitle() {
        return (
            FeedbackArt.getById(
                this.beschwerdeForm.currentBeschwerde.feedbackArt,
            ).description +
            " - " +
            Status.getById(this.beschwerdeForm.currentBeschwerde.status)
                .description
        );
    }

    getUnterkategorie() {
        if (this.beschwerdeForm.currentBeschwerde.themaId) {
            return this.beschwerdeService.getUnterkategorieById(
                this.beschwerdeForm.currentBeschwerde.themaId,
                this.beschwerdeForm.currentBeschwerde.unterkategorieId,
            );
        } else {
            return null;
        }
    }

    getUnterkategorieById(themaId: number, unterkategorieId: number) {
        if (unterkategorieId) {
            return this.beschwerdeService.getUnterkategorieById(
                themaId,
                unterkategorieId,
            );
        } else {
            return null;
        }
    }

    getUnterkategorieDisplayName() {
        return this.beschwerdeForm.currentBeschwerde.unterkategorieId != null
            ? this.unterkategorieAnzeige.get(
                  this.beschwerdeForm.currentBeschwerde.unterkategorieId,
              )
            : "";
    }

    handleThemaChanged(themaId: number) {
        if (!themaId) {
            this.currentFeedback.themaId = null;
            this.feedbackUnterkategorieAuswahl = [];
            this.feedbackGruendeAuswahl = [];
            this.themaGruende = [];
        } else {
            let thema = this.getThemaById(themaId);
            this.currentFeedback.unterkategorieId = null;
            this.currentFeedback.grundId = null;
            this.currentFeedback.themaId = themaId;
            this.feedbackUnterkategorieAuswahl = thema.unterkategorien.filter(
                (value1) =>
                    value1.gueltigVon < new Date() &&
                    value1.gueltigBis > new Date(),
            );
            this.themaGruende = [];
            this.feedbackGruendeAuswahl = [];
            if (thema.unterkategorien.length == 0) {
                this.feedbackGruendeAuswahl = thema.gruende.filter(
                    (value1) =>
                        value1.gueltigVon < new Date() &&
                        value1.gueltigBis > new Date(),
                );
                this.themaGruende = thema.gruende;
            }
        }
    }

    handleUnterkategorieChanged(value: number) {
        if (!value) {
            this.currentFeedback.unterkategorieId = null;
        }
        let unterkategorie = this.getUnterkategorieById(
            this.currentFeedback.themaId,
            value,
        );
        this.currentFeedback.unterkategorieId = value;
        this.feedbackGruendeAuswahl = this.themaGruende;
        this.feedbackGruendeAuswahl = this.feedbackGruendeAuswahl.concat(
            unterkategorie.gruende.filter(
                (value1) =>
                    value1.gueltigVon < new Date() &&
                    value1.gueltigBis > new Date(),
            ),
        );
        this.feedbackGruendeAuswahl = this.feedbackGruendeAuswahl.filter(
            (e, i) =>
                this.feedbackGruendeAuswahl.findIndex((a) => a.equals(e)) === i,
        );
    }

    loadRadioOptions() {
        FeedbackArt.FeedbackArtOptionen.forEach((v) => {
            this.beschwerdeGruende.push({ value: v.id, label: v.description });
        });
    }

    loadSchluessel() {
        this.beschwerdeService
            .getUnterkategorien()
            .subscribe((value) => (this.unterkategorieAnzeige = value));
        this.beschwerdeService
            .getGruende()
            .subscribe((value) => (this.grundAnzeige = value));
        this.beschwerdeService
            .getThemen()
            .subscribe((value) => (this.themaAnzeige = value));
        this.beschwerdeService
            .getKontaktarten()
            .subscribe((value) => (this.kontaktartAnzeige = value));
    }

    loadThemenAuswahl() {
        this.beschwerdeService.getThemenFilteredByAufgG().subscribe((value) => {
            this.feedbackThemenAuswahl = value.filter(
                (value1) =>
                    value1.gruende.length > 0 ||
                    value1.unterkategorien.find(
                        (value2) => value2.gruende.length > 0,
                    ) !== undefined,
            );
            this.setupSelection();
        });
    }

    ngOnChanges(): void {}

    ngOnDestroy(): void {
        //es koennte sein, dass die componente zerstoert (geschlossen) wird
        //bevor das event gefeuert wurde - wird es nachdem die komponente
        //zerstoert wurde noch gefangen, wirft die change detection uns eine exception
        if (this.beschwerdeLoadedSubscription) {
            this.beschwerdeLoadedSubscription.unsubscribe();
        }
    }

    ngOnInit() {
        if (this.beschwerdeForm.currentBeschwerde == null) {
            this.beschwerdeLoadedSubscription =
                this.beschwerdeForm.beschwerdeLoaded.subscribe(() => {
                    this.cd.detectChanges();
                    this.setup();
                    this.beschwerdeForm.bearbeitungsModus =
                        false /*(this.beschwerdeForm.currentBeschwerde.updatecount == null)*/;
                });
        } else {
            this.setup();
        }
    }

    saveBeschwerde() {
        if (
            this.beschwerdeActive ||
            !this.feedbackCheckService.checkConstraints(
                this.currentFeedback,
                true,
            )
        ) {
            return;
        }
        this.beschwerdeActive = true;

        this.currentFeedback.copyValues(this.beschwerdeForm.currentBeschwerde);

        this.beschwerdeService
            .updateFeedback(this.beschwerdeForm.currentBeschwerde)
            .pipe(
                catchError(() => {
                    this.beschwerdeActive = false;
                    throw new Error("Subsystem nicht erreichbar.");
                }),
                map((data) => {
                    if (data.metainformation.status == "OK") {
                        return data;
                    } else {
                        throw new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        );
                    }
                }),
            )
            .subscribe(
                () => {
                    this.alertService.success("Kundenfeedback aktualisiert.");
                    this.sucheService.getFeedbackListeFS(
                        this.beschwerdeForm.fs,
                        this.beschwerdeForm.fsArt,
                        this.sucheService.versicherter.getValue().stammdaten
                            .pid,
                    );
                    this.closeForm();
                    this.beschwerdeActive = false;
                },
                (error: Error) => {
                    this.alertService.error(error.message);
                    this.beschwerdeActive = false;
                },
            );
    }

    setup() {
        this.feedbackThemenAuswahl = null;
        this.themaAnzeige = null;
        this.unterkategorieAnzeige = null;
        this.grundAnzeige = null;
        this.cd.detectChanges();
        this.loadThemenAuswahl();
        this.loadRadioOptions();
        this.loadSchluessel();
        this.feedbackArtenAuswahl = FeedbackArt.FeedbackArtOptionen;

        this.currentFeedback = FeedbackLang.createFeedbackLang(
            this.beschwerdeForm.currentBeschwerde,
        );
        this.cd.detectChanges();
    }

    setupSelection() {
        let thema = this.getThemaById(
            this.beschwerdeForm.currentBeschwerde.themaId,
        );
        this.feedbackGruendeAuswahl = thema.gruende;
        this.feedbackUnterkategorieAuswahl = thema.unterkategorien;
        let unterkat = this.getUnterkategorie();
        if (unterkat) {
            this.feedbackGruendeAuswahl = this.feedbackGruendeAuswahl.concat(
                unterkat.gruende,
            );
        }
        this.feedbackGruendeAuswahl = this.feedbackGruendeAuswahl.filter(
            (e, i) =>
                this.feedbackGruendeAuswahl.findIndex((a) => a.equals(e)) === i,
        );
    }

    protected readonly FeedbackUnterkategorie = FeedbackUnterkategorie;
}
