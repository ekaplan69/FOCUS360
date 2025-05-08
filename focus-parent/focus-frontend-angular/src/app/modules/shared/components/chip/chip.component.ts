import {NgClass} from "@angular/common";
import {Component, EventEmitter, Input, Output, Pipe} from "@angular/core";
import {MatChipsModule} from "@angular/material/chips";
import {MatIconModule} from "@angular/material/icon";
import {DynamicPipe} from "../../pipes/dynamicPipe";

/**
 * Ein einzelner Chip braucht auch eine mat-chip-list, sonst geht das Styling nicht. Somit nur mit focus360-chip-list verwendbar!
 * Siehe https://github.com/angular/components/issues/9964
 */
export interface ChipState {
    id: string;
    label: string;
    selected: boolean;

    cancel();
}

@Component({
    selector: "f360-chip",
    templateUrl: "./chip.component.html",
    styleUrls: ["./chip.component.scss"],
    standalone: true,
    imports: [MatChipsModule, NgClass, MatIconModule, DynamicPipe],
})
export class ChipComponent {
    @Input() disabled: boolean;
    @Input() id: string;
    @Input() label: string;
    @Output() onChipClick: EventEmitter<ChipState> =
        new EventEmitter<ChipState>();
    @Output() onChipRemove: EventEmitter<ChipState> =
        new EventEmitter<ChipState>();
    @Input() pipe: Pipe;
    @Input() removable: boolean;
    @Input() selectable: boolean;
    @Input() selected: boolean;
    @Input() tooltip: string;

    constructor() {}

    onClick() {
        this.selected = !this.selected;
        const me = this;
        this.onChipClick.emit({
            id: this.id,
            label: this.label,
            selected: this.selected,
            cancel() {
                me.selected = !me.selected;
            },
        });
    }

    onRemove() {
        this.onChipRemove.emit({
            id: this.id,
            label: this.label,
            selected: this.selected,
            cancel() {
                /*nothing*/
            },
        });
    }
}
