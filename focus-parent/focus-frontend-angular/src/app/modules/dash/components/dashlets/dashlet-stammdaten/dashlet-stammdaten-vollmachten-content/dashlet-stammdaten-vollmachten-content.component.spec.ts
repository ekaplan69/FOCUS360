import { ComponentFixture, TestBed } from "@angular/core/testing";

import { DashletStammdatenVollmachtenContentComponent } from "./dashlet-stammdaten-vollmachten-content.component";

describe("DashletStammdatenVollmachtenContentComponent", () => {
    let component: DashletStammdatenVollmachtenContentComponent;
    let fixture: ComponentFixture<DashletStammdatenVollmachtenContentComponent>;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [DashletStammdatenVollmachtenContentComponent],
        }).compileComponents();

        fixture = TestBed.createComponent(
            DashletStammdatenVollmachtenContentComponent,
        );
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
