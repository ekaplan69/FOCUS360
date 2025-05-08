import { ComponentFixture, TestBed, waitForAsync } from "@angular/core/testing";
import { MatButtonModule } from "@angular/material/button";
import {
    MAT_DIALOG_DATA,
    MatDialogModule,
    MatDialogRef,
} from "@angular/material/dialog";
import { MatIconModule } from "@angular/material/icon";
import { ButtonComponent } from "../../components/button/button.component";
import { ErrorDialogComponent } from "./error-dialog.component";

describe("ErrorDialogComponent", () => {
    let component: ErrorDialogComponent;
    let fixture: ComponentFixture<ErrorDialogComponent>;

    beforeEach(waitForAsync(() => {
        TestBed.configureTestingModule({
            imports: [
                MatDialogModule,
                MatIconModule,
                MatButtonModule,
                ErrorDialogComponent,
                ButtonComponent,
            ],
            providers: [
                { provide: MatDialogRef, useValue: {} },
                { provide: MAT_DIALOG_DATA, useValue: [] },
            ],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ErrorDialogComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it("should create", () => {
        expect(component).toBeTruthy();
    });
});
