import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { TextareaComponent } from "../../../../../shared/components/textarea/textarea.component";
import { NotizForm } from "../../../../../shared/models/notizForm.model";
import { SaveNotizTransmitter } from "../../../../../shared/services/frontend/event-transmitter/save-notiz-transmitter.service";

@Component({
    selector: "f360-notiz-form",
    templateUrl: "./notiz-form.component.html",
    styleUrls: ["./notiz-form.component.scss"],
    standalone: true,
    imports: [TextareaComponent, MatButtonModule],
})
export class NotizFormComponent implements OnInit {
    @Output() closeFormEvent: EventEmitter<string> = new EventEmitter();
    @Input() notizForm: NotizForm;

    constructor(private notizFormTransmitter: SaveNotizTransmitter) {}

    appendText(stringToAppend: string) {
        if (this.notizForm.notizText.length > 0) {
            this.notizForm.notizText += "\n";
        }

        this.notizForm.notizText += stringToAppend;
    }

    closeForm() {
        this.closeFormEvent.emit();
    }

    ngOnInit() {}

    saveNotiz() {
        this.notizFormTransmitter.transmitter.emit();
    }

    updateText(newText: string) {
        this.notizForm.notizText = newText;
    }
}
