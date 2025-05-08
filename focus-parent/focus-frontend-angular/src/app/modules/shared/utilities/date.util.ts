import * as moment from "moment";

export function isISOFormat(date: string) {
    return date.length === 24 && moment(date, moment.ISO_8601).isValid();
}
