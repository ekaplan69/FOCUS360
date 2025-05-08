import { provideHttpClient } from "@angular/common/http";
import { importProvidersFrom } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule } from "@angular/forms";
import { MatCardModule } from "@angular/material/card";
import { MatDialogModule } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";
import { DashletContentDataComponent } from "../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletFooterComponent } from "../../dashlet-footer/dashlet-footer.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

import { DashletLeistungComponent } from "./dashlet-leistung.component";

describe("DashletLeistungComponent", () => {
    let component: DashletLeistungComponent;
    let fixture: ComponentFixture<DashletLeistungComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatCardModule,
                MatIconModule,
                FormsModule,
                MatFormFieldModule,
                MatTooltipModule,
                DashletLeistungComponent,
                DashletComponent,
                DashletHeaderComponent,
                DashletContentComponent,
                DashletFooterComponent,
                DashletErrorComponent,
                DashletContentDataComponent,
            ],
            providers: [
                provideHttpClient(),
                importProvidersFrom(MatDialogModule),
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletLeistungComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
