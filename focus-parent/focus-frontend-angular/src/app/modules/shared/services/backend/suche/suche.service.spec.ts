import { DatePipe } from "@angular/common";
import {
    provideHttpClient,
    withInterceptorsFromDi,
} from "@angular/common/http";
import {
    HttpTestingController,
    provideHttpClientTesting,
} from "@angular/common/http/testing";
import { getTestBed, TestBed } from "@angular/core/testing";
import { MatDialogModule } from "@angular/material/dialog";
import { SucheService } from "./suche.service";

describe("SucheService", () => {
    let injector: TestBed;
    let sucheService: SucheService;
    let httpMock: HttpTestingController;

    // how to mock service: https://medium.com/netscape/testing-with-the-angular-httpclient-api-648203820712
    beforeEach(() => {
        TestBed.configureTestingModule({
            imports: [MatDialogModule],
            providers: [
                DatePipe,
                provideHttpClient(withInterceptorsFromDi()),
                provideHttpClientTesting(),
            ],
        });
        injector = getTestBed();
        sucheService = injector.get(SucheService);
        httpMock = injector.get(HttpTestingController);
    });

    afterEach(() => {
        httpMock.verify();
    });

    it("should be created", () => {
        const service: SucheService = TestBed.get(SucheService);
        expect(service).toBeTruthy();
    });
});
