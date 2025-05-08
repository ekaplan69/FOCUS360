import { HttpClient } from "@angular/common/http";
import { EventEmitter, Injectable } from "@angular/core";
import { BehaviorSubject, EMPTY } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { ClkOptionModel } from "../../../models/clk-option.model";
import { ClkToken } from "../../../models/clkToken.model";
import { ErrorMeldung } from "../../../models/errorMeldung.model";
import { PartnerId } from "../../../models/partnerId.model";

@Injectable({
    providedIn: "root",
})
export class ZpvClientCoopNeuService {
    public _clkOptions = new BehaviorSubject<ClkOptionModel[]>(null);
    public cachedUrl: string;
    public urlLoaded: EventEmitter<string> = new EventEmitter();
    private INIT_URL = API_URL + "/person/initccnew";
    private SEARCH_URL = API_URL + "/person/searchccnew";
    private ZPVCLK_URL_TAIL = "clk/clientkooperation.xhtml?clkToken=";
    private _zpvResponseError: ErrorMeldung;

    constructor(private http: HttpClient) {}

    public clkSucheInitialisieren() {
        return this.http.get<any>(this.INIT_URL).pipe(
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return ClkToken.of(data.response);
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

    public clkSuchergebnisAbfragen(clkToken: string) {
        return this.http.get<any>(this.SEARCH_URL + "/" + clkToken).pipe(
            map((data: any) => {
                if (data.metainformation.status === "OK") {
                    return PartnerId.ofList(data.response);
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

    public loadUrl() {
        if (this.cachedUrl) {
            this.urlLoaded.emit(this.cachedUrl);
        }

        const endpoint = API_URL + "/system/zpvdashboard";
        this.http
            .get<any>(endpoint)
            .pipe(
                map((data: any) => {
                    return data.response.dashboardUrl;
                }),
                catchError((_) => {
                    return EMPTY;
                }),
            )
            .subscribe((data) => {
                let url = data + this.ZPVCLK_URL_TAIL;
                this.cachedUrl = url;
                this.urlLoaded.emit(url);
            });
    }

    zpvResponseError(): ErrorMeldung {
        return this._zpvResponseError;
    }
}
