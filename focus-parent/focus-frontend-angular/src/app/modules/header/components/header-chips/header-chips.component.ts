import {
    ChangeDetectionStrategy,
    Component,
    EventEmitter,
    Output,
} from "@angular/core";
import { ChipListComponent } from "../../../shared/components/chip-list/chip-list.component";
import { ChipState } from "../../../shared/components/chip/chip.component";
import { ChipService } from "../../../shared/services/frontend/chip/chip.service";

@Component({
    selector: "f360-header-chips",
    templateUrl: "./header-chips.component.html",
    styleUrls: ["./header-chips.component.scss"],
    changeDetection: ChangeDetectionStrategy.Default,
    standalone: true,
    imports: [ChipListComponent],
})
export class HeaderChipsComponent {
    @Output() onChipClick: EventEmitter<ChipState> =
        new EventEmitter<ChipState>();
    @Output() onChipRemove: EventEmitter<ChipState> =
        new EventEmitter<ChipState>();
    protected readonly console = console;

    constructor(public chipService: ChipService) {}

    onClick(chipState: ChipState) {
        this.onChipClick.emit(chipState);
    }

    onRemove(chipState: ChipState) {
        this.onChipRemove.emit(chipState);
    }
}
