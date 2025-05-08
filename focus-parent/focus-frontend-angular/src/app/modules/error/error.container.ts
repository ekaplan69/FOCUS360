import { AsyncPipe } from "@angular/common";
import { ChangeDetectionStrategy, Component } from "@angular/core";
import { Observable } from "rxjs";
import { RouterService } from "../shared/services/frontend/router/router.service";
import { ErrorImageComponent } from "./components/error-image/error-image.component";
import { ErrorMessageComponent } from "./components/error-message/error-message.component";
import { ErrorTitelComponent } from "./components/error-titel/error-titel.component";

@Component({
    selector: "f360-error",
    templateUrl: "./error.container.html",
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [
        ErrorImageComponent,
        ErrorTitelComponent,
        ErrorMessageComponent,
        AsyncPipe,
    ],
})
export class ErrorContainer {
    $url: Observable<string>;

    constructor(private routerService: RouterService) {
        this._selectCurrentUrlWithOrigin();
    }

    private _selectCurrentUrlWithOrigin() {
        this.$url = this.routerService.selectCurrentUrlWithOrigin();
    }
}
