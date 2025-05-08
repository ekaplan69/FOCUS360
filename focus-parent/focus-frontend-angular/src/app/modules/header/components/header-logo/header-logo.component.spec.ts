import { ChangeDetectionStrategy } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { HeaderLogoComponent } from "./header-logo.component";

describe("HeaderLogoComponent", () => {
    let component: HeaderLogoComponent;
    let fixture: ComponentFixture<HeaderLogoComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [HeaderLogoComponent],
        })
            .overrideComponent(HeaderLogoComponent, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HeaderLogoComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
