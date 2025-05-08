import { TextFieldModule } from "@angular/cdk/text-field";
import { NgClass } from "@angular/common";
import {
    Component,
    EventEmitter,
    Injector,
    Input,
    OnInit,
    Output,
} from "@angular/core";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import {
    CustomValueAccessor,
    CustomValueAccessorProvider,
} from "../validation/customValueAccessor/customValueAccessor";
import { ValidationComponent } from "../validation/validation.component";

@Component({
    selector: "f360-textarea",
    templateUrl: "./textarea.component.html",
    styleUrls: ["./textarea.component.scss"],
    providers: [CustomValueAccessorProvider(TextareaComponent)],
    standalone: true,
    imports: [
        MatFormFieldModule,
        NgClass,
        MatInputModule,
        TextFieldModule,
        ValidationComponent,
    ],
})
export class TextareaComponent extends CustomValueAccessor implements OnInit {
    @Input() public customId: string;
    @Input() public maxRows: number = 25;
    @Input() public minRows: number = 10;
    @Output() onFocus: EventEmitter<string> = new EventEmitter<string>();
    @Output() onFocusOut: EventEmitter<string> = new EventEmitter<string>();
    @Output() onUserInput: EventEmitter<string> = new EventEmitter<string>();
    @Input() public text: string = "";

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
    }

    onUserChange(event) {
        this.onUserInput.emit(event.target.value);
    }
}
