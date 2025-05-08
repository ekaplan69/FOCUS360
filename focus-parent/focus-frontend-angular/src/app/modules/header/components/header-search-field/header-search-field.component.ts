import {
    ChangeDetectionStrategy,
    ChangeDetectorRef,
    Component,
    EventEmitter,
    Input,
    OnChanges,
    OnInit,
    Output,
    SimpleChanges,
} from "@angular/core";
import {
    ReactiveFormsModule,
    UntypedFormControl,
    UntypedFormGroup,
    Validators,
} from "@angular/forms";
import { SearchFieldComponent } from "../../../shared/components/search-field/search-field.component";
import { KontaktForm } from "../../../shared/models/kundenkontakt/kontakt-form.model";
import { DialogService } from "../../../shared/services/frontend/dialog/dialog.service";
import { UiFunctionsService } from "../../../shared/services/frontend/util/ui-functions.service";
import { FachschluesselValidator } from "../../../shared/validators/fachschluessel.validator";

@Component({
    selector: "f360-header-search-field",
    templateUrl: "./header-search-field.component.html",
    styleUrls: ["./header-search-field.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [ReactiveFormsModule, SearchFieldComponent],
})
export class HeaderSearchFieldComponent implements OnChanges, OnInit {
    @Input() input: string;
    @Output() onSearchFieldEnter: EventEmitter<string> =
        new EventEmitter<string>();

    searchFieldForm: UntypedFormGroup;
    searchFieldValue: string = "";

    constructor(
        private dialogService: DialogService,
        private cd: ChangeDetectorRef,
    ) {
        this._buildFormGroup();
    }

    ngOnChanges({ input }: SimpleChanges) {
        if (input.currentValue !== input.previousValue) {
            this.searchFieldForm.controls["searchField"].setValue(
                input.currentValue,
            );
        }
    }

    ngOnInit() {
        UiFunctionsService.focusSearchField();
    }

    onEnter(searchFieldInput: string) {
        this.searchFieldValue = searchFieldInput;
        if (this.searchFieldForm.value.searchField != searchFieldInput) {
            this.searchFieldForm.patchValue({ searchField: searchFieldInput });
        }
        this.cd.detectChanges();

        if (KontaktForm.registeredSVNR != null) {
            this.dialogService.openUnfinishedKontaktDialog();
            return;
        }

        if (this.searchFieldForm.valid) {
            this.onSearchFieldEnter.emit(searchFieldInput);
            this.searchFieldValue = "";
            this.cd.detectChanges();
        } else {
            this.dialogService.openInvalidVsnrDialog(searchFieldInput);
        }
    }

    private _buildFormGroup() {
        this.searchFieldForm = new UntypedFormGroup({
            searchField: new UntypedFormControl(this.input, [
                Validators.required,
                FachschluesselValidator,
            ]),
        });
    }
}
