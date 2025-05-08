import { Injectable } from "@angular/core";
import { Observable, ReplaySubject } from "rxjs";

@Injectable({
    providedIn: "root",
})
export class SpinnerService {
    private _subject = new ReplaySubject<any>();

    constructor() {}

    hideSpinner() {
        this._subject.next(false);
    }

    selectSpinnerStatus(): Observable<boolean> {
        return this._subject.asObservable();
    }

    showSpinner() {
        this._subject.next(true);
    }
}
