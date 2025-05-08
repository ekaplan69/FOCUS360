import { TestBed } from "@angular/core/testing";

import { UiFunctionsService } from "./ui-functions.service";

describe("UiFunctionsService", () => {
    let service: UiFunctionsService;

    beforeEach(() => {
        TestBed.configureTestingModule({});
        service = TestBed.inject(UiFunctionsService);
    });

    it("should be created", () => {
        expect(service).toBeTruthy();
    });
});
