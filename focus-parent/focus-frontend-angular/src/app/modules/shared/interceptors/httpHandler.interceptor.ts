import {
    HttpEvent,
    HttpHandler,
    HttpInterceptor,
    HttpRequest,
} from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { UserService } from "../services/backend/user/user.service";
import { TransactionIdGenerator } from "../services/frontend/transaction/transaction-id-generator.service";
import { HttpHandlerInterceptorMapping } from "./http-handler-interceptor-mapping.service";

@Injectable()
export class HttpHandlerInterceptor implements HttpInterceptor {
    constructor(
        private transActionIdGenerator: TransactionIdGenerator,
        private userService: UserService,
        private transactionMapping: HttpHandlerInterceptorMapping,
    ) {}

    intercept(
        req: HttpRequest<any>,
        next: HttpHandler,
    ): Observable<HttpEvent<any>> {
        if (req.method !== "JSONP") {
            req = req.clone({
                headers: req.headers.set(
                    "content-type",
                    "application/json;charset=utf-8",
                ),
            });
            if (this.userService.selectedOrganisationseinheit != null) {
                req = req.clone({
                    headers: req.headers.set(
                        "X-ORGEINHEITID",
                        this.userService.selectedOrganisationseinheit,
                    ),
                });
            } else {
                req = req.clone({
                    headers: req.headers.set(
                        "X-ORGEINHEITID",
                        "FOCUS360_NO_ORGEINHEIT",
                    ),
                });
            }
            if (!this.transactionMapping.isEmpty()) {
                req = req.clone({
                    headers: req.headers.set(
                        "X-TRANSACTIONUUID",
                        this.transactionMapping.getCurrentTransactionId(),
                    ),
                });
            } else {
                req = req.clone({
                    headers: req.headers.set(
                        "X-TRANSACTIONUUID",
                        this.transActionIdGenerator
                            .generateTransaktionId()
                            .toString(),
                    ),
                });
            }
        }
        return next.handle(req);
    }
}
