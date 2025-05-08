import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { EMPTY, Observable } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../constants/serviceUrl.constant";
import { ReleasenoteModel } from "../../../models/releasenotes/releasenote.model";
import { ReleasenotesCollectionModel } from "../../../models/releasenotes/ReleasenotesCollection.model";
import { SucheService } from "../../backend/suche/suche.service";
import { UserService } from "../../backend/user/user.service";

@Injectable({
    providedIn: "root",
})
export class ReleasenoteService {
    public static LAST_LOGIN_KEY: string = "lastlogin";

    constructor(
        private httpClient: HttpClient,
        public userService: UserService,
        public sucheService: SucheService,
    ) {}

    public getLastLogin(): Date {
        let lastLogin = new Date(
            localStorage.getItem(ReleasenoteService.LAST_LOGIN_KEY),
        );

        if (!lastLogin) {
            let date = new Date();
            return new Date(date.getDate() - 1);
        }

        return lastLogin;
    }

    /**
     *@description
     * calls Java backend to read file at focus-business/focus-business-service/src/main/resources/patchnotes.csv and parses the content into `ReleasenoteModel` and filters it according to the
     *     current user role.
     *
     * @returns {ReleasenotesCollectionModel} or [] when focus-business/focus-business-service/src/main/resources/patchnotes.csv is not found or empty
     */
    public readReleasenotesCSV(): Observable<ReleasenotesCollectionModel> {
        let url = API_URL + "/patchnotes";
        return this.httpClient.get(url).pipe(
            catchError(() => {
                return EMPTY;
            }),
            map((value: any) => {
                if (!value) {
                    return new ReleasenotesCollectionModel();
                }
                let returnValue: ReleasenoteModel[] = [];
                let data = value.response.patchnotes
                    .join("\n")
                    .toString()
                    .split("\n");
                data.shift();
                data.forEach((currentValue) => {
                    let row = currentValue.split(";");
                    if (row[0].trim()) {
                        returnValue.push(
                            new ReleasenoteModel(
                                new Date(row[0].trim()),
                                row[1].trim(),
                                row[2].trim(),
                                row[3].trim(),
                                row[4].trim(),
                            ),
                        );
                    }
                });
                return new ReleasenotesCollectionModel(
                    returnValue.filter((value1) =>
                        this.userService.userInfo.containsRolle(value1.group),
                    ),
                );
            }),
        );
    }

    public setLastLoginNow() {
        localStorage.setItem(
            ReleasenoteService.LAST_LOGIN_KEY,
            new Date().toUTCString(),
        );
    }
}
