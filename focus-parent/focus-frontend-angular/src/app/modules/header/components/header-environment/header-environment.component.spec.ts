import { provideHttpClient } from "@angular/common/http";
import { ChangeDetectionStrategy, importProvidersFrom } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatDialogModule } from "@angular/material/dialog";
import { MatIconModule } from "@angular/material/icon";
import { MatMenuModule } from "@angular/material/menu";
import { MatTooltipModule } from "@angular/material/tooltip";
import { provideAnimations } from "@angular/platform-browser/animations";
import { provideToastr } from "ngx-toastr";
import { ApplicationListComponent } from "../application-list/application-list.component";
import { HeaderEnvironmentComponent } from "./header-environment.component";

describe("HeaderUserMenuComponent", () => {
    let component: HeaderEnvironmentComponent;
    let fixture: ComponentFixture<HeaderEnvironmentComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatIconModule,
                MatMenuModule,
                MatTooltipModule,
                HeaderEnvironmentComponent,
                ApplicationListComponent,
            ],
            providers: [
                provideToastr(),
                provideHttpClient(),
                provideAnimations(),
                importProvidersFrom(MatDialogModule),
            ],
        })
            .overrideComponent(HeaderEnvironmentComponent, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HeaderEnvironmentComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
