import { DatePipe } from "@angular/common";
import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule } from "@angular/forms";
import { MatChipsModule } from "@angular/material/chips";
import { MatDialogModule } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";
import { DynamicPipe } from "../../pipes/dynamicPipe";
import { ChipComponent } from "../chip/chip.component";
import { ChipListComponent } from "./chip-list.component";

describe("ChipListComponent", () => {
    let component: ChipListComponent;
    let fixture: ComponentFixture<ChipListComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                FormsModule,
                MatFormFieldModule,
                MatChipsModule,
                MatIconModule,
                MatTooltipModule,
                HttpClientTestingModule,
                MatDialogModule,
                ChipListComponent,
                ChipComponent,
                DynamicPipe,
            ],
            providers: [DatePipe],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ChipListComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
