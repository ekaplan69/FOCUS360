import { HttpClient } from "@angular/common/http";
import { EventEmitter, Injectable } from "@angular/core";
import { EMPTY } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { UserService } from "../../backend/user/user.service";

@Injectable({
    providedIn: "root",
})
export class ZpvDashboardUrlService {
    public urlLoaded: EventEmitter<string> = new EventEmitter();
    private ZPVCLK_URL_TAIL = "clk/clientkooperation.xhtml?clkToken=";
    private cachedUrl: string;

    constructor(
        private userService: UserService,
        private http: HttpClient,
    ) {}

    public loadUrl(pid: string) {
        if (this.cachedUrl) {
            this.urlLoaded.emit(this.cachedUrl);
        }

        if (pid == null) {
            return;
        }

        const endpoint = API_URL + "/person/initlinknew/" + pid;
        this.http
            .get<any>(endpoint)
            .pipe(
                map((data: any) => {
                    return data.response;
                }),
                catchError((_) => {
                    return EMPTY;
                }),
            )
            .subscribe((data) => {
                let url = data.clkLinkUrl + this.ZPVCLK_URL_TAIL + "[clkToken]";
                url = url.replace("[clkToken]", data.clkToken);
                this.cachedUrl = url;
                this.urlLoaded.emit(url);
            });
    }
}
