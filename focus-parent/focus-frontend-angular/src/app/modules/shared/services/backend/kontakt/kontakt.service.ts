import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable, of } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { Dienstgeber } from "../../../models/dienstgeber/dienstgeber.model";
import { Kunde } from "../../../models/kunde.model";
import { Kundenkontakt } from "../../../models/kundenkontakt.model";
import { KontaktForm } from "../../../models/kundenkontakt/kontakt-form.model";
import { SubaufgabengebietKontaktForm } from "../../../models/kundenkontakt/subaufgabengebiet-kontakt.model";
import { Abschlussart } from "../../../models/kundenkontaktNeu/abschlussart.model";
import { Aufgabengebiet } from "../../../models/kundenkontaktNeu/aufgabengebiet.model";
import { AufggAaMstMap } from "../../../models/kundenkontaktNeu/aufggAaMstMap.model";
import { AufggKtMstMap } from "../../../models/kundenkontaktNeu/aufggKtMstMap.model";
import { AufggSubMap } from "../../../models/kundenkontaktNeu/aufggSubMap";
import { AufggThemaMstMap } from "../../../models/kundenkontaktNeu/aufggThemaMstMap.model";
import { Kontakt } from "../../../models/kundenkontaktNeu/kontakt.model";
import { Kontaktart } from "../../../models/kundenkontaktNeu/kontaktart.model";
import { KontaktHistorie } from "../../../models/kundenkontaktNeu/kontaktHistorie.model";
import { Thema } from "../../../models/kundenkontaktNeu/thema.model";
import { Unterthema } from "../../../models/kundenkontaktNeu/unterthema.model";
import { Person } from "../../../models/Person.model";
import { TransactionIdGenerator } from "../../frontend/transaction/transaction-id-generator.service";
import { UserService } from "../user/user.service";

@Injectable({
    providedIn: "root",
})
export class KontaktService {
    private cachedAbschlussarten: Abschlussart[];
    private cachedAufgabengebiete: Aufgabengebiet[];
    private cachedAufggAaMstMaps: AufggAaMstMap[];
    private cachedAufggKtMstMaps: AufggKtMstMap[];
    private cachedAufggSubMaps: AufggSubMap[];
    private cachedAufggThemaMstMaps: AufggThemaMstMap[];
    private cachedKontaktarten: Kontaktart[];
    private cachedThemen: Thema[];
    private cachedUnterthemen: Thema[];

    constructor(
        private userService: UserService,
        private transactionIdGenerator: TransactionIdGenerator,
        private http: HttpClient,
    ) {}

    static getCurrentZeitPunktAsArray() {
        let now = new Date();
        return [
            now.getFullYear(),
            now.getMonth() + 1,
            now.getDate(),
            now.getHours(),
            now.getMinutes(),
            now.getSeconds(),
        ];
    }

    static parseDateToArray(date: Date) {
        return date != null
            ? [
                  date.getFullYear(),
                  date.getMonth() + 1,
                  date.getDate(),
                  date.getHours(),
                  date.getMinutes(),
                  date.getSeconds(),
              ]
            : null;
    }

    buildKontaktInsertObject(kontaktForm: KontaktForm, kunde: Kunde) {
        if (
            kunde.fs.fachschluesselArt === "VSNR" ||
            kunde.fs.fachschluesselArt === "BTNR"
        ) {
            let versicherter = kunde as Person;
            return {
                abschlussartId: kontaktForm.currentKontakt.abschlussartId,
                agd: kontaktForm.currentKontakt.agd,
                agdFachschluessel: kontaktForm.currentKontakt.agdFachschluessel,
                agdName: kontaktForm.currentKontakt.agdName,
                anmerkung: kontaktForm.currentKontakt.anmerkung,
                aufgabengebietId: kontaktForm.currentKontakt.aufgabengebietId,
                bundesland: versicherter.stammdaten.bundesland,
                endeTs: KontaktService.getCurrentZeitPunktAsArray(),
                fachschluessel: kontaktForm.fs,
                fachschluesselArtKurz: kontaktForm.fsArt,
                gemeinde: versicherter.stammdaten.gemeinde,
                gemeindecode: versicherter.stammdaten.gemeindecode,
                kontaktartId: kontaktForm.currentKontakt.kontaktartId,
                mitarbeiterName: this.userService.userInfo.getFullName(),
                mitarbeiterOe: this.userService.selectedOrganisationseinheit,
                mitarbeiterkennung: this.userService.userInfo.benutzername,
                name: versicherter.getName(false),
                ort: versicherter.getOrt(),
                postleitzahl: versicherter.getPlz(),
                polBezirk: versicherter.stammdaten.polBezirk,
                staatIsoa3: versicherter.stammdaten.staatIsoA3,
            };
        } else if (kunde.fs.fachschluesselArt === "DGNR") {
            let dienstgeber = kunde as Dienstgeber;
            return {
                abschlussartId: kontaktForm.currentKontakt.abschlussartId,
                agd: kontaktForm.currentKontakt.agd,
                agdFachschluessel: kontaktForm.currentKontakt.agdFachschluessel,
                agdName: kontaktForm.currentKontakt.agdName,
                anmerkung: kontaktForm.currentKontakt.anmerkung,
                aufgabengebietId: kontaktForm.currentKontakt.aufgabengebietId,
                bundesland: dienstgeber.stammdaten.bundesland,
                endeTs: KontaktService.getCurrentZeitPunktAsArray(),
                fachschluessel: kontaktForm.fs,
                fachschluesselArtKurz: kontaktForm.fsArt,
                gemeinde: dienstgeber.stammdaten.gemeinde,
                gemeindecode: dienstgeber.stammdaten.gemeindecode,
                kontaktartId: kontaktForm.currentKontakt.kontaktartId,
                mitarbeiterName: this.userService.userInfo.getFullName(),
                mitarbeiterOe: this.userService.selectedOrganisationseinheit,
                mitarbeiterkennung: this.userService.userInfo.benutzername,
                name: dienstgeber.stammdaten.name,
                ort: dienstgeber.stammdaten.adresse
                    ? dienstgeber.stammdaten.adresse.ort
                    : null,
                postleitzahl: dienstgeber.stammdaten.adresse
                    ? dienstgeber.stammdaten.adresse.plz
                    : null,
                polBezirk: dienstgeber.stammdaten.polBezirk,
                staatIsoa3: dienstgeber.stammdaten.staatIsoA3,
            };
        }
    }

    buildKontaktInsertShell(kunde: Kunde) {
        if (kunde.fs.fachschluesselArt === "VSNR") {
            let versicherter = kunde as Person;
            return {
                abschlussartId: null,
                agd: false,
                agdFachschluessel: null,
                agdName: null,
                anmerkung: null,
                aufgabengebietId: null,
                bundesland: versicherter.stammdaten.bundesland,
                endeTs: null,
                externeGewalt: null,
                fachschluessel: versicherter.fs.fachschluessel,
                fachschluesselArtKurz: versicherter.fs.fachschluesselArt,
                fremdsystemId: null,
                fremdsystemName: null,
                gemeinde: versicherter.stammdaten.gemeinde,
                gemeindeCode: versicherter.stammdaten.gemeindecode,
                kontaktId: null,
                kontaktartId: null,
                letztAend: null,
                letztAendName: null,
                mitarbeiterName: this.userService.userInfo.getFullName(),
                mitarbeiterOe: this.userService.selectedOrganisationseinheit,
                mitarbeiterkennung: this.userService.userInfo.benutzername,
                nacherfassenGrund: null,
                nacherfassenText: null,
                name: versicherter.getName(false),
                ort: versicherter.getOrt(),
                plz: versicherter.getPlz(),
                polBezirk: versicherter.stammdaten.polBezirk,
                staatIsoa3: versicherter.stammdaten.staatIsoA3,
                scIdMa: null,
                startTs: KontaktForm.getCurrentZeitPunktAsArray(),
            };
        } else if (kunde.fs.fachschluesselArt === "BTNR") {
            let versicherter = kunde as Person;
            return {
                abschlussartId: null,
                agd: false,
                agdFachschluessel: null,
                agdName: null,
                anmerkung: null,
                aufgabengebietId: null,
                bundesland: versicherter.stammdaten.bundesland,
                endeTs: null,
                externeGewalt: null,
                fachschluessel: versicherter.fs.fachschluessel,
                fachschluesselArtKurz: versicherter.fs.fachschluesselArt,
                fremdsystemId: null,
                fremdsystemName: null,
                gemeinde: versicherter.stammdaten.gemeinde,
                gemeindeCode: versicherter.stammdaten.gemeindecode,
                kontaktId: null,
                kontaktartId: null,
                letztAend: null,
                letztAendName: null,
                mitarbeiterName: this.userService.userInfo.getFullName(),
                mitarbeiterOe: this.userService.selectedOrganisationseinheit,
                mitarbeiterkennung: this.userService.userInfo.benutzername,
                nacherfassenGrund: null,
                nacherfassenText: null,
                name: versicherter.getName(false),
                polBezirk: versicherter.stammdaten.polBezirk,
                staatIsoa3: versicherter.stammdaten.staatIsoA3,
                scIdMa: null,
                startTs: KontaktForm.getCurrentZeitPunktAsArray(),
            };
        } else if (kunde.fs.fachschluesselArt === "DGNR") {
            let dienstgeber = kunde as Dienstgeber;
            return {
                abschlussartId: null,
                agd: false,
                agdFachschluessel: null,
                agdName: null,
                anmerkung: null,
                aufgabengebietId: null,
                bundesland: dienstgeber.stammdaten.bundesland,
                externeGewalt: null,
                fachschluessel: dienstgeber.fs.fachschluessel,
                fachschluesselArtKurz: dienstgeber.fs.fachschluesselArt,
                fremdsystemId: null,
                fremdsystemName: null,
                gemeinde: dienstgeber.stammdaten.gemeinde,
                gemeindeCode: dienstgeber.stammdaten.gemeindecode,
                kontaktId: null,
                kontaktartId: null,
                letztAend: null,
                letztAendName: null,
                mitarbeiterName: this.userService.userInfo.getFullName(),
                mitarbeiterOe: this.userService.selectedOrganisationseinheit,
                mitarbeiterkennung: this.userService.userInfo.benutzername,
                nacherfassenGrund: null,
                nacherfassenText: null,
                name: dienstgeber.stammdaten.name,
                ort: dienstgeber.stammdaten.adresse
                    ? dienstgeber.stammdaten.adresse.ort
                    : null,
                plz: dienstgeber.stammdaten.adresse
                    ? dienstgeber.stammdaten.adresse.plz
                    : null,
                polBezirk: dienstgeber.stammdaten.polBezirk,
                scIdMa: null,
                staatIsoa3: dienstgeber.stammdaten.staatIsoA3,
                endeTs: null,
                startTs: KontaktForm.getCurrentZeitPunktAsArray(),
            };
        }
    }

    buildKontaktUpdateObject(kontaktForm: KontaktForm) {
        return {
            abschlussartId: kontaktForm.currentKontakt.abschlussartId,
            agd: kontaktForm.currentKontakt.agd,
            agdFachschluessel: kontaktForm.currentKontakt.agdFachschluessel,
            agdName: kontaktForm.currentKontakt.agdName,
            anmerkung: kontaktForm.currentKontakt.anmerkung,
            aufgabengebietId: kontaktForm.currentKontakt.aufgabengebietId,
            endeTs: KontaktService.parseDateToArray(
                kontaktForm.currentKontakt.endeTs != null
                    ? kontaktForm.currentKontakt.endeTs
                    : null,
            ),
            fachschluessel: kontaktForm.fs,
            fachschluesselArtKurz: kontaktForm.fsArt,
            kontaktId: kontaktForm.currentKontakt.kontaktId,
            kontaktartId: kontaktForm.currentKontakt.kontaktartId,
            mitarbeiterName: this.userService.userInfo.getFullName(),
            mitarbeiterOe: kontaktForm.currentKontakt.scIdMa,
            mitarbeiterkennung: this.userService.userInfo.benutzername,
            startTs: KontaktService.parseDateToArray(
                kontaktForm.currentKontakt.startTs,
            ),
            themaId: kontaktForm.currentKontakt.themaId,
            unterthemaId: kontaktForm.currentKontakt.unterthemaId, //QDASH-505
            updatecount: kontaktForm.currentKontakt.updatecount,
        };
    }

    buildSubaufgabengebietKontaktUpdateObject(
        subaufgabengebietKontaktForm: SubaufgabengebietKontaktForm,
    ) {
        return {
            abschlussartId:
                subaufgabengebietKontaktForm.currentKontakt.abschlussartId,
            agd: subaufgabengebietKontaktForm.currentKontakt.agd,
            anmerkung: subaufgabengebietKontaktForm.currentKontakt.anmerkung,
            aufgabengebietId: JSON.parse(localStorage.getItem("aufgId")),
            subAufgabengebietId:
                subaufgabengebietKontaktForm.currentKontakt.aufgabengebietId,
            endeTs: KontaktService.parseDateToArray(
                subaufgabengebietKontaktForm.currentKontakt.endeTs != null
                    ? subaufgabengebietKontaktForm.currentKontakt.endeTs
                    : new Date(),
            ),
            kontaktId: subaufgabengebietKontaktForm.currentKontakt.kontaktId,
            kontaktartId:
                subaufgabengebietKontaktForm.currentKontakt.kontaktartId,
            mitarbeiterName: this.userService.userInfo.getFullName(),
            mitarbeiterOe: subaufgabengebietKontaktForm.currentKontakt.scIdMa,
            mitarbeiterkennung: this.userService.userInfo.benutzername,
            startTs: KontaktService.parseDateToArray(
                subaufgabengebietKontaktForm.currentKontakt.startTs,
            ),
            themaId: subaufgabengebietKontaktForm.currentKontakt.themaId,
            unterthemaId:
                subaufgabengebietKontaktForm.currentKontakt.unterthemaId, //QDASH-505
            updatecount:
                subaufgabengebietKontaktForm.currentKontakt.updatecount,
        };
    }

    buildSubaufggInsertShell(aufgabengebietId: number) {
        return {
            abschlussartId: null,
            agd: false,
            agdFachschluessel: null,
            agdName: null,
            anmerkung: null,
            aufgabengebietId: JSON.parse(localStorage.getItem("aufgId")),
            subAufgabengebietId: aufgabengebietId,
            bundesland: null,
            endeTs: null,
            externeGewalt: null,
            fachschluessel: null,
            fachschluesselArtKurz: null,
            fremdsystemId: null,
            fremdsystemName: null,
            gemeinde: null,
            gemeindeCode: null,
            kontaktId: null,
            kontaktartId: null,
            letztAend: null,
            letztAendName: null,
            mitarbeiterName: this.userService.userInfo.getFullName(),
            mitarbeiterOe: this.userService.selectedOrganisationseinheit,
            mitarbeiterkennung: this.userService.userInfo.benutzername,
            nacherfassenGrund: null,
            nacherfassenText: null,
            name: null,
            ort: null,
            plz: null,
            polBezirk: null,
            staatIsoa3: null,
            scIdMa: null,
            startTs: KontaktForm.getCurrentZeitPunktAsArray(),
        };
    }

    createKontakt(kontaktForm: KontaktForm, kunde: Kunde): Observable<any> {
        if (
            kunde.fs.fachschluesselArt === "VSNR" ||
            kunde.fs.fachschluesselArt === "BTNR"
        ) {
            const versicherter = kunde as Person;
            return this.http.post<any>(
                API_URL + "/contactnew?pid=" + versicherter.stammdaten.pid,
                this.buildKontaktInsertObject(kontaktForm, versicherter),
            );
        } else if (kunde.fs.fachschluesselArt === "DGNR") {
            const dienstgeber = kunde as Dienstgeber;
            return this.http.post<any>(
                API_URL + "/contactnew?pid=" + dienstgeber.stammdaten.pid,
                this.buildKontaktInsertObject(kontaktForm, dienstgeber),
            );
        }
    }

    createKontaktShell(kunde: Kunde): Observable<any> {
        if (
            kunde.fs.fachschluesselArt === "VSNR" ||
            kunde.fs.fachschluesselArt === "BTNR"
        ) {
            const versicherter = kunde as Person;
            return this.http.post<any>(
                API_URL + "/contactnew?pid=" + versicherter.stammdaten.pid,
                this.buildKontaktInsertShell(versicherter),
            );
        } else if (kunde.fs.fachschluesselArt === "DGNR") {
            const dienstgeber = kunde as Dienstgeber;
            return this.http.post<any>(
                API_URL + "/contactnew?pid=" + dienstgeber.stammdaten.pid,
                this.buildKontaktInsertShell(dienstgeber),
            );
        }
    }

    createSubaufggShell(aufgabengebietId: number): Observable<any> {
        return this.http.post<any>(
            API_URL + "/contactnew",
            this.buildSubaufggInsertShell(aufgabengebietId),
        );
    }

    deleteKontakt(kontaktForm: KontaktForm): Observable<any> {
        return this.http.delete(
            API_URL + "/contactnew/" + kontaktForm.currentKontakt.kontaktId,
        );
    }

    deleteSubaufgabengebietKontakt(kontaktId: number): Observable<any> {
        return this.http.delete(API_URL + "/contactnew/" + kontaktId);
    }

    loadAbschlussarten() {
        if (this.cachedAbschlussarten) {
            return of(this.cachedAbschlussarten);
        }

        let url = API_URL + "/contactnew/abschlussarten";
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let abschlussarten = Abschlussart.ofList(data.response);
                    this.cachedAbschlussarten = abschlussarten;
                    return abschlussarten;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadAufgabengebiete() {
        if (this.cachedAufgabengebiete) {
            return of(this.cachedAufgabengebiete);
        }
        let url =
            API_URL +
            "/contactnew/aufgabengebiete?mst=" +
            this.userService.userInfo.benutzername.substring(0, 2);
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let aufgabengebiete = Aufgabengebiet.ofList(data.response);
                    this.cachedAufgabengebiete = aufgabengebiete;
                    return aufgabengebiete;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadAufggAaMstMap() {
        if (this.cachedAufggAaMstMaps) {
            return of(this.cachedAufggAaMstMaps);
        }

        let url =
            API_URL +
            "/contactnew/aufggaamstmap?mst=" +
            this.userService.userInfo.benutzername.substring(0, 2);
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let aufggAaMstMaps = AufggAaMstMap.ofList(data.response);
                    this.cachedAufggAaMstMaps = aufggAaMstMaps;
                    return aufggAaMstMaps;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadAufggKtMstMap() {
        if (this.cachedAufggKtMstMaps) {
            return of(this.cachedAufggKtMstMaps);
        }

        let url =
            API_URL +
            "/contactnew/aufggktmstmap?mst=" +
            this.userService.userInfo.benutzername.substring(0, 2);
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let aufggKtMstMaps = AufggKtMstMap.ofList(data.response);
                    this.cachedAufggKtMstMaps = aufggKtMstMaps;
                    return aufggKtMstMaps;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadAufggSubMap(aufgabengebietId: number) {
        if (this.cachedAufggSubMaps) {
            return of(this.cachedAufggSubMaps);
        }

        let url =
            API_URL +
            "/contactnew/aufggsubmap?aufgabengebietId=" +
            aufgabengebietId;
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let aufggSubMaps = AufggSubMap.ofList(data.response);
                    this.cachedAufggSubMaps = aufggSubMaps;
                    return aufggSubMaps;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadAufggThemaMstMap() {
        if (this.cachedAufggThemaMstMaps) {
            return of(this.cachedAufggThemaMstMaps);
        }

        let url =
            API_URL +
            "/contactnew/aufggthemamstmap?mst=" +
            this.userService.userInfo.benutzername.substring(0, 2);
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let aufggThemaMstMaps = AufggThemaMstMap.ofList(
                        data.response,
                    );
                    this.cachedAufggThemaMstMaps = aufggThemaMstMaps;
                    return aufggThemaMstMaps;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadKontakt(
        id: number,
        fs: string,
        fsArt: string,
        pid: string,
    ): Observable<Kontakt> {
        let url =
            API_URL +
            "/contactnew/" +
            id +
            "?fs=" +
            fs +
            "&fsart=" +
            fsArt +
            "&pid=" +
            pid;

        return this.http.get<Kundenkontakt>(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar.");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    return Kontakt.of(data.response);
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadKontaktHistorie() {
        let url =
            API_URL +
            "/contactnew/historie?bearbeiter=" +
            this.userService.userInfo.benutzername;
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    return KontaktHistorie.ofList(data.response);
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadKontaktOhneFS(id: number): Observable<Kontakt> {
        let url = API_URL + "/contactnew/" + id;

        return this.http.get<Kundenkontakt>(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar.");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    return Kontakt.of(data.response);
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadKontaktarten() {
        if (this.cachedKontaktarten) {
            return of(this.cachedKontaktarten);
        }

        let url = API_URL + "/contactnew/kontaktarten";
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let kontaktarten = Kontaktart.ofList(data.response);
                    this.cachedKontaktarten = kontaktarten;
                    return kontaktarten;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadThemen() {
        if (this.cachedThemen) {
            return of(this.cachedThemen);
        }

        let url = API_URL + "/contactnew/themen";
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let themen = Thema.ofList(data.response);
                    this.cachedThemen = themen;
                    return themen;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    //QDASH-505
    loadUnterthemen() {
        if (this.cachedUnterthemen) {
            return of(this.cachedUnterthemen);
        }
        let url = API_URL + "/contactnew/unterthemen";
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    let unterthemen = Unterthema.ofList(data.response);
                    this.cachedUnterthemen = unterthemen;
                    return unterthemen;
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    saveKontakt(kontaktForm: KontaktForm, kunde: Kunde): Observable<any> {
        if (
            kunde.fs.fachschluesselArt === "VSNR" ||
            kunde.fs.fachschluesselArt === "BTNR"
        ) {
            let versicherter = kunde as Person;
            if (kontaktForm.currentKontakt.updatecount == null) {
                return this.createKontakt(kontaktForm, versicherter);
            } else {
                return this.updateKontakt(
                    kontaktForm,
                    versicherter.stammdaten.pid,
                );
            }
        } else if (kunde.fs.fachschluesselArt === "DGNR") {
            let dienstgeber = kunde as Dienstgeber;
            if (kontaktForm.currentKontakt.updatecount == null) {
                return this.createKontakt(kontaktForm, dienstgeber);
            } else {
                return this.updateKontakt(
                    kontaktForm,
                    dienstgeber.stammdaten.pid,
                );
            }
        }
    }

    saveKontaktShell(kunde: Kunde): Observable<any> {
        return this.createKontaktShell(kunde);
    }

    saveSubaufgabengebietKontakt(
        subaufgabengebietKontaktForm: SubaufgabengebietKontaktForm,
    ): Observable<any> {
        return this.updateSubaufgabengebietKontakt(
            subaufgabengebietKontaktForm,
        );
    }

    saveSubaufggShell(aufgabengebietId: number): Observable<any> {
        return this.createSubaufggShell(aufgabengebietId);
    }

    updateKontakt(kontaktForm: KontaktForm, pid: string): Observable<any> {
        return this.http.put(
            API_URL + "/contactnew?pid=" + pid,
            this.buildKontaktUpdateObject(kontaktForm),
        );
    }

    updateSubaufgabengebietKontakt(
        subaufgabengebietKontaktForm: SubaufgabengebietKontaktForm,
    ): Observable<any> {
        return this.http.put(
            API_URL + "/contactnew?",
            this.buildSubaufgabengebietKontaktUpdateObject(
                subaufgabengebietKontaktForm,
            ),
        );
    }
}
