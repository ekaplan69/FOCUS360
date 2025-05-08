import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatCardModule } from "@angular/material/card";
import { DashletFooterComponent } from "./dashlet-footer.component";

describe("DashletFooterComponent", () => {
    let component: DashletFooterComponent;
    let fixture: ComponentFixture<DashletFooterComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                HttpClientTestingModule,
                MatCardModule,
                DashletFooterComponent,
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletFooterComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
