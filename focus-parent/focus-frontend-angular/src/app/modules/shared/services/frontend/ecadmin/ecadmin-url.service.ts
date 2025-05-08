import { HttpClient } from "@angular/common/http";
import { EventEmitter, Injectable } from "@angular/core";
import { EMPTY } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { UserService } from "../../backend/user/user.service";

@Injectable({
    providedIn: "root",
})
export class EcadminUrlService {
    public urlLoaded: EventEmitter<string> = new EventEmitter();
    private cachedUrl: string;

    constructor(
        private userService: UserService,
        private http: HttpClient,
    ) {}

    public loadUrl(vsnr: string) {
        if (this.cachedUrl) {
            this.urlLoaded.emit(this.cachedUrl);
        }

        if (vsnr == null) {
            return;
        }

        const endpoint = API_URL + "/system/ecadmindashboard";
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
                let url =
                    data +
                    "EC4000/views/auswahlVersicherter.html?vsnr=[vsnr]&bearbGrund=grund";
                url = url.replace("[vsnr]", vsnr);
                this.cachedUrl = url;
                this.urlLoaded.emit(url);
            });
    }
}
