import { HttpClient } from "@angular/common/http";
import { ChangeDetectionStrategy, Component } from "@angular/core";
import { EMPTY } from "rxjs";
import { catchError, map } from "rxjs/operators";
import { API_URL } from "../../../shared/constants/serviceUrl.constant";
import { AlertService } from "../../../shared/services/frontend/alert/alert.service";

@Component({
    selector: "f360-header-environment",
    templateUrl: "./header-environment.component.html",
    styleUrls: ["./header-environment.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [],
})
export class HeaderEnvironmentComponent {
    umgebung: string;

    constructor(
        private alertService: AlertService,
        private http: HttpClient,
    ) {
        this.ladeUmgebung();
    }

    getUmgebungsText() {
        if (this.umgebung === "Trägertest" || this.umgebung === "ITU") {
            return (
                "ACHTUNG! Sie befinden sich auf der Testumgebung " +
                this.umgebung
            );
        } else if (this.umgebung === "Entwicklung") {
            return "Aktuelle Umgebung: " + this.umgebung;
        } else {
            return "";
        }
    }

    isUmgebungsTextVisible(): boolean {
        return this.getUmgebungsText() !== "";
    }

    ladeUmgebung(): void {
        const endpoint = API_URL + "/system/umgebung";
        this.http
            .get<any>(endpoint)
            .pipe(
                map((data: any) => {
                    return data.response.umgebung;
                }),
                catchError((err) => {
                    console.log(err);
                    return EMPTY;
                }),
            )
            .subscribe((value) => {
                this.umgebung = value;
            });
    }
}
