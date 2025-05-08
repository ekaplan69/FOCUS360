import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ChangeDetectionStrategy } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule } from "@angular/forms";
import { MatCardModule } from "@angular/material/card";
import { MatDialogModule } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";
import { MatTooltipModule } from "@angular/material/tooltip";
import { DashletContentDataComponent } from "../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletFooterComponent } from "../../dashlet-footer/dashlet-footer.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";
import { DashletStammdatenComponent } from "./dashlet-stammdaten.component";

describe("DashletStammdatenComponent", () => {
    let component: DashletStammdatenComponent;
    let fixture: ComponentFixture<DashletStammdatenComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatCardModule,
                MatIconModule,
                FormsModule,
                MatFormFieldModule,
                MatTooltipModule,
                MatProgressSpinnerModule,
                HttpClientTestingModule,
                MatDialogModule,
                DashletStammdatenComponent,
                DashletComponent,
                DashletHeaderComponent,
                DashletContentComponent,
                DashletFooterComponent,
                DashletContentComponent,
                DashletContentDataComponent,
            ],
        })
            .overrideComponent(DashletStammdatenComponent, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletStammdatenComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
