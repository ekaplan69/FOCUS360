import { EventEmitter, Injectable } from "@angular/core";

@Injectable({
    providedIn: "root",
})
export class SaveNotizTransmitter {
    public transmitter: EventEmitter<string> = new EventEmitter<string>();
}
