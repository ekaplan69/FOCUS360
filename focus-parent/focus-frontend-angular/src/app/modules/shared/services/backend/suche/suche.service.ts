import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { BehaviorSubject, EMPTY, forkJoin } from "rxjs";
import { Observable } from "rxjs/internal/Observable";
import { catchError, map } from "rxjs/operators";
import { RollenConstant } from "../../../constants/rollen.constant";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { ErrorDialogComponent } from "../../../dialogs/error-dialog/error-dialog.component";
import { HttpHandlerInterceptorMapping } from "../../../interceptors/http-handler-interceptor-mapping.service";
import { Angehoeriger } from "../../../models/angehoeriger.model";
import { DienstgeberFactory } from "../../../models/dienstgeber/dienstgeber.factory";
import { Dienstgeber } from "../../../models/dienstgeber/dienstgeber.model";
import { DokumentKurz } from "../../../models/dokumente/dokumentKurz.model";
import { ECard } from "../../../models/eCard.model";
import { ErrorMeldung } from "../../../models/errorMeldung.model";
import { Fachschluessel } from "../../../models/Fachschluessel.model";
import { FeedbackKurz } from "../../../models/feedback/feedback-kurz.model";
import { GebuehrenBefreiung } from "../../../models/gebuehrenBefreiung.model";
import { Kunde } from "../../../models/kunde.model";
import { Kundenkontakt } from "../../../models/kundenkontakt.model";
import { KontaktForm } from "../../../models/kundenkontakt/kontakt-form.model";
import { KontaktKurz } from "../../../models/kundenkontaktNeu/kontaktKurz.model";
import { Leistung } from "../../../models/leistung.model";
import { Mitversicherung } from "../../../models/mitversicherung.model";
import { Notiz } from "../../../models/notiz.model";
import { PersonDetailSearchForm } from "../../../models/person-detail-search-form.model";
import { PersonFactory } from "../../../models/person.factory";
import { Person } from "../../../models/Person.model";
import { Versicherungszeit } from "../../../models/versicherungszeit.model";
import { ChipService } from "../../frontend/chip/chip.service";
import { DialogService } from "../../frontend/dialog/dialog.service";
import { EcadminUrlService } from "../../frontend/ecadmin/ecadmin-url.service";
import { LgkkUrlService } from "../../frontend/leistung/lgkk-url.service";
import { TransactionIdGenerator } from "../../frontend/transaction/transaction-id-generator.service";
import { VdaDashboardUrlService } from "../../frontend/vda/vda-dashboard-url.service";
import { ZpvDashboardUrlService } from "../../frontend/zpv/zpv-dashboard-url.service";
import { LgkkRequest } from "../../requests/lgkk.request";
import { UserService } from "../user/user.service";

@Injectable({
    providedIn: "root",
})
export class SucheService {
    private _KVAResponseError: ErrorMeldung;
    private _angehoerigeResponseError: ErrorMeldung;
    private _cachedKunden: Kunde[] = [];
    private _cachedVersicherte: Person[] = [];
    private _dokumenteReadResponseError: ErrorMeldung;
    private _dokumenteResponseError: ErrorMeldung;
    private _ecardResponseError: ErrorMeldung;
    private _kundenfeedbackResponseError: ErrorMeldung;
    private _leistungResponseError: ErrorMeldung;
    private _versicherteResponseError: ErrorMeldung;
    private _zpvResponseError: ErrorMeldung;
    private _zvdResponseError: ErrorMeldung;
    private currentLgkkRequest = LgkkRequest.empty();
    private zpvFehler = ["F", "S"];

    constructor(
        private http: HttpClient,
        private chipService: ChipService,
        private dialogService: DialogService,
        private userService: UserService,
        private personFactory: PersonFactory,
        private dienstgeberFactory: DienstgeberFactory,
        private transactionIdGenerator: TransactionIdGenerator,
        private lgkkUrlService: LgkkUrlService,
        private zpvUrlService: ZpvDashboardUrlService,
        private vdaUrlService: VdaDashboardUrlService,
        private ecadminUrlService: EcadminUrlService,
        private httpHandlerInterceptorMapping: HttpHandlerInterceptorMapping,
    ) {}

    private _kunde = new BehaviorSubject<Kunde>(null);

    get kunde(): BehaviorSubject<Kunde> {
        return this._kunde;
    }

    private _kundenkontaktResponseError: ErrorMeldung;

    get kundenkontaktResponseError(): ErrorMeldung {
        return this._kundenkontaktResponseError;
    }

    private _versicherter = new BehaviorSubject<Person>(null);

    get versicherter(): BehaviorSubject<Person> {
        return this._versicherter;
    }

    get dokumentReadResponseError(): ErrorMeldung {
        return this._dokumenteReadResponseError;
    }

    get dokumentResponseError(): ErrorMeldung {
        return this._dokumenteResponseError;
    }

    get feedbackResponseError(): ErrorMeldung {
        return this._kundenfeedbackResponseError;
    }

    public _readKundeFromCache(fs?: string): Kunde {
        const cachedKunde = this._cachedKunden.filter(
            (kunde: Kunde) => kunde.fs.fachschluessel === fs,
        );
        return (cachedKunde && cachedKunde[0]) || null;
    }

    public _readVersicherterFromCache(vsnr?: string): Person {
        const cachedVersicherter = this._cachedVersicherte.filter(
            (versicherter: Person) => versicherter.fs.fachschluessel === vsnr,
        );
        return (cachedVersicherter && cachedVersicherter[0]) || null;
    }

    addKundeToCache(kunde: Kunde): void {
        this._cachedKunden.push(kunde);
    }

    addVersicherterToCache(versicherter: Person): void {
        this._cachedVersicherte.push(versicherter);
    }

    angehoerigeResponseError(): ErrorMeldung {
        return this._angehoerigeResponseError;
    }

    clearDokumenteReadResponseError() {
        this._dokumenteReadResponseError = null;
    }

    public detailSucheVersicherte(data: PersonDetailSearchForm) {
        let endpointSuche = API_URL + "/person/detail/";

        if (data.orgName != null && data.orgName.length > 0) {
            endpointSuche += data.orgName + "/" + data.plz;
        } else {
            endpointSuche +=
                data.vorname +
                "/" +
                data.nachname +
                "/" +
                data.plz +
                "/" +
                data.geburtsDatum;
        }

        this.httpHandlerInterceptorMapping.createTransaction(endpointSuche);

        return this.http.get(endpointSuche);
    }

    ecardResponseError(): ErrorMeldung {
        return this._ecardResponseError;
    }

    getDSGVOPdf(fs, fsArt) {
        const pid = this._versicherter.getValue().stammdaten.pid;
        let dsgvoUrl =
            API_URL + "/dsgvo?fs=" + fs + "&fsArt=" + fsArt + "&pid=" + pid;

        const headers = new HttpHeaders({
            Accept: "application/octet-stream",
        });

        this.http
            .get(dsgvoUrl, { headers, responseType: "blob" })
            .subscribe((data) => {
                if (data) {
                    const blob = new Blob([data], { type: "application/pdf" });
                    const objUrl = window.URL.createObjectURL(blob);
                    window.open(objUrl);
                }
            });
    }

    getDokumentenliste(fs, pid, ppid) {
        forkJoin([
            this.getDokumentenlisteECM(pid),
            this.getDokumentenlisteLGK(fs, ppid),
        ]).subscribe((value) => {
            let data = [];
            value.forEach((value1) => (data = data.concat(value1)));
            data = data.sort((a, b) =>
                a.datum == b.datum ? 0 : a.datum > b.datum ? -1 : 1,
            );
            this._versicherter.getValue().dokumenteKurz = data;
            this._versicherter.next(this._versicherter.getValue());
        });
    }

    getDokumentenlisteECM(pid): Observable<any> {
        let url = API_URL + "/ecmawf/dokumente/suchen/" + pid;
        return this.http.get(url).pipe(
            catchError(() => {
                this._dokumenteResponseError = new ErrorMeldung(
                    "01",
                    "Subsystem nicht erreichbar!",
                    "ECM",
                );
                return [];
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    let liste = DokumentKurz.ofList(
                        data.response,
                        DokumentKurz._TYPEECM,
                    );
                    liste.sort(
                        (dokument1, dokument2) =>
                            dokument1.datum - dokument2.datum,
                    );
                    return liste;
                } else {
                    data.metainformation.meldungen[0].meldungstext =
                        "ECM - ".concat(
                            data.metainformation.meldungen[0].meldungstext,
                        );
                    this._dokumenteResponseError = ErrorMeldung.of(
                        data.metainformation.meldungen[0],
                    );
                    return [];
                }
            }),
        );
    }

    getDokumentenlisteLGK(fs, pid): Observable<any> {
        let url = API_URL + "/leistungen/dokumente/" + fs + "/" + pid;
        return this.http.get(url).pipe(
            catchError(() => {
                this._dokumenteResponseError = new ErrorMeldung(
                    "01",
                    "Subsystem nicht erreichbar!",
                    "LGK",
                );
                return [];
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    let liste = DokumentKurz.ofList(
                        data.response.dokumente,
                        DokumentKurz._TYPELGK,
                    );
                    liste.sort(
                        (dokument1, dokument2) =>
                            dokument1.datum - dokument2.datum,
                    );
                    return liste;
                } else {
                    data.metainformation.meldungen[0].meldungstext = "LGK";
                    this._dokumenteResponseError = ErrorMeldung.of(
                        data.metainformation.meldungen[0],
                    );
                    return [];
                }
            }),
        );
    }

    getFeedbackListeFS(fs: string, fsArt: string, pid: string) {
        let url =
            API_URL +
            "/feedback?fs=" +
            fs +
            "&fsArtKurz=" +
            fsArt +
            "&pid=" +
            pid;
        this.http
            .get(url)
            .pipe(
                catchError(() => {
                    this._kundenfeedbackResponseError = new ErrorMeldung(
                        "01",
                        "Subsystem nicht erreichbar!",
                        null,
                    );
                    return EMPTY;
                }),
                map((data: any) => {
                    if (data.metainformation.status === "OK") {
                        return FeedbackKurz.ofList(data.response).sort(
                            (a, b) =>
                                a.erstellDatum > b.erstellDatum ? -1 : 1,
                        );
                    } else {
                        this._kundenfeedbackResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return EMPTY;
                    }
                }),
            )
            .subscribe((data) => {
                if (data) {
                    this._versicherter.getValue().feedbackKurz = data;
                    this._versicherter.next(this._versicherter.getValue());
                }
            });
    }

    getKVAKrankenanspruch(fs, pid) {
        let url = API_URL + "/kvkerm/" + fs + "/" + pid;
        this.http
            .get(url)
            .pipe(
                catchError(() => {
                    this._KVAResponseError = new ErrorMeldung(
                        "01",
                        "Subsystem nicht erreichbar!",
                        null,
                    );
                    return EMPTY;
                }),
                map((data: any) => {
                    if (data.metainformation.status === "OK") {
                        return data.response;
                    } else {
                        this._KVAResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return EMPTY;
                    }
                }),
            )
            .subscribe((data) => {
                if (data.anspruch == "J") {
                    this._versicherter.getValue().krankenanspruch = true;
                    if (data.schutzfrist) {
                        this._versicherter.getValue().schutzfrist =
                            data.schutzfrist;
                    }
                    if (data.toleranzfrist) {
                        this._versicherter.getValue().toleranzfrist =
                            data.schutzfrist;
                    }
                } else {
                    this._versicherter.getValue().krankenanspruch = false;
                }
            });
    }

    getKunde(): BehaviorSubject<Kunde> {
        return this._kunde;
    }

    getKundenkontaktListe(fs, fsArt, pid) {
        let url =
            API_URL +
            "/contactnew?fs=" +
            fs +
            "&fsart=" +
            fsArt +
            "&pid=" +
            pid;

        if (fsArt === "DGNR") {
            this.getKundenkontaktListeForDG(fs, fsArt, pid);
        } else {
            this.http
                .get(url)
                .pipe(
                    catchError(() => {
                        this._kundenkontaktResponseError = new ErrorMeldung(
                            "01",
                            "Subsystem nicht erreichbar!",
                            null,
                        );
                        return EMPTY;
                    }),
                    map((data: any) => {
                        if (data.metainformation.status === "OK") {
                            KontaktForm.unregister();
                            for (let i = 0; i < data.response.length; i++) {
                                if (data.response[i].endeTs == null) {
                                    KontaktForm.register(data.response[i].id);
                                }
                            }
                            let liste = KontaktKurz.ofList(data.response);
                            liste.sort(
                                (kontakt1, kontakt2) =>
                                    kontakt2.zeitpunktStart -
                                    kontakt1.zeitpunktStart,
                            );
                            return liste;
                        } else {
                            this._kundenkontaktResponseError = ErrorMeldung.of(
                                data.metainformation.meldungen[0],
                            );
                            return EMPTY;
                        }
                    }),
                )
                .subscribe((data) => {
                    if (data) {
                        this._versicherter.getValue().kontakteKurz = data;
                        this._versicherter.next(this._versicherter.getValue());
                    }
                });
        }
    }

    getKundenkontaktListeForDG(fs, fsArt, pid) {
        let url =
            API_URL +
            "/contactnew?fs=" +
            fs +
            "&fsart=" +
            fsArt +
            "&pid=" +
            pid;

        this.http
            .get(url)
            .pipe(
                catchError(() => {
                    this._kundenkontaktResponseError = new ErrorMeldung(
                        "01",
                        "Subsystem nicht erreichbar!",
                        null,
                    );
                    return EMPTY;
                }),
                map((data: any) => {
                    if (data.metainformation.status === "OK") {
                        let liste = KontaktKurz.ofList(data.response);
                        liste.sort(
                            (kontakt1, kontakt2) =>
                                kontakt2.zeitpunktStart -
                                kontakt1.zeitpunktStart,
                        );
                        return liste;
                    } else {
                        this._kundenkontaktResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return EMPTY;
                    }
                }),
            )
            .subscribe((data) => {
                if (data) {
                    (this._kunde.getValue() as Dienstgeber).kontakteKurz = data;
                    this._kunde.next(this._kunde.getValue());
                }
            });
    }

    getVersicherter(): BehaviorSubject<Person> {
        return this._versicherter;
    }

    leistungResponseError(): ErrorMeldung {
        return this._leistungResponseError;
    }

    leseDokumentECM(id) {
        let url =
            API_URL +
            "/ecmawf/dokumente/anzeigen/" +
            this._versicherter.getValue().stammdaten.pid +
            "/" +
            id;
        this.http
            .get(url)
            .pipe(
                catchError(() => {
                    this._dokumenteReadResponseError = new ErrorMeldung(
                        "01",
                        "Subsystem nicht erreichbar!",
                        "ECM",
                    );
                    return EMPTY;
                }),
                map((data: any) => {
                    if (data.metainformation.status === "OK") {
                        return data;
                    } else {
                        data.metainformation.meldungen[0].meldungstext = "ECM";
                        this._dokumenteReadResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return EMPTY;
                    }
                }),
            )
            .subscribe((data) => {
                if (data) {
                    window.open(data.response.clkToken);
                }
            });
    }

    leseDokumentLGK(id) {
        let url =
            API_URL +
            "/leistungen/dokumente/lesen/" +
            id +
            "/" +
            this._versicherter.getValue().stammdaten.pid +
            "?bearbeiter=" +
            this.userService.userInfo.benutzername;
        this.http
            .get(url)
            .pipe(
                catchError(() => {
                    this._dokumenteReadResponseError = new ErrorMeldung(
                        "01",
                        "Subsystem nicht erreichbar!",
                        "LGK",
                    );
                    return EMPTY;
                }),
                map((data: any) => {
                    if (data.metainformation.status === "OK") {
                        return data;
                    } else {
                        data.metainformation.meldungen[0].meldungstext = "LGK";
                        this._dokumenteReadResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return null;
                    }
                }),
            )
            .subscribe((data) => {
                if (data) {
                    //response content is base64 encoded, needs to be decoded first
                    const byteArray = new Uint8Array(
                        atob(data.response.document.content)
                            .split("")
                            .map((char) => char.charCodeAt(0)),
                    );

                    let lgkPdf = new Blob([byteArray], {
                        type: "application/pdf",
                    });
                    window.open(URL.createObjectURL(lgkPdf));
                }
            });
    }

    loadOffeneKontakteForFs(fs: string, fsArt: string): Observable<boolean> {
        let url =
            API_URL +
            "/contactnew/offenekontakteforfs?fs=" +
            fs +
            "&fsart=" +
            fsArt;

        return this.http.get<Kundenkontakt>(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar.");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    return data.response.length == 0;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    readDienstgeber(fs: string, fsArt: string): void {
        fs = fs.trim();

        if (this.userService.selectedOrganisationseinheit == null) {
            this.userService.selectedOrganisationseinheit =
                localStorage.getItem("org");
        }

        let d = this.dienstgeberFactory.empty();
        d.openedKontakt = false;
        d.fs = Fachschluessel.of(fs, fsArt);
        this.setCurrentKunde(d);
        this._cachedKunden.push(d);

        this.httpHandlerInterceptorMapping.createTransaction(fs);

        this.userService.readUserInfoObservable().subscribe((userInfo) => {
            this.userService.userInfo = userInfo;
            if (
                this.userService.userInfo.containsRolle(
                    RollenConstant.ROLLE_ZPV_LESEN,
                )
            ) {
                const endpointStammDaten =
                    API_URL + "/dienstgeber/" + fs + "/" + fsArt;
                this.http
                    .get<any>(endpointStammDaten)
                    .pipe(
                        map((data: any) => {
                            if (data.metainformation.status === "OK") {
                                return this.dienstgeberFactory.of(
                                    data.response,
                                );
                            } else {
                                this._zpvResponseError = ErrorMeldung.of(
                                    data.metainformation.meldungen[0],
                                );
                                return null;
                            }
                        }),
                        catchError((err) => {
                            return EMPTY;
                        }),
                    )
                    .subscribe((dienstgeber: Dienstgeber) => {
                        this.callServicesAfterZPVForDG(dienstgeber, fs, fsArt);
                    });
            }
        });
    }

    readKunde(fs: string, fsArt: string) {
        if (fsArt.toUpperCase() === "DGNR") {
            this.readDienstgeber(fs, fsArt);
        } else {
            this.readVersicherter(fs, fsArt);
        }
    }

    readVersicherter(fs: string, fsArt: string): void {
        fs = fs.trim();
        const cachedVersicherter = this._readVersicherterFromCache(fs);
        const cachedKunde = this._readKundeFromCache(fs);

        if (cachedKunde) {
            this.httpHandlerInterceptorMapping.changeTransaction(
                cachedVersicherter.fs.fachschluessel,
            );

            this.setCurrentVersicherter(cachedVersicherter);
            this._versicherter
                .getValue()
                .urlMap.next(this._versicherter.getValue().urlMap.getValue());

            this.setCurrentKunde(cachedKunde);
            return;
        }

        if (cachedVersicherter) {
            this.httpHandlerInterceptorMapping.changeTransaction(
                cachedVersicherter.fs.fachschluessel,
            );
            this.setCurrentVersicherter(cachedVersicherter);
            this._versicherter
                .getValue()
                .urlMap.next(this._versicherter.getValue().urlMap.getValue());
            return;
        }

        if (this.userService.selectedOrganisationseinheit == null) {
            this.userService.selectedOrganisationseinheit =
                localStorage.getItem("org");
        }

        if (this.userService.selectedAufgabengebiet == null) {
            this.userService.selectedAufgabengebiet =
                localStorage.getItem("aufg");
        }

        let p = this.personFactory.empty();
        p.fs = Fachschluessel.of(fs, fsArt);
        p.mitversicherungen = new Mitversicherung(null, null);
        p.openedKontakt = false;
        this.setCurrentVersicherter(p);
        this.setCurrentKunde(p);
        this._cachedVersicherte.push(p);
        this._cachedKunden.push(p);

        this.httpHandlerInterceptorMapping.createTransaction(fs);

        this.userService.readUserInfoObservable().subscribe((userInfo) => {
            this.userService.userInfo = userInfo;
            if (
                this.userService.userInfo.containsRolle(
                    RollenConstant.ROLLE_ZPV_LESEN,
                )
            ) {
                const endpointStammDaten =
                    API_URL + "/person/" + fs + "/" + fsArt;
                this.http
                    .get<any>(endpointStammDaten)
                    .pipe(
                        map((data: any) => {
                            if (
                                data.metainformation.status !== "OK" &&
                                this.zpvFehler.includes(
                                    data.metainformation.meldungen[0]
                                        .fehlerkategorie,
                                )
                            ) {
                                this._zpvResponseError = ErrorMeldung.of(
                                    data.metainformation.meldungen[0],
                                );
                                return null;
                            }
                            return this.personFactory.of(data.response);
                        }),
                        catchError(() => {
                            return EMPTY;
                        }),
                    )
                    .subscribe((versicherter: Person) => {
                        if (
                            versicherter != null &&
                            versicherter.stammdaten?.gueltigeVSNR.length > 0
                        ) {
                            if (
                                versicherter.stammdaten?.gueltigeVSNR.length ==
                                1
                            ) {
                                this.chipService.removeChip(fs);
                                this.dialogService.switchToGueltigeVSNRWennStorniertDialog(
                                    versicherter.stammdaten?.gueltigeVSNR[0],
                                );
                                this._cachedVersicherte.splice(
                                    this._cachedVersicherte.indexOf(p),
                                );
                                this._cachedKunden.splice(
                                    this._cachedKunden.indexOf(p),
                                );
                                this.readKunde(
                                    versicherter.stammdaten?.gueltigeVSNR[0],
                                    fsArt,
                                );
                            } else {
                                this.dialogService.openGueltigeVSNRWennStorniertDialog(
                                    versicherter.stammdaten?.gueltigeVSNR,
                                );
                            }
                        } else {
                            this.callServicesAfterZPV(versicherter, fs, fsArt);
                        }
                    });
            }
        });
    }

    removeKundeFromCache(fachschluessel: string): void {
        this._cachedKunden = this._cachedKunden.filter(
            (kunde) => kunde.fs.fachschluessel !== fachschluessel,
        );
    }

    removeVersicherterFromCache(vsnr: string): void {
        this._cachedVersicherte = this._cachedVersicherte.filter(
            (versicherter: Person) => versicherter.fs.fachschluessel !== vsnr,
        );
    }

    public searchByPartnerId(partnerId: string) {
        let endpointSuche = API_URL + "/person/" + partnerId;

        return this.http.get(endpointSuche).pipe(
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return data.response;
                } else {
                    this._zpvResponseError = ErrorMeldung.of(
                        data.metainformation.meldungen[0],
                    );
                    return null;
                }
            }),
            catchError((err) => {
                return EMPTY;
            }),
        );
    }

    selectCurrentFs(): string {
        return this._kunde.getValue().fs.fachschluessel;
    }

    selectCurrentFsArt(): string {
        return this._kunde.getValue().fs.fachschluesselArt;
    }

    selectCurrentPID(): string {
        if (this.selectCurrentFsArt() === "VSNR") {
            return this._versicherter.getValue().stammdaten.pid;
        } else if (this.selectCurrentFsArt() === "DGNR") {
            let dienstgeber = this.kunde.getValue() as Dienstgeber;
            return dienstgeber.stammdaten.pid;
        }
    }

    selectKunde(): Observable<Kunde> {
        return this._kunde.asObservable();
    }

    selectVersicherter(): Observable<Person> {
        return this._versicherter.asObservable();
    }

    setCurrentKunde(kunde: Kunde): void {
        return this._kunde.next(kunde);
    }

    setCurrentVersicherter(versicherter: Person): void {
        return this._versicherter.next(versicherter);
    }

    versicherteResponseError(): ErrorMeldung {
        return this._versicherteResponseError;
    }

    zpvResponseError(): ErrorMeldung {
        return this._zpvResponseError;
    }

    zvdResponseError(): ErrorMeldung {
        return this._zvdResponseError;
    }

    private _openCustomZpvErrorDialog(title: string, message: string) {
        this.dialogService.openDialog(
            ErrorDialogComponent,
            {
                title: title,
                message: message,
            },
            { width: "600px" },
        );
    }

    private _openDgnrNotAvailableDialog(dgnr: string) {
        this.dialogService.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler bei Suche",
                message:
                    'Es wurde kein Dienstgeber mit der DGNR "' +
                    dgnr +
                    '" gefunden!',
            },
            { width: "300px" },
        );
    }

    private _openVsnrNotAvailableDialog(vsnr: string) {
        this.dialogService.openDialog(
            ErrorDialogComponent,
            {
                title: "Fehler bei Suche",
                message:
                    'Es wurde kein Versicherter mit der VSNR "' +
                    vsnr +
                    '" gefunden!',
            },
            { width: "300px" },
        );
    }

    private buildLeistungUrl(req: LgkkRequest) {
        let url = req.fs + "/" + req.ppid + "?";

        let queryParameters = [];

        for (let mv of req.versicherteAngehoerige) {
            queryParameters.push("mv=" + mv);
        }

        for (let i = 11; i <= 19; i++) {
            queryParameters.push("ls=" + i); //Keine Einschränkung auf Landesstellen LS
        }

        if (queryParameters.length > 0) {
            url += queryParameters.join("&");
        }

        return url;
    }

    private callLeistungenService(url: string) {
        let leistungenEndpoint = API_URL + "/leistungen/" + url;
        this.resetCurrentLgkkRequest();

        if (!this._versicherter.getValue().isBTNR()) {
            this.lgkkUrlService.loadUrl(
                this._versicherter.getValue().fs.fachschluessel,
                this._versicherter.getValue().stammdaten.ppid,
                this.userService.selectedOrganisationseinheit,
            );

            this.lgkkUrlService.currentUrl.subscribe((data) => {
                let newMap = this._versicherter.getValue().urlMap.getValue();
                newMap.set("lgkk", data);
                this._versicherter.getValue().urlMap.next(newMap);
                this._versicherter.next(this._versicherter.getValue());
            });
        }

        this.http
            .get<any>(leistungenEndpoint)
            .pipe(
                map((data: any) => {
                    if (data.metainformation.status !== "OK") {
                        this._leistungResponseError = ErrorMeldung.of(
                            new ErrorMeldung(
                                "01",
                                "Subsystem nicht erreichbar!",
                                "Ein oder mehrere LGK Subsysteme sind nicht erreichbar!",
                            ),
                        );
                    }
                    if (data.response == null) {
                        return EMPTY;
                    }
                    return Leistung.of(data.response);
                }),
                catchError(() => {
                    this._leistungResponseError = ErrorMeldung.of(
                        new ErrorMeldung(
                            "01",
                            "Subsystem nicht erreichbar!",
                            "LGK System nicht erreichbar.",
                        ),
                    );
                    return EMPTY;
                }),
            )
            .subscribe((leistung: Leistung) => {
                if (leistung && this._versicherter.getValue()) {
                    this._versicherter.getValue().leistungen = leistung;
                    this._versicherter.next(this._versicherter.getValue());
                }
            });
    }

    private callServicesAfterZPV(
        versicherter: Person,
        fs: string,
        fsArt: string,
    ) {
        if (versicherter) {
            (this._kunde.getValue() as Person).stammdaten =
                versicherter.stammdaten;
            this._kunde.next(this._kunde.getValue());

            this._versicherter.getValue().stammdaten = versicherter.stammdaten;
            this._versicherter.next(this._versicherter.getValue());
            this.getZpvDashboardUrl();
            this.getVdaDashboardUrl();
            this.getEcAdminDashboardUrl();
        } else if (!this.zpvResponseError()) {
            this._openVsnrNotAvailableDialog(fs);
            return;
        } else {
            this._openCustomZpvErrorDialog(
                "Fehler bei ZPV-Aufruf! " +
                    this.zpvResponseError().fehlerkategorie,
                this.zpvResponseError().meldungstext,
            );
            return;
        }

        this.resetCurrentLgkkRequest();

        this.currentLgkkRequest.fs = fs;
        this.currentLgkkRequest.ppid =
            this._versicherter.getValue().stammdaten.ppid;
        let pid = this._versicherter.getValue().stammdaten.pid;

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_SS5_LESEN,
            ) &&
            fsArt != "BTNR"
        ) {
            this.getEcard(
                API_URL + "/ecarddaten/" + fs + "/" + fsArt + "?pid=" + pid,
            );
        }

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_ZVD_LESEN,
            ) &&
            fsArt != "BTNR"
        ) {
            this.getVersicherungszeiten(
                API_URL +
                    "/versicherungszeit/" +
                    fs +
                    "/" +
                    fsArt +
                    "?pid=" +
                    pid,
            );
        }

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_KVA_LESEN,
            ) &&
            fsArt !== "BTNR"
        ) {
            this.getVersicherte(
                API_URL +
                    "/coinsurance/versicherte/" +
                    fs +
                    "/" +
                    fsArt +
                    "?pid=" +
                    pid,
            );
            this.getAngehoerige(
                API_URL +
                    "/coinsurance/angehoerige/" +
                    fs +
                    "/" +
                    fsArt +
                    "?pid=" +
                    pid,
            );
            this.getGebuehrenBefreiung(
                API_URL +
                    "/gebuehrenbefreiung/" +
                    fs +
                    "/" +
                    fsArt +
                    "?pid=" +
                    pid,
            );
        } else {
            this.currentLgkkRequest.versicherteAngehoerige = [];
        }

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_NOTIZ_LESEN,
            ) ||
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_NOTIZ_VERW,
            )
        ) {
            this.getNotiz(
                API_URL + "/notiz/" + fs + "/" + fsArt + "?pid=" + pid,
            );
        }

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_BESW_LESEN,
            ) ||
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_BESW_VERW,
            )
        ) {
            this.getFeedbackListeFS(fs, fsArt, pid);
        }

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_KONT_LESEN,
            ) ||
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_KONT_VERW,
            )
        ) {
            this.getKundenkontaktListe(fs, fsArt, pid);
        }

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_DOKUMENT_ANZEIGEN,
            )
        ) {
            this.getDokumentenliste(
                fs,
                pid,
                this._versicherter.getValue().stammdaten.pid,
            );
        }

        this.getKVAKrankenanspruch(fs, pid);
    }

    private callServicesAfterZPVForDG(
        dienstgeber: Dienstgeber,
        fs: string,
        fsArt: string,
    ) {
        if (dienstgeber) {
            (this._kunde.getValue() as Dienstgeber).stammdaten =
                dienstgeber.stammdaten;
            this.setCurrentKunde(this._kunde.getValue());
        } else if (!this.zpvResponseError()) {
            this._openDgnrNotAvailableDialog(fs);
            return;
        } else {
            this._openCustomZpvErrorDialog(
                "Fehler bei ZPV-Aufruf! " +
                    this.zpvResponseError().fehlerkategorie,
                this.zpvResponseError().meldungstext,
            );
            return;
        }

        let pid = dienstgeber.stammdaten.pid;

        if (
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_KONT_LESEN,
            ) ||
            this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_KONT_VERW,
            )
        ) {
            this.getKundenkontaktListe(fs, fsArt, pid);
        }
    }

    private getAngehoerige(endpointAngehoerige: string) {
        this.http
            .get<any>(endpointAngehoerige)
            .pipe(
                map((data) => {
                    if (data.metainformation.status === "OK") {
                        return Angehoeriger.ofList(data.response);
                    } else {
                        this._angehoerigeResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return null;
                    }
                }),
                catchError(() => {
                    return EMPTY;
                }),
            )
            .subscribe((angehoerige: Angehoeriger[]) => {
                if (angehoerige) {
                    this._versicherter.getValue().mitversicherungen.angehoerige =
                        angehoerige;
                    this._versicherter.next(this._versicherter.getValue());
                    if (
                        !this._versicherter.getValue().mitversicherungen
                            .angehoerige
                    ) {
                        this._versicherter.getValue().mitversicherungen.angehoerige =
                            [];
                    }
                }
            });
    }

    private getEcAdminDashboardUrl() {
        let vsnr = this._versicherter.getValue().fs.fachschluessel;
        vsnr ? this.ecadminUrlService.loadUrl(vsnr) : null;
        this.ecadminUrlService.urlLoaded.subscribe((data) => {
            let newMap = this._versicherter.getValue().urlMap.getValue();
            newMap.set("ecadmin", data);
            this._versicherter.getValue().urlMap.next(newMap);
            this._versicherter.next(this._versicherter.getValue());
        });
    }

    private getEcard(endpointEcard: string) {
        this.http
            .get<any>(endpointEcard)
            .pipe(
                map((data) => {
                    if (data.metainformation.status === "OK") {
                        return ECard.of(data.response);
                    } else {
                        this._ecardResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return null;
                    }
                }),
                catchError((_) => {
                    this._ecardResponseError = ErrorMeldung.of(
                        _.metainformation.meldungen[0],
                    );
                    return EMPTY;
                }),
            )
            .subscribe((ecarddaten: ECard) => {
                if (ecarddaten) {
                    this._versicherter.getValue().ecard = ecarddaten;
                    this._versicherter.next(this._versicherter.getValue());
                }
            });
    }

    private getGebuehrenBefreiung(endpointGebuehrenBefreiung: string) {
        this.http
            .get<any>(endpointGebuehrenBefreiung)
            .pipe(
                map((data) => {
                    if (data.metainformation.status === "OK") {
                        return GebuehrenBefreiung.ofList(data.response);
                    } else {
                        return null;
                    }
                }),
                catchError(() => {
                    return EMPTY;
                }),
            )
            .subscribe((gebuehrenBefreiungen: GebuehrenBefreiung[]) => {
                if (gebuehrenBefreiungen) {
                    this._versicherter.getValue().gebuehrenBefreiungen =
                        gebuehrenBefreiungen;
                    this._versicherter.next(this._versicherter.getValue());
                    if (!this._versicherter.getValue().gebuehrenBefreiungen) {
                        this._versicherter.getValue().gebuehrenBefreiungen = [];
                    }
                }
            });
    }

    private getLeistungen() {
        if (
            !this.userService.userInfo.containsRolle(
                RollenConstant.ROLLE_LGKK_LESEN,
            )
        ) {
            return;
        }

        let serviceUrl = this.buildLeistungUrl(this.currentLgkkRequest);

        this.resetCurrentLgkkRequest();

        return this.callLeistungenService(serviceUrl);
    }

    private getNotiz(endpointNotiz: string) {
        this.http
            .get<any>(endpointNotiz)
            .pipe(
                map((data) => {
                    if (data.metainformation.status === "OK") {
                        return Notiz.of(data.response);
                    } else {
                        return null;
                    }
                }),
                catchError(() => {
                    this._versicherter.getValue().notiz = new Notiz("", -1);
                    this._versicherter.next(this._versicherter.getValue());
                    return EMPTY;
                }),
            )
            .subscribe((notiz: Notiz) => {
                if (notiz != null) {
                    this._versicherter.getValue().notiz = notiz;
                    this._versicherter.next(this._versicherter.getValue());
                } else {
                    this._versicherter.getValue().notiz = new Notiz("", -1);
                    this._versicherter.next(this._versicherter.getValue());
                }
            });
    }

    private getVdaDashboardUrl() {
        let vsnr = this._versicherter.getValue().fs.fachschluessel;
        vsnr ? this.vdaUrlService.loadUrl(vsnr) : null;
        this.vdaUrlService.urlLoaded.subscribe((data) => {
            let newMap = this._versicherter.getValue().urlMap.getValue();
            newMap.set("vda", data);
            this._versicherter.getValue().urlMap.next(newMap);
            this._versicherter.next(this._versicherter.getValue());
        });
    }

    private getVersicherte(endpointVersicherte: string) {
        this.http
            .get<any>(endpointVersicherte)
            .pipe(
                map((data) => {
                    if (data.metainformation.status === "OK") {
                        return Angehoeriger.ofList(data.response);
                    } else {
                        this._versicherteResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return null;
                    }
                }),
                catchError(() => {
                    return EMPTY;
                }),
            )
            .subscribe((versicherte: Angehoeriger[]) => {
                if (versicherte) {
                    let versicherteAngehoerige = [];
                    versicherte.forEach((value) => {
                        if (!value.anspruchspruefung) {
                            return;
                        }
                        versicherteAngehoerige.push(value.versicherungsnummer);
                    });
                    this.currentLgkkRequest.versicherteAngehoerige =
                        versicherteAngehoerige;

                    this._versicherter.getValue().mitversicherungen.versicherte =
                        versicherte;
                    this._versicherter.next(this._versicherter.getValue());
                    if (
                        !this._versicherter.getValue().mitversicherungen
                            .versicherte
                    ) {
                        this._versicherter.getValue().mitversicherungen.versicherte =
                            [];
                    }
                } else {
                    this.currentLgkkRequest.versicherteAngehoerige = [];
                }
            });
    }

    private getVersicherungszeiten(endpointVersicherungszeiten: string) {
        this.http
            .get<any>(endpointVersicherungszeiten)
            .pipe(
                map((data) => {
                    if (data.metainformation.status === "OK") {
                        return Versicherungszeit.ofList(data.response);
                    } else {
                        this._zvdResponseError = ErrorMeldung.of(
                            data.metainformation.meldungen[0],
                        );
                        return null;
                    }
                }),
                catchError(() => {
                    return EMPTY;
                }),
            )
            .subscribe((versicherungszeit: Versicherungszeit[]) => {
                if (versicherungszeit) {
                    this._versicherter.getValue().versicherungszeiten =
                        versicherungszeit;
                    this._versicherter.next(this._versicherter.getValue());
                    if (!this._versicherter.getValue().versicherungszeiten) {
                        this._versicherter.getValue().versicherungszeiten = [];
                    }
                }
            });
    }

    private getZpvDashboardUrl() {
        let pid = this._versicherter.getValue().stammdaten.pid;
        pid ? this.zpvUrlService.loadUrl(pid) : null;
        this.zpvUrlService.urlLoaded.subscribe((data) => {
            let newMap = this._versicherter.getValue().urlMap.getValue();
            newMap.set("zpv", data);
            this._versicherter.getValue().urlMap.next(newMap);
            this._versicherter.next(this._versicherter.getValue());
        });
    }

    private resetCurrentLgkkRequest() {
        this.currentLgkkRequest = LgkkRequest.empty();
        this.currentLgkkRequest.requestBuilt.subscribe(() => {
            this.getLeistungen();
        });
    }
}
