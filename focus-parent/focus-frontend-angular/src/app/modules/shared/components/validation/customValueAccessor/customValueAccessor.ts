import { Directive, forwardRef, Injector, Input, OnInit } from "@angular/core";
import {
    AbstractControl,
    ControlValueAccessor,
    FormGroupDirective,
    NG_VALUE_ACCESSOR,
    NgControl,
    NgForm,
} from "@angular/forms";

const NOT_FOUND = null;

export interface ControlError {
    key: string;
    value: any;
}

export function CustomValueAccessorProvider(type: any) {
    return [
        {
            provide: NG_VALUE_ACCESSOR,
            useExisting: forwardRef(() => type),
            multi: true,
        },
    ];
}

@Directive()
export class CustomValueAccessor implements OnInit, ControlValueAccessor {
    @Input() disabled: boolean;
    @Input() name: string;
    ngControl: NgControl = NOT_FOUND;
    @Input() required: boolean;
    @Input() tooltip: string;
    @Input() type: string;
    private readonly _parentForm: NgForm;
    private readonly _parentFormGroup: FormGroupDirective;

    constructor(private injector: Injector) {
        this._parentForm = this.injector.get(NgForm, NOT_FOUND);
        this._parentFormGroup = this.injector.get(
            FormGroupDirective,
            NOT_FOUND,
        );
    }

    private _label: string;

    get label() {
        return this._label
            ? this._label +
                  (this.hasRequiredValidator(this.control) ? " *" : "")
            : "";
    }

    @Input() set label(label) {
        this._label = label;
    }

    private _value: any = null;

    get value(): any {
        return this._value;
    }

    set value(value: any) {
        if (value !== this._value) {
            this._value = value;
            this.onChange(value);
        }
    }

    get control(): AbstractControl {
        return this.ngControl && this.ngControl.control;
    }

    get errors(): Array<ControlError> {
        if (this.ngControl && this.ngControl.errors) {
            return Object.keys(this.ngControl.errors).map((key) => ({
                key,
                value: this.ngControl.errors[key],
            }));
        }

        return [];
    }

    // Alle Komponenten, die CustomValueAccessor sind, dürfen kein ChangeDetection.OnPush haben
    // da sonst hasError nicht mehr beim Form-Submitted getriggert wird und in Folge Validatoren beim Submitten

    // nicht anspringen
    get hasError(): boolean {
        const isInvalid = this.control && this.control.invalid;
        const isTouched = this.control && this.control.touched;
        const isDirty = this.control && this.control.dirty;
        const isSubmitted =
            (this._parentFormGroup !== NOT_FOUND &&
                this._parentFormGroup.submitted) ||
            (this._parentForm !== NOT_FOUND && this._parentForm.submitted);

        return !!(isInvalid && ((isTouched && isDirty) || isSubmitted));
    }

    hasRequiredValidator(control: AbstractControl): boolean {
        if (control && control.validator) {
            const validator = control.validator({} as AbstractControl);
            if (validator && validator.required) {
                return true;
            }
        }
        return false;
    }

    ngOnInit() {
        this.required = this.required || null;
        this.disabled = this.disabled || null;
        this.ngControl = this.injector.get(NgControl, this.ngControl);
    }

    onChange = (_) => {};
    onTouched = () => {};

    registerOnChange(fn: (_: any) => void): void {
        this.onChange = fn;
    }

    registerOnTouched(fn: () => void): void {
        this.onTouched = fn;
    }

    writeValue(value: any) {
        this._value = value;
    }
}
