import { ComponentFixture, TestBed } from "@angular/core/testing";

import { SubaufgabengebietFormTimerComponent } from "./subaufgabengbiet-form-timer.component";

describe("SubaufgabengebietFormTimerComponent", () => {
    let component: SubaufgabengebietFormTimerComponent;
    let fixture: ComponentFixture<SubaufgabengebietFormTimerComponent>;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [SubaufgabengebietFormTimerComponent],
        }).compileComponents();
    });

    beforeEach(() => {
        fixture = TestBed.createComponent(SubaufgabengebietFormTimerComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
