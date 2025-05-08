import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { EMPTY, Subject } from "rxjs";
import { Observable } from "rxjs/internal/Observable";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { Aufgabengebiet } from "../../../models/kundenkontaktNeu/aufgabengebiet.model";
import { UserInfo } from "../../../models/userInfo.model";

@Injectable({
    providedIn: "root",
})
export class UserService {
    public aufgabengebiete: Aufgabengebiet[] = [];
    public selectedAufgabengebiet?: string;
    public selectedOrganisationseinheit?: string;
    public selectedSubAufgabengebiet?: string;
    public userInfo: UserInfo;
    private _userInfo = new Subject<UserInfo>();

    constructor(private http: HttpClient) {}

    fillAufgabengebiete() {
        this.aufgabengebiete = JSON.parse(localStorage.getItem("subaufgg"));
    }

    readUserInfo(): void {
        const endpoint = API_URL + "/user";
        this.http
            .get<any>(endpoint)
            .pipe(
                map((data) => UserInfo.of(data)),
                catchError((_) => {
                    this._userInfo.next(null);
                    return EMPTY;
                }),
            )
            .subscribe((userInfo: UserInfo) => {
                userInfo.organisationseinheiten =
                    userInfo.organisationseinheiten.filter(
                        (e) => e.match("^[(Tr)(tr)].*ger.*") == null,
                    );
                this._userInfo.next(userInfo);
                this.userInfo = userInfo;
            });
    }

    readUserInfoObservable(): Observable<UserInfo> {
        const endpoint = API_URL + "/user";
        return this.http.get<any>(endpoint).pipe(
            map((data) => {
                let n = UserInfo.of(data);
                n.organisationseinheiten = n.organisationseinheiten.filter(
                    (e) => e.match("^[(Tr)(tr)].*ger.*") == null,
                );
                this.userInfo = n;
                this._userInfo.next(n);
                return n;
            }),
            catchError((_) => {
                this._userInfo.next(null);
                return EMPTY;
            }),
        );
    }

    selectUserInfo(): Observable<UserInfo> {
        return this._userInfo.asObservable();
    }

    setUserInfo(userInfo: UserInfo) {
        this._userInfo.next(userInfo);
        this.userInfo = userInfo;
    }
}
