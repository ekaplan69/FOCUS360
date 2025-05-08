import {
    provideHttpClient,
    withInterceptorsFromDi,
} from "@angular/common/http";
import { provideHttpClientTesting } from "@angular/common/http/testing";
import { TestBed } from "@angular/core/testing";

import { BuildversionService } from "./buildversion.service";

describe("BuildversionService", () => {
    beforeEach(() =>
        TestBed.configureTestingModule({
            imports: [],
            providers: [
                provideHttpClient(withInterceptorsFromDi()),
                provideHttpClientTesting(),
            ],
        }),
    );

    it("should be created", () => {
        const service: BuildversionService = TestBed.get(BuildversionService);
        expect(service).toBeTruthy();
    });
});
