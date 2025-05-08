import { TestBed } from "@angular/core/testing";
import { SpinnerService } from "./spinner.service";

describe("SpinnerService", () => {
    beforeEach(() => TestBed.configureTestingModule({}));

    it("should be created", () => {
        const service: SpinnerService = TestBed.get(SpinnerService);
        expect(service).toBeTruthy();
    });

    it("should be set spinner status to false", (done) => {
        const service: SpinnerService = TestBed.get(SpinnerService);
        service.selectSpinnerStatus().subscribe((status) => {
            expect(status).toBeFalsy();
            done();
        });
        service.hideSpinner();
    });

    it("should be set spinner status to true", (done) => {
        const service: SpinnerService = TestBed.get(SpinnerService);
        service.selectSpinnerStatus().subscribe((status) => {
            expect(status).toBeTruthy();
            done();
        });
        service.showSpinner();
    });
});
