import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatChipsModule } from "@angular/material/chips";
import { MatIconModule } from "@angular/material/icon";
import { DynamicPipe } from "../../pipes/dynamicPipe";
import { ChipComponent } from "./chip.component";

describe("ChipComponent", () => {
    let component: ChipComponent;
    let fixture: ComponentFixture<ChipComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatChipsModule,
                MatIconModule,
                ChipComponent,
                DynamicPipe,
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ChipComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
