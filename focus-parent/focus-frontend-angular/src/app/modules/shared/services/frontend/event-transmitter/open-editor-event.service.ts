import { EventEmitter, Injectable } from "@angular/core";

@Injectable({ providedIn: "root" })
export class FormActivationService {
    formActivated: EventEmitter<string> = new EventEmitter<string>();
}
