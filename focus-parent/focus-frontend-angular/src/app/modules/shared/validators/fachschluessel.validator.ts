import { AbstractControl } from "@angular/forms";

const VSNR_LENGTH = 10;
const DGNR_LENGTH = 9;
const NUMBER_REGEXP = /^[0-9]+$/;

export function FachschluesselValidator(control: AbstractControl) {
    if (!control || !control.value) {
        return null;
    }

    if (validateFs(control.value)) {
        return null;
    }

    return { vsnr: true };
}

export function validateFs(fs) {
    fs = fs.replace(/\s/g, "");
    if (!NUMBER_REGEXP.test(fs)) {
        return false;
    }

    if (fs.toString().length === DGNR_LENGTH) {
        return true;
    }

    if (fs.toString().length === VSNR_LENGTH) {
        fs = fs.toString();
        // https://www.sozialversicherung.at/portal27/esvportal/content?contentid=10007.686020&viewmode=content
        const sum =
            fs.charAt(0) * 3 +
            fs.charAt(1) * 7 +
            fs.charAt(2) * 9 +
            fs.charAt(4) * 5 +
            fs.charAt(5) * 8 +
            fs.charAt(6) * 4 +
            fs.charAt(7) * 2 +
            fs.charAt(8) * 1 +
            fs.charAt(9) * 6;
        const pruefziffer = sum % 11;
        if (pruefziffer === parseInt(fs.charAt(3), 10)) {
            return true;
        }
    }

    return false;
}
