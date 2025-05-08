import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { BehaviorSubject } from "rxjs";

import { API_URL } from "../../../constants/serviceUrl.constant";
import { NotizDTO } from "../../../models/NotizDTO.model";
import { Person } from "../../../models/Person.model";

@Injectable({
    providedIn: "root",
})
export class NotizSpeichernService {
    public response: BehaviorSubject<any> = new BehaviorSubject<any>(null);

    constructor(private http: HttpClient) {}

    createNotiz(notiz: NotizDTO, pid: string) {
        let url =
            API_URL +
            "/notiz/" +
            notiz.fachschluessel.fachschluessel +
            "/" +
            notiz.fachschluessel.fachschluesselArt +
            "?pid=" +
            pid;

        this.http.post<any>(url, notiz).subscribe((data) => {
            this.response.next(data.metainformation);
        });
    }

    saveNotiz(notiz: NotizDTO, currentVersicherter: Person) {
        if (notiz.updateCount == -1) {
            this.createNotiz(notiz, currentVersicherter.stammdaten.pid);
        } else {
            this.updateNotiz(notiz, currentVersicherter.stammdaten.pid);
        }
    }

    updateNotiz(notiz: NotizDTO, pid: string) {
        let url =
            API_URL +
            "/notiz/" +
            notiz.fachschluessel.fachschluessel +
            "/" +
            notiz.fachschluessel.fachschluesselArt +
            "?pid=" +
            pid;

        this.http.put<any>(url, notiz).subscribe((data) => {
            this.response.next(data.metainformation);
        });
    }
}
