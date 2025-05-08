import {
    provideHttpClient,
    withInterceptorsFromDi,
} from "@angular/common/http";
import {
    HttpTestingController,
    provideHttpClientTesting,
} from "@angular/common/http/testing";
import { getTestBed, TestBed } from "@angular/core/testing";
import { UserService } from "./user.service";

describe("UserService", () => {
    let injector: TestBed;
    let userService: UserService;
    let httpMock: HttpTestingController;

    beforeEach(() => {
        TestBed.configureTestingModule({
            imports: [],
            providers: [
                provideHttpClient(withInterceptorsFromDi()),
                provideHttpClientTesting(),
            ],
        });
        injector = getTestBed();
        userService = injector.get(UserService);
        httpMock = injector.get(HttpTestingController);
    });

    afterEach(() => {
        httpMock.verify();
    });

    it("should be created", () => {
        const service: UserService = TestBed.get(UserService);
        expect(service).toBeTruthy();
    });
});
