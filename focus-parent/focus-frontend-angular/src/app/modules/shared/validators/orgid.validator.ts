import { AbstractControl } from "@angular/forms";

export function OrgidValidator(control: AbstractControl) {
    if (!control || !control.value) {
        return null;
    }

    if (validateOrgid(control.value)) {
        return null;
    }

    return { orgid: true };
}

export function validateOrgid(orgid) {
    if (!orgid || orgid.length < 1) {
        return false;
    }
    return true;
}
