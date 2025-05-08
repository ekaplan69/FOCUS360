import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { ErrorImageComponent } from "./error-image.component";

describe("ErrorImageComponent", () => {
    let component: ErrorImageComponent;
    let fixture: ComponentFixture<ErrorImageComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [ErrorImageComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ErrorImageComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
