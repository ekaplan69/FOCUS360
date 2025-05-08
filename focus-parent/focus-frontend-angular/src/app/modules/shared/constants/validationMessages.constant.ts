const VALUE_REPLACEMENT = "__VALUE__";
const VALIDATION_MESSAGES = {
    required: "Eingabe erforderlich!",
    minlength:
        "Bitte geben Sie mindestens " + VALUE_REPLACEMENT + " Zeichen ein!",
    maxlength: "Bitte geben Sie maximal " + VALUE_REPLACEMENT + " Zeichen ein!",
    vsnr: "Bitte geben Sie eine gültige Versicherungsnummer ein!",
    invalid: "Eingabe ungültig!",
    date: "Kein Datum!",
};

export function getValidationMessage(key: string, value?: string) {
    if (!key || !VALIDATION_MESSAGES[key]) {
        return null;
    }
    if (!value) {
        return VALIDATION_MESSAGES[key];
    }
    return VALIDATION_MESSAGES[key].replace(VALUE_REPLACEMENT, value);
}
