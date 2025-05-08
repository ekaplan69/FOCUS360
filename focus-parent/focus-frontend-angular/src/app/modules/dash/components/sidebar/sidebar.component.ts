import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";
import { RollenConstant } from "../../../shared/constants/rollen.constant";
import { Forms } from "../../../shared/models/forms.model";
import { UserService } from "../../../shared/services/backend/user/user.service";
import { FormCardComponent } from "./form-card/form-card.component";

@Component({
    selector: "f360-sidebar",
    templateUrl: "./sidebar.component.html",
    styleUrls: ["./sidebar.component.scss"],
    standalone: true,
    imports: [FormCardComponent],
})
export class SidebarComponent implements OnInit {
    @Input() public formTabs: Forms;
    forms = Forms.TYPES;
    //constants
    rollen = RollenConstant;
    @Output() toggleEditorOpenEmitter = new EventEmitter();

    constructor(public userService: UserService) {}

    ngOnInit() {}

    private emitToggleBeschwerde() {
        this.emitToggleEditorOpen(Forms.TYPES.BESCHWERDE);
    }

    private emitToggleEditorOpen(formTitle: string) {
        this.toggleEditorOpenEmitter.emit(formTitle);
    }

    private emitToggleNotiz() {
        this.emitToggleEditorOpen(Forms.TYPES.NOTIZ);
    }
}
