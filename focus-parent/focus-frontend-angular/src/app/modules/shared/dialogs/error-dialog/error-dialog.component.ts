import { ChangeDetectionStrategy, Component, Inject } from "@angular/core";
import {
    MAT_DIALOG_DATA,
    MatDialogModule,
    MatDialogRef,
} from "@angular/material/dialog";
import { MatIconModule } from "@angular/material/icon";
import { ButtonComponent } from "../../components/button/button.component";

@Component({
    templateUrl: "./error-dialog.component.html",
    styleUrls: ["./error-dialog.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [MatDialogModule, MatIconModule, ButtonComponent],
})
export class ErrorDialogComponent {
    constructor(
        public dialogRef: MatDialogRef<ErrorDialogComponent>,
        @Inject(MAT_DIALOG_DATA) public data: any,
    ) {}

    onClickOk(): void {
        this.dialogRef.close();
    }
}
