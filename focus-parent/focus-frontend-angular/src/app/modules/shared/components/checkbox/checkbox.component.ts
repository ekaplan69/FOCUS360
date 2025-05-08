import { Component, Injector, Input, OnInit } from "@angular/core";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatCheckboxModule } from "@angular/material/checkbox";
import {
    CustomValueAccessor,
    CustomValueAccessorProvider,
} from "../validation/customValueAccessor/customValueAccessor";

@Component({
    selector: "f360-checkbox",
    templateUrl: "./checkbox.component.html",
    styleUrls: ["./checkbox.component.scss"],
    providers: [CustomValueAccessorProvider(CheckboxComponent)],
    standalone: true,
    imports: [MatCheckboxModule, ReactiveFormsModule, FormsModule],
})
export class CheckboxComponent extends CustomValueAccessor implements OnInit {
    @Input() displayType: string;
    @Input() labelPosition: string;

    constructor(injector: Injector) {
        super(injector);
    }

    ngOnInit() {
        super.ngOnInit();
    }
}
