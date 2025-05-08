import { Injectable } from "@angular/core";

@Injectable({
    providedIn: "root",
})
export class UiFunctionsService {
    constructor() {}

    public static focusSearchField() {
        const searchField = document.getElementById("focus360-search-field");
        if (searchField) {
            searchField.focus();
        }
    }
}
