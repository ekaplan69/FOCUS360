import { provideHttpClient } from "@angular/common/http";
import { ChangeDetectionStrategy, importProvidersFrom } from "@angular/core";
import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatButtonModule } from "@angular/material/button";
import { MatDialogModule } from "@angular/material/dialog";
import { MatIconModule } from "@angular/material/icon";
import { MatMenuModule } from "@angular/material/menu";
import { MatTooltipModule } from "@angular/material/tooltip";
import { provideAnimations } from "@angular/platform-browser/animations";
import { provideToastr } from "ngx-toastr";
import { AlertService } from "../../../shared/services/frontend/alert/alert.service";
import { ApplicationListComponent } from "../application-list/application-list.component";
import { HeaderUserMenuComponent } from "./header-user-menu.component";

describe("HeaderUserMenuComponent", () => {
    let component: HeaderUserMenuComponent;
    let fixture: ComponentFixture<HeaderUserMenuComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatIconModule,
                MatMenuModule,
                MatButtonModule,
                MatTooltipModule,
                HeaderUserMenuComponent,
                ApplicationListComponent,
            ],
            providers: [
                provideToastr(),
                provideHttpClient(),
                provideAnimations(),
                importProvidersFrom(MatDialogModule),
                AlertService,
            ],
        })
            .overrideComponent(HeaderUserMenuComponent, {
                set: { changeDetection: ChangeDetectionStrategy.Default },
            })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HeaderUserMenuComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
