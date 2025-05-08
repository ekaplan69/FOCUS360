import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule } from "@angular/forms";
import { MatCardModule } from "@angular/material/card";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatPaginatorModule } from "@angular/material/paginator";
import { MatTableModule } from "@angular/material/table";
import { MatTabsModule } from "@angular/material/tabs";
import { MatTooltipModule } from "@angular/material/tooltip";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { DashletContentComponent } from "../../dashlet-content/dashlet-content.component";
import { DashletErrorComponent } from "../../dashlet-error/dashlet-error.component";
import { DashletFooterComponent } from "../../dashlet-footer/dashlet-footer.component";
import { DashletHeaderComponent } from "../../dashlet-header/dashlet-header.component";
import { DashletComponent } from "../../dashlet/dashlet.component";

import { DashletAngehoerigeComponent } from "./dashlet-angehoerige.component";

describe("DashletAngehoerigeComponent", () => {
    let component: DashletAngehoerigeComponent;
    let fixture: ComponentFixture<DashletAngehoerigeComponent>;

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
                BrowserAnimationsModule,
                MatTooltipModule,
                DashletAngehoerigeComponent,
                DashletComponent,
                DashletHeaderComponent,
                DashletContentComponent,
                DashletFooterComponent,
                DashletErrorComponent,
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashletAngehoerigeComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
