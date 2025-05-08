import { ChangeDetectorRef, Component, OnInit } from "@angular/core";
import { BuildversionService } from "../../../shared/services/frontend/buildversion/buildversion.service";

@Component({
    selector: "f360-home-footer",
    templateUrl: "./home-footer.component.html",
    styleUrls: ["./home-footer.component.scss"],
    standalone: true,
})
export class HomeFooterComponent implements OnInit {
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
