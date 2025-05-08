import { Pipe, PipeTransform } from "@angular/core";
import { validateFs } from "../validators/fachschluessel.validator";

@Pipe({
    name: "vsnr",
    standalone: true,
})
export class VsnrPipe implements PipeTransform {
    transform(vsnr: string): string {
        return transformVsnr(vsnr);
    }
}

export function transformVsnr(vsnr: string) {
    if (vsnr && validateFs(vsnr)) {
        return (
            vsnr.substring(0, 4) +
            " " +
            vsnr.substring(4, 6) +
            " " +
            vsnr.substring(6, 8) +
            " " +
            vsnr.substring(8, 10)
        );
    }
    return vsnr;
}
