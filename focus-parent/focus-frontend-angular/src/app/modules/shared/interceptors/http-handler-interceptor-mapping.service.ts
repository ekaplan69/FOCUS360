import { Injectable } from "@angular/core";
import { TransactionIdGenerator } from "../services/frontend/transaction/transaction-id-generator.service";

@Injectable({
    providedIn: "root",
})
export class HttpHandlerInterceptorMapping {
    private currentVSNR: string;
    private transactionMapping: Map<String, String> = new Map<String, String>();

    constructor(private transactionIdGenerator: TransactionIdGenerator) {}

    changeTransaction(newVSNR: string) {
        this.currentVSNR = newVSNR;
    }

    createTransaction(newVSNR: string) {
        this.currentVSNR = newVSNR;

        if (this.transactionMapping.has(this.currentVSNR)) {
            this.transactionMapping.delete(this.currentVSNR);
        }

        this.transactionMapping.set(
            this.currentVSNR,
            this.transactionIdGenerator.generateTransaktionId().toString(),
        );
    }

    getCurrentTransactionId() {
        return this.transactionMapping.get(this.currentVSNR).toString();
    }

    isEmpty() {
        return this.transactionMapping.size == 0;
    }
}
