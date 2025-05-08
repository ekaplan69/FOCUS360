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
import { MatRadioChange, MatRadioModule } from "@angular/material/radio";
import {
    CustomValueAccessor,
    CustomValueAccessorProvider,
} from "../validation/customValueAccessor/customValueAccessor";
import { ValidationComponent } from "../validation/validation.component";

export interface RadioOption {
    label: string;
    value: any;
}

@Component({
    selector: "f360-radio",
    templateUrl: "./radio.component.html",
    styleUrls: ["./radio.component.scss"],
    providers: [CustomValueAccessorProvider(RadioComponent)],
    standalone: true,
    imports: [
        NgClass,
        MatRadioModule,
        ReactiveFormsModule,
        FormsModule,
        ValidationComponent,
    ],
})
export class RadioComponent extends CustomValueAccessor implements OnInit {
    @Input() items: RadioOption[];
    @Output() onUserChange: EventEmitter<MatRadioChange> =
        new EventEmitter<MatRadioChange>();
    @Input() vertical = true;

    constructor(injector: Injector) {
        super(injector);
    }

    ngOnInit() {
        super.ngOnInit();
        this.value = this.items[0].value;
    }

    onRadioChange(event: MatRadioChange) {
        this.onUserChange.emit(event.value);
    }
}
