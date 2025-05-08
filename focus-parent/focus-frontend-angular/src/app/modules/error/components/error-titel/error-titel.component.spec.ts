import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { ErrorTitelComponent } from "./error-titel.component";

describe("ErrorTitelComponent", () => {
    let component: ErrorTitelComponent;
    let fixture: ComponentFixture<ErrorTitelComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [ErrorTitelComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ErrorTitelComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
