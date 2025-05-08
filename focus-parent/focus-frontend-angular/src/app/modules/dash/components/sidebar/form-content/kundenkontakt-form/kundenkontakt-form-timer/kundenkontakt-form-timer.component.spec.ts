import { ComponentFixture, TestBed } from "@angular/core/testing";

import { KundenkontaktFormTimerComponent } from "./kundenkontakt-form-timer.component";

describe("KundenkontaktFormTimerComponent", () => {
    let component: KundenkontaktFormTimerComponent;
    let fixture: ComponentFixture<KundenkontaktFormTimerComponent>;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [KundenkontaktFormTimerComponent],
        }).compileComponents();
    });

    beforeEach(() => {
        fixture = TestBed.createComponent(KundenkontaktFormTimerComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
