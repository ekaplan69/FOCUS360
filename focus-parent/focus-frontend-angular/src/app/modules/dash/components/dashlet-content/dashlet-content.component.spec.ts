import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatCardModule } from "@angular/material/card";
import { DashletContentComponent } from "./dashlet-content.component";

describe("DashletContentComponent", () => {
    let component: DashletContentComponent;
    let fixture: ComponentFixture<DashletContentComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [MatCardModule, DashletContentComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletContentComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
