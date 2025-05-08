import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { EMPTY, Observable } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { UserService } from "../../backend/user/user.service";

@Injectable({
    providedIn: "root",
})
export class LgkkUrlService {
    public currentUrl: Observable<string>;
    private cachedUrl: string;

    constructor(
        private userService: UserService,
        private http: HttpClient,
    ) {}

    /**
     * We don't load the whole URL from the backend, just the parts up to the toplevel domain.
     * Further parameters are added here in the frontend.
     */
    public loadUrl(vsnr: string, pid: string, orgEinheit: string) {
        if (vsnr == null && pid == null && orgEinheit == null) {
            return;
        }

        const endpoint = API_URL + "/system/lgkkdashboard";

        this.currentUrl = new Observable((subscriber) => {
            this.http
                .get<any>(endpoint)
                .pipe(
                    map((data: any) => {
                        return data.response.dashboardUrl;
                    }),
                    catchError(() => {
                        return EMPTY;
                    }),
                )
                .subscribe((data) => {
                    let builtUrl = this.buildUrl(data, pid, vsnr, orgEinheit);
                    subscriber.next(builtUrl);
                });
        });
    }

    private buildUrl(path, pid, vsnr, orgEinheit) {
        let url = path + "versicherter?pid=[pid]&vsnr=[vsnr]&oe=[oe]";
        url = url.replace("[pid]", pid);
        url = url.replace("[vsnr]", vsnr);
        url = url.replace("[oe]", orgEinheit);
        this.cachedUrl = url;
        return url;
    }
}
