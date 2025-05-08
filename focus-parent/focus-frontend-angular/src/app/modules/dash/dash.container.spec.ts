import { DatePipe } from "@angular/common";
import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ChangeDetectionStrategy, NO_ERRORS_SCHEMA } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatDialogModule } from "@angular/material/dialog";
import { RouterTestingModule } from "@angular/router/testing";
import { provideToastr } from "ngx-toastr";
import { DashScreenFooterComponent } from "./components/dash-screen-footer/dash-screen-footer.component";
import { DashletContentComponent } from "./components/dashlet-content/dashlet-content.component";
import { DashletFooterComponent } from "./components/dashlet-footer/dashlet-footer.component";
import { DashletHeaderComponent } from "./components/dashlet-header/dashlet-header.component";
import { DashletComponent } from "./components/dashlet/dashlet.component";
import { DashletKundenkontakteComponent } from "./components/dashlets/dashlet-kundenkontakte/dashlet-kundenkontakte.component";
import { DashletStammdatenComponent } from "./components/dashlets/dashlet-stammdaten/dashlet-stammdaten.component";
import { DashContainer } from "./dash.container";

describe("DashContainer", () => {
    let component: DashContainer;
    let fixture: ComponentFixture<DashContainer>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                HttpClientTestingModule,
                RouterTestingModule.withRoutes([]),
                MatDialogModule,
                DashContainer,
                DashletStammdatenComponent,
                DashletKundenkontakteComponent,
                DashletComponent,
                DashletHeaderComponent,
                DashletContentComponent,
                DashletFooterComponent,
                DashScreenFooterComponent,
            ],
            providers: [DatePipe, provideToastr()],
            schemas: [NO_ERRORS_SCHEMA],
        })
            .overrideComponent(DashContainer, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DashContainer);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
