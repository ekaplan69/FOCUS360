import { TestBed } from "@angular/core/testing";
import { ToastrModule } from "ngx-toastr";
import { AlertService } from "./alert.service";

describe("AlertService", () => {
    beforeEach(() =>
        TestBed.configureTestingModule({
            imports: [ToastrModule.forRoot()],
        }),
    );

    it("should be created", () => {
        const service: AlertService = TestBed.get(AlertService);
        expect(service).toBeTruthy();
    });
});
