import { Injectable } from "@angular/core";
import { ToastrService } from "ngx-toastr";

@Injectable({
    providedIn: "root",
})
export class AlertService {
    constructor(private toastr: ToastrService) {}

    error(message: string) {
        this.toastr.error(message, "Fehler!", {
            timeOut: 0,
            extendedTimeOut: 0,
            progressBar: true,
            enableHtml: true,
        });
    }

    info(message: string) {
        this.toastr.info(message, "Information", {
            timeOut: 5000,
            progressBar: true,
            enableHtml: true,
        });
    }

    success(message: string) {
        this.toastr.success(message, "Erfolgreich!", {
            timeOut: 5000,
            progressBar: true,
            enableHtml: true,
            positionClass: "toast-bottom-right",
        });
    }

    warning(message: string) {
        this.toastr.warning(message, "Warnung!", {
            timeOut: 5000,
            progressBar: true,
            enableHtml: true,
        });
    }
}
