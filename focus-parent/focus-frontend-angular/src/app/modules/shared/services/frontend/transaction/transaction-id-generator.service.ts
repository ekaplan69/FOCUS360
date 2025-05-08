import { Injectable } from "@angular/core";

@Injectable({
    providedIn: "root",
})
export class TransactionIdGenerator {
    // noinspection JSMethodCanBeStatic
    generateTransaktionId() {
        return Math.floor(1000000000000 + Math.random() * 9000000000000);
    }
}
