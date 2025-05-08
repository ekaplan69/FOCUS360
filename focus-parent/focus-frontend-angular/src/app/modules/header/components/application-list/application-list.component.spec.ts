import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";

import { ApplicationListComponent } from "./application-list.component";

describe("ApplicationListComponent", () => {
    let component: ApplicationListComponent;
    let fixture: ComponentFixture<ApplicationListComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [ApplicationListComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ApplicationListComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
