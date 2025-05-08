import { ChangeDetectionStrategy, NO_ERRORS_SCHEMA } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { RouterTestingModule } from "@angular/router/testing";
import { ErrorImageComponent } from "./components/error-image/error-image.component";
import { ErrorMessageComponent } from "./components/error-message/error-message.component";
import { ErrorTitelComponent } from "./components/error-titel/error-titel.component";
import { ErrorContainer } from "./error.container";

describe("ErrorContainer", () => {
    let component: ErrorContainer;
    let fixture: ComponentFixture<ErrorContainer>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                RouterTestingModule.withRoutes([]),
                ErrorContainer,
                ErrorImageComponent,
                ErrorTitelComponent,
                ErrorMessageComponent,
            ],
            schemas: [NO_ERRORS_SCHEMA],
        })
            .overrideComponent(ErrorContainer, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ErrorContainer);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
