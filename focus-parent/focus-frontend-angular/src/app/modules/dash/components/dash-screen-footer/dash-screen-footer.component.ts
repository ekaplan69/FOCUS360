import { ChangeDetectorRef, Component, OnInit } from "@angular/core";
import { BuildversionService } from "../../../shared/services/frontend/buildversion/buildversion.service";

@Component({
    selector: "f360-dash-screen-footer",
    templateUrl: "./dash-screen-footer.component.html",
    styleUrls: ["./dash-screen-footer.component.scss"],
    standalone: true,
})
export class DashScreenFooterComponent implements OnInit {
    environmentBuildNumber: string;

    constructor(
        private buildVer: BuildversionService,
        private cd: ChangeDetectorRef,
    ) {
        buildVer.getBuildVersion().subscribe((data) => {
            this.environmentBuildNumber = data.mvnbuildversion;
            this.cd.detectChanges();
        });
    }

    ngOnInit() {}
}
