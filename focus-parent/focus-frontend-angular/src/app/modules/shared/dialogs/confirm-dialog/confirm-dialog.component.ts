import { Component, Inject, OnInit } from "@angular/core";
import { MAT_DIALOG_DATA, MatDialogRef } from "@angular/material/dialog";
import { ButtonComponent } from "../../components/button/button.component";

@Component({
    selector: "confirm-dialog",
    templateUrl: "./confirm-dialog.component.html",
    styleUrls: ["./confirm-dialog.component.scss"],
    standalone: true,
    imports: [ButtonComponent],
})
export class ConfirmDialogComponent implements OnInit {
    constructor(
        private dialogRef: MatDialogRef<ConfirmDialogComponent>,
        @Inject(MAT_DIALOG_DATA) public data: any,
    ) {}

    cancelClicked() {
        this.dialogRef.close(false);
    }

    confirmClicked() {
        this.dialogRef.close(true);
    }

    ngOnInit() {}
}
