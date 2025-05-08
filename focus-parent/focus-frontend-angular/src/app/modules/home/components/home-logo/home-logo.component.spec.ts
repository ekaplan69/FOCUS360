import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";

import { HomeLogoComponent } from "./home-logo.component";

describe("HomeLogoComponent", () => {
    let component: HomeLogoComponent;
    let fixture: ComponentFixture<HomeLogoComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [HomeLogoComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HomeLogoComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
