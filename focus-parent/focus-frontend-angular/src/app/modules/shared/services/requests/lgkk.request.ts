import { EventEmitter } from "@angular/core";

export class LgkkRequest {
    public requestBuilt: EventEmitter<any> = new EventEmitter<any>();

    constructor(
        private _fs: string,
        private _fsArt: string,
        private _ppid: string,
        private _versicherteAngehoerige: string[],
    ) {}

    get fs(): string {
        return this._fs;
    }

    set fs(value: string) {
        this._fs = value;
        this._fsArt = this._fs.startsWith("0") ? "BTNR" : "VSNR";

        if (this._fsArt === "BTNR") {
            this._versicherteAngehoerige = [];
        }

        this.transmitIfReady();
    }

    get fsArt(): string {
        return this._fsArt;
    }

    get ppid(): string {
        return this._ppid;
    }

    set ppid(value: string) {
        this._ppid = value;
        this.transmitIfReady();
    }

    get versicherteAngehoerige(): string[] {
        return this._versicherteAngehoerige;
    }

    set versicherteAngehoerige(value: string[]) {
        this._versicherteAngehoerige = value;
        this.transmitIfReady();
    }

    static empty() {
        return new LgkkRequest(null, null, null, null);
    }

    checkRequestReady(): boolean {
        if (this._fsArt === "BTNR") {
            return this._fs != null && this._ppid != null;
        }

        return (
            this._fs != null &&
            this._ppid != null &&
            this._versicherteAngehoerige != null
        );
    }

    transmitIfReady() {
        if (!this.checkRequestReady()) {
            return;
        }

        this.requestBuilt.emit();
    }
}
