import { NgClass } from "@angular/common";
import {
    Component,
    EventEmitter,
    Injector,
    Input,
    OnInit,
    Output,
} from "@angular/core";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatInputModule } from "@angular/material/input";
import {
    CustomValueAccessor,
    CustomValueAccessorProvider,
} from "../validation/customValueAccessor/customValueAccessor";
import { ValidationComponent } from "../validation/validation.component";

@Component({
    selector: "f360-input",
    templateUrl: "./input.component.html",
    styleUrls: ["./input.component.scss"],
    providers: [CustomValueAccessorProvider(InputComponent)],
    standalone: true,
    imports: [
        MatFormFieldModule,
        NgClass,
        MatIconModule,
        MatInputModule,
        ReactiveFormsModule,
        FormsModule,
        ValidationComponent,
    ],
})
export class InputComponent extends CustomValueAccessor implements OnInit {
    @Input() initialValue;
    @Output() onFocus: EventEmitter<string> = new EventEmitter<string>();
    @Output() onFocusOut: EventEmitter<string> = new EventEmitter<string>();
    @Output() onUserInput: EventEmitter<string> = new EventEmitter<string>();
    @Input() prefixIcon;
    @Input() suffixIcon;

    constructor(injector: Injector) {
        super(injector);
    }

    focusIn(value: string) {
        this.onTouched();
        this.onFocus.emit(value);
    }

    focusOut(value: string) {
        this.onFocusOut.emit(value);
    }

    ngOnInit() {
        super.ngOnInit();

        if (this.initialValue != null) {
            this.value = this.initialValue;
        }
    }

    onUserChange(event) {
        this.onUserInput.emit(event.target.value);
    }
}
