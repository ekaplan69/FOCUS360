import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatCardModule } from "@angular/material/card";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";
import { DashletHeaderComponent } from "./dashlet-header.component";

describe("DashletHeaderComponent", () => {
    let component: DashletHeaderComponent;
    let fixture: ComponentFixture<DashletHeaderComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatCardModule,
                MatIconModule,
                MatTooltipModule,
                DashletHeaderComponent,
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletHeaderComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
