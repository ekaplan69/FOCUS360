import { AbstractControl } from "@angular/forms";
import { isISOFormat } from "../utilities/date.util";

export function DateValidator(control: AbstractControl) {
    if (!control || !control.value) {
        return null;
    }

    return validateDate(control.value);
}

function validateDate(value: string) {
    if (isISOFormat(value)) {
        return null;
    }

    return { date: true };
}
