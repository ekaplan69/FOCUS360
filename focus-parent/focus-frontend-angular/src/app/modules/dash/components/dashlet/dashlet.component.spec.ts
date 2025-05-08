import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatCardModule } from "@angular/material/card";

import { DashletComponent } from "./dashlet.component";

describe("DashletComponent", () => {
    let component: DashletComponent;
    let fixture: ComponentFixture<DashletComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [MatCardModule, DashletComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
