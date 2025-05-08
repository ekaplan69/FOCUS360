import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";

import { DashletContentDataComponent } from "./dashlet-content-data.component";

describe("DashletContentDataComponent", () => {
    let component: DashletContentDataComponent;
    let fixture: ComponentFixture<DashletContentDataComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [DashletContentDataComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletContentDataComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
