import { AbstractControl } from "@angular/forms";

export function AufgValidator(control: AbstractControl) {
    if (!control || !control.value) {
        return null;
    }

    if (validateAufg(control.value)) {
        return null;
    }

    return { orgid: true };
}

export function validateAufg(aufgid) {
    if (!aufgid || aufgid.length < 1) {
        return false;
    }
    return true;
}
