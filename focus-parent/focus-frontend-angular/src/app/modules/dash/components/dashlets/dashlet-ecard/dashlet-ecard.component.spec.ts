import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatCardModule } from "@angular/material/card";
import { MatDialogModule } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";
import { MatTooltipModule } from "@angular/material/tooltip";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { DashletContentDataComponent } from "../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletFooterComponent } from "../../dashlet-footer/dashlet-footer.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

import { DashletEcardComponent } from "./dashlet-ecard.component";

describe("DashletEcardComponent", () => {
    let component: DashletEcardComponent;
    let fixture: ComponentFixture<DashletEcardComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatCardModule,
                MatIconModule,
                FormsModule,
                ReactiveFormsModule,
                MatFormFieldModule,
                MatProgressSpinnerModule,
                MatFormFieldModule,
                MatTooltipModule,
                HttpClientTestingModule,
                MatDialogModule,
                DashletEcardComponent,
                DashletComponent,
                DashletHeaderComponent,
                DashletContentComponent,
                DashletFooterComponent,
                LoadingIndicatorComponent,
                DashletErrorComponent,
                DashletContentDataComponent,
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletEcardComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
