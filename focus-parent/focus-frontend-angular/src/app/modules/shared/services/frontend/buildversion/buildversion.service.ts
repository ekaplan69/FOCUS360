import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: "root",
})
export class BuildversionService {
    constructor(private http: HttpClient) {}

    getBuildVersion() {
        return this.http.get<any>("assets/json/buildVersion.json", {
            responseType: "json",
        });
    }
}
