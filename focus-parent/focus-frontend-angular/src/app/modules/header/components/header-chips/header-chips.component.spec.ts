import { DatePipe } from "@angular/common";
import {
    provideHttpClient,
    withInterceptorsFromDi,
} from "@angular/common/http";
import {
    HttpClientTestingModule,
    provideHttpClientTesting,
} from "@angular/common/http/testing";
import { ChangeDetectionStrategy } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatChipsModule } from "@angular/material/chips";
import { MatDialogModule } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";
import { ChipListComponent } from "../../../shared/components/chip-list/chip-list.component";
import { ChipComponent } from "../../../shared/components/chip/chip.component";
import { DynamicPipe } from "../../../shared/pipes/dynamicPipe";
import { HeaderChipsComponent } from "./header-chips.component";

describe("HeaderChipsComponent", () => {
    let component: HeaderChipsComponent;
    let fixture: ComponentFixture<HeaderChipsComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatChipsModule,
                MatFormFieldModule,
                MatIconModule,
                MatTooltipModule,
                HttpClientTestingModule,
                MatDialogModule,
                HeaderChipsComponent,
                ChipListComponent,
                ChipComponent,
                DynamicPipe,
            ],
            providers: [
                DatePipe,
                provideHttpClient(withInterceptorsFromDi()),
                provideHttpClientTesting(),
            ],
        })
            .overrideComponent(HeaderChipsComponent, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HeaderChipsComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
