import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ChangeDetectionStrategy, NO_ERRORS_SCHEMA } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatDialogModule } from "@angular/material/dialog";
import { BrowserModule } from "@angular/platform-browser";
import { RouterTestingModule } from "@angular/router/testing";
import { HomeFooterComponent } from "./components/home-footer/home-footer.component";
import { HomeLogoComponent } from "./components/home-logo/home-logo.component";
import { HomeSearchFieldComponent } from "./components/home-search-field/home-search-field.component";
import { HomeContainer } from "./home.container";

describe("HomeContainer", () => {
    let component: HomeContainer;
    let fixture: ComponentFixture<HomeContainer>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                RouterTestingModule,
                MatDialogModule,
                HttpClientTestingModule,
                FormsModule,
                ReactiveFormsModule,
                BrowserModule,
                HomeContainer,
                HomeLogoComponent,
                HomeSearchFieldComponent,
                HomeFooterComponent,
            ],
            schemas: [NO_ERRORS_SCHEMA],
        })
            .overrideComponent(HomeContainer, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HomeContainer);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
