import { ChangeDetectionStrategy, Component, Input } from "@angular/core";
import { getValidationMessage } from "../../constants/validationMessages.constant";
import { ControlError } from "./customValueAccessor/customValueAccessor";

@Component({
    selector: "app-validation",
    templateUrl: "./validation.component.html",
    styleUrls: ["./validation.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [],
})
export class ValidationComponent {
    @Input() errors: Array<ControlError>;
    @Input() hasError: boolean;

    constructor() {}

    getMessage(error: ControlError) {
        let errorValue = error.value;
        if (this._hasErrorValue(errorValue)) {
            errorValue = errorValue.requiredLength || errorValue.value;
        }
        return getValidationMessage(error.key, errorValue);
    }

    private _hasErrorValue(errorValue) {
        return typeof errorValue !== "boolean";
    }
}
