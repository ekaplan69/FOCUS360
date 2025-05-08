import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { forkJoin, Observable, throwError } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { FeedbackGrund } from "../../../models/feedback/feedback-grund.model";
import { FeedbackLang } from "../../../models/feedback/feedback-lang.model";
import { FeedbackThema } from "../../../models/feedback/feedback-thema.model";
import { FeedbackUnterkategorie } from "../../../models/feedback/feedback-unterkategorie.model";

import { Aufgabengebiet } from "../../../models/kundenkontaktNeu/aufgabengebiet.model";
import { Kontaktart } from "../../../models/kundenkontaktNeu/kontaktart.model";
import { UserService } from "../user/user.service";

@Injectable({
    providedIn: "root",
})
export class BeschwerdeService {
    cachedThemaAuswahl: FeedbackThema[];

    constructor(
        private http: HttpClient,
        private userService: UserService,
    ) {}

    buildFeedbackInsertShell(fb: FeedbackLang) {
        return {
            mitarbeitername: this.userService.userInfo.nachname,
            meldendeStelle: this.userService.userInfo.bundesland,
            fachschluessel: fb.fachschluessel,
            fachschluesselArtKurz: fb.fachschluesselArt,
            feedbackArt: fb.feedbackArt,
            kontaktartId: fb.kontaktArt,
            themaId: fb.themaId,
            feedbackgrundId: fb.grundId,
            unterkategorieId: fb.unterkategorieId,
            name: fb.fullName,
            beschreibung: fb.beschreibung,
            verbesserungspotential: fb.verbesserung,
            email: null,
            telNr: null,
            mitarbeiterOe: this.userService.selectedOrganisationseinheit,
            letztaend: this.userService.userInfo.benutzername,
        };
    }

    buildFeedbackUpdateShell(fb: FeedbackLang) {
        return {
            id: fb.id,
            feedbackArt: fb.feedbackArt,
            kontaktartId: fb.kontaktArt,
            themaId: fb.themaId,
            feedbackgrundId: fb.grundId,
            unterkategorieId: fb.unterkategorieId,
            name: fb.fullName,
            beschreibung: fb.beschreibung,
            verbesserungspotential: fb.verbesserung,
            email: null,
            telNr: null,
            letztaend: this.userService.userInfo.benutzername,
            updateCount: fb.updatecount,
            status: fb.status,
        };
    }

    createFeedback(feedback: FeedbackLang) {
        return this.http.post<any>(
            API_URL + "/feedback",
            this.buildFeedbackInsertShell(feedback),
        );
    }

    getFeedback(id: number, pid: string): Observable<FeedbackLang> {
        let url = API_URL + "/feedback/" + id + "?pid=" + pid;
        return this.http.get(url).pipe(
            catchError(() => {
                throw throwError(new Error("Interner Systemfehler"));
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return FeedbackLang.of(data.response);
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    getGruende() {
        let url = API_URL + "/feedback/feedbackgruende";
        return this.http.get(url).pipe(
            catchError(() => {
                throw throwError(new Error("Interner Systemfehler"));
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return FeedbackGrund.ofMap(data.response);
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    getGrundById(themaId: number, unterkategorieId: number, grundId: number) {
        let unterkategorie = this.getUnterkategorieById(
            themaId,
            unterkategorieId,
        );
        if (unterkategorie) {
            return unterkategorie.gruende
                .concat(this.getThemaById(themaId).gruende)
                .find((value) => value.id == grundId);
        } else {
            return this.getThemaById(themaId).gruende.find(
                (value) => value.id == grundId,
            );
        }
    }

    getKontaktarten(): Observable<Kontaktart[]> {
        let url = API_URL + "/contactnew/kontaktarten";
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status == "OK") {
                    return Kontaktart.ofList(data.response);
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    getThemaById(id: number) {
        return this.cachedThemaAuswahl.find((value) => value.themaId == id);
    }

    getThemaFbgMaps() {
        let url = API_URL + "/feedback/themaFbgMaps";
        return this.http.get(url).pipe(
            catchError(() => {
                throw throwError(new Error("Interner Systemfehler"));
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    let mapResponse = new Map<number, Set<number>>();
                    data.response.forEach((value) => {
                        if (mapResponse.has(value.themaId)) {
                            mapResponse.get(value.themaId).add(value.fbgId);
                        } else {
                            mapResponse.set(
                                value.themaId,
                                new Set<number>([value.fbgId]),
                            );
                        }
                    });
                    return mapResponse;
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    getThemen(): Observable<FeedbackThema[]> {
        let url = API_URL + "/feedback/themen";
        return this.http.get(url).pipe(
            catchError(() => {
                throw throwError(new Error("Interner Systemfehler"));
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return FeedbackThema.ofList(data.response);
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    public getThemenAuswahl(): Observable<FeedbackThema[]> {
        return forkJoin({
            themen: this.getThemen(),
            themenMap: this.getThemaFbgMaps(),
            gruende: this.getGruende(),
            kat: this.getUnterkategorien(),
            unterkatMap: this.getUnterkategorieFbgMaps(),
        }).pipe(
            map((value) => {
                value.kat.forEach((katObj) => {
                    let get = value.unterkatMap.get(katObj.id);
                    if (get !== undefined) {
                        get.forEach((grundId) => {
                            katObj.gruende.push(value.gruende.get(grundId));
                        });
                    }
                });
                value.themen.forEach((themaObj) => {
                    let get = value.themenMap.get(themaObj.themaId);
                    if (get !== undefined) {
                        get.forEach((grundId) => {
                            themaObj.gruende.push(value.gruende.get(grundId));
                        });
                    }
                });

                value.kat.forEach((unkat) => {
                    value.themen.forEach((thema) => {
                        if (thema.themaId == unkat.themaId) {
                            thema.unterkategorien.push(unkat);
                        }
                    });
                });
                this.cachedThemaAuswahl = value.themen;
                return value.themen;
            }),
        );
    }

    public getThemenFilteredByAufgG(): Observable<FeedbackThema[]> {
        return forkJoin({
            themen: this.getThemenAuswahl(),
            themenMap: this.loadAufggThemaMstMap(),
            aufgabengebiete: this.loadAufgabengebiete(),
        }).pipe(
            map((value) => {
                let aufggUser = value.aufgabengebiete.find(
                    (value) =>
                        value.aufgabengebietBezeichnung ==
                        this.userService.selectedAufgabengebiet,
                ).aufgabengebietId;
                let filteredThemen = value.themenMap.get(aufggUser);
                if (filteredThemen) {
                    return value.themen.filter((value) =>
                        filteredThemen.has(value.themaId),
                    );
                } else {
                    return [];
                }
            }),
        );
    }

    getUnterkategorieById(themaId: number, unterkategorieId: number) {
        return this.getThemaById(themaId).unterkategorien.find(
            (value) => value.id == unterkategorieId,
        );
    }

    getUnterkategorieFbgMaps() {
        let url = API_URL + "/feedback/unterkategorieFbgMaps";
        return this.http.get(url).pipe(
            catchError(() => {
                throw throwError(new Error("Interner Systemfehler"));
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    let mapResponse = new Map<number, Set<number>>();
                    data.response.forEach((value) => {
                        if (mapResponse.has(value.unterkategorieId)) {
                            mapResponse
                                .get(value.unterkategorieId)
                                .add(value.fbgId);
                        } else {
                            mapResponse.set(
                                value.unterkategorieId,
                                new Set<number>([value.fbgId]),
                            );
                        }
                    });
                    return mapResponse;
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    getUnterkategorien() {
        let url = API_URL + "/feedback/unterkategorien";
        return this.http.get(url).pipe(
            catchError(() => {
                throw throwError(new Error("Interner Systemfehler"));
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return FeedbackUnterkategorie.ofMap(data.response);
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    loadAufgabengebiete(): Observable<Aufgabengebiet[]> {
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
                    return Aufgabengebiet.ofList(data.response);
                } else {
                    throw new Error(
                        data.metainformation.meldungen[0].meldungstext,
                    );
                }
            }),
        );
    }

    loadAufggThemaMstMap() {
        let url =
            API_URL +
            "/contactnew/aufggthemamstmap?mst=" +
            this.userService.userInfo.benutzername.substring(0, 2);
        return this.http.get(url).pipe(
            catchError(() => {
                throw new Error("Subsystem nicht erreichbar!");
            }),
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    let mapResponse = new Map<number, Set<number>>();
                    data.response.forEach((value) => {
                        if (mapResponse.has(value.aufgabengebietId)) {
                            mapResponse
                                .get(value.aufgabengebietId)
                                .add(value.themaId);
                        } else {
                            mapResponse.set(
                                value.aufgabengebietId,
                                new Set<number>([value.themaId]),
                            );
                        }
                    });
                    return mapResponse;
                } else {
                    throw throwError(
                        new Error(
                            data.metainformation.meldungen[0].meldungstext,
                        ),
                    );
                }
            }),
        );
    }

    updateFeedback(feedback: FeedbackLang) {
        return this.http.put<any>(
            API_URL + "/feedback",
            this.buildFeedbackUpdateShell(feedback),
        );
    }
}
