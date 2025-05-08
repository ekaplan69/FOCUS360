import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: "iban",
    standalone: true,
})
export class IbanPipe implements PipeTransform {
    transform(iban: string): string {
        return transformIban(iban);
    }
}

export function transformIban(iban: string) {
    if (iban) {
        for (let i = 4; i <= 20; i += 5) {
            iban = [iban.slice(0, i), " ", iban.slice(i)].join("");
        }
    }
    return iban;
}
