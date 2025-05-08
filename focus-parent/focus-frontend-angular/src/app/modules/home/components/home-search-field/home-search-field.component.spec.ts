import { provideHttpClient } from "@angular/common/http";
import { importProvidersFrom } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatDialogModule } from "@angular/material/dialog";
import { HomeSearchFieldComponent } from "./home-search-field.component";

describe("HomeSearchFieldComponent", () => {
    let component: HomeSearchFieldComponent;
    let fixture: ComponentFixture<HomeSearchFieldComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                FormsModule,
                ReactiveFormsModule,
                HomeSearchFieldComponent,
            ],
            providers: [
                importProvidersFrom(MatDialogModule),
                provideHttpClient(),
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HomeSearchFieldComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
