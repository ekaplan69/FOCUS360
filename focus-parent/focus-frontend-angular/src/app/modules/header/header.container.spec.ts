import { DatePipe } from "@angular/common";
import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ChangeDetectionStrategy, NO_ERRORS_SCHEMA } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatDialogModule } from "@angular/material/dialog";
import { RouterTestingModule } from "@angular/router/testing";
import { ToastrModule } from "ngx-toastr";
import { VsnrPipe } from "../shared/pipes/vsnr.pipe";
import { HeaderChipsComponent } from "./components/header-chips/header-chips.component";
import { HeaderLogoComponent } from "./components/header-logo/header-logo.component";
import { HeaderSearchFieldComponent } from "./components/header-search-field/header-search-field.component";
import { HeaderUserMenuComponent } from "./components/header-user-menu/header-user-menu.component";
import { InfoHeaderDetailsComponent } from "./components/info-header-details/info-header-details.component";
import { InfoHeaderContainer } from "./containers/info-header/info-header.container";
import { HeaderContainer } from "./header.container";

describe("HeaderContainer", () => {
    let component: HeaderContainer;
    let fixture: ComponentFixture<HeaderContainer>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                ToastrModule.forRoot(),
                HttpClientTestingModule,
                RouterTestingModule.withRoutes([]),
                MatDialogModule,
                HeaderContainer,
                InfoHeaderContainer,
                HeaderLogoComponent,
                HeaderUserMenuComponent,
                HeaderSearchFieldComponent,
                HeaderChipsComponent,
                InfoHeaderDetailsComponent,
                VsnrPipe,
            ],
            providers: [DatePipe],
            schemas: [NO_ERRORS_SCHEMA],
        })
            .overrideComponent(HeaderContainer, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HeaderContainer);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
