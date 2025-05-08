import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule } from "@angular/forms";
import { MatCardModule } from "@angular/material/card";
import { MatDialogModule } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatPaginatorModule } from "@angular/material/paginator";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";
import { MatTableModule } from "@angular/material/table";
import { MatTabsModule } from "@angular/material/tabs";
import { MatTooltipModule } from "@angular/material/tooltip";
import { LoadingIndicatorComponent } from "../../../../shared/components/loading-indicator/loading-indicator.component";
import { DashletContentDataComponent } from "../../dashlet-content-data/dashlet-content-data.component";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletFooterComponent } from "../../dashlet-footer/dashlet-footer.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

import { DashletVersicherungszeitenComponent } from "./dashlet-versicherungszeiten.component";
import { VersichertContentComponent } from "./versichert-content/versichert-content.component";

describe("DashletVersicherungszeitenComponent", () => {
    let component: DashletVersicherungszeitenComponent;
    let fixture: ComponentFixture<DashletVersicherungszeitenComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatCardModule,
                MatIconModule,
                FormsModule,
                MatFormFieldModule,
                MatTableModule,
                MatPaginatorModule,
                MatTabsModule,
                HttpClientTestingModule,
                MatTooltipModule,
                MatDialogModule,
                MatProgressSpinnerModule,
                DashletVersicherungszeitenComponent,
                DashletComponent,
                DashletHeaderComponent,
                DashletContentComponent,
                DashletFooterComponent,
                LoadingIndicatorComponent,
                DashletErrorComponent,
                VersichertContentComponent,
                DashletContentDataComponent,
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletVersicherungszeitenComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
