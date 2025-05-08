import { ComponentFixture, TestBed } from "@angular/core/testing";
import { DashletContentDataComponent } from "../../../dashlet-content-data/dashlet-content-data.component";

import { DashletStammdatenContentComponent } from "./dashlet-stammdaten-content.component";

describe("DashletStammdatenContentComponent", () => {
    let component: DashletStammdatenContentComponent;
    let fixture: ComponentFixture<DashletStammdatenContentComponent>;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [
                DashletStammdatenContentComponent,
                DashletContentDataComponent,
            ],
        }).compileComponents();

        fixture = TestBed.createComponent(DashletStammdatenContentComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
