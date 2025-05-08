import { Injectable } from "@angular/core";
import { BeschwerdeService } from "../services/backend/beschwerde/beschwerde.service";
import { KontaktService } from "../services/backend/kontakt/kontakt.service";
import { Forms } from "./forms.model";

@Injectable({
    providedIn: "root",
})
export class FormsFactory {
    constructor(
        private beschwerdeService: BeschwerdeService,
        private kontaktService: KontaktService,
    ) {}

    createForms() {
        return new Forms(this.beschwerdeService, this.kontaktService);
    }
}
