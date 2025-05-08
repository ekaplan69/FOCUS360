import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { API_URL } from "../../../constants/serviceUrl.constant";

@Injectable({
    providedIn: "root",
})
export class ZupService {
    constructor(private http: HttpClient) {}

    buildLogZupObject(fachschluessel: String, fachschluesselArtKurz: String) {
        return {
            fachschluessel: fachschluessel,
            fachschluesselArtKurz: fachschluesselArtKurz,
        };
    }

    logZUP(
        fachschluessel: String,
        fachschluesselArtKurz: String,
        pid: String,
        protLogId: String,
    ) {
        this.http
            .post<any>(
                API_URL + "/zup?pid=" + pid + "&protid=" + protLogId,
                this.buildLogZupObject(fachschluessel, fachschluesselArtKurz),
            )
            .subscribe();
    }
}
