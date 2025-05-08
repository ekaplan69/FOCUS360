import {
    ChangeDetectionStrategy,
    Component,
    EventEmitter,
    Input,
    Output,
    Pipe,
} from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MatChipsModule } from "@angular/material/chips";
import { MatIconModule } from "@angular/material/icon";
import { MatMenuModule } from "@angular/material/menu";
import { MatTooltipModule } from "@angular/material/tooltip";
import { SucheService } from "../../services/backend/suche/suche.service";
import { ChipComponent, ChipState } from "../chip/chip.component";

export interface ChipItem {
    disabled?: boolean;
    id: string;
    label: string;
    pipe?: Pipe;
    removable?: boolean;
    selectable?: boolean;
    selected?: boolean;
    tooltip?: string;
}

@Component({
    selector: "f360-chip-list",
    templateUrl: "./chip-list.component.html",
    styleUrls: ["./chip-list.component.scss"],
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [
        MatButtonModule,
        MatMenuModule,
        MatIconModule,
        MatChipsModule,
        ChipComponent,
        MatTooltipModule,
    ],
})
export class ChipListComponent {
    @Input() items: ChipItem[];
    @Output() onChipClick: EventEmitter<ChipState> =
        new EventEmitter<ChipState>();
    @Output() onChipRemove: EventEmitter<ChipState> =
        new EventEmitter<ChipState>();

    constructor(private sucheService: SucheService) {}

    onClick(chipState: ChipState) {
        this.onChipClick.emit(chipState);
    }

    onRemove(chipState: ChipState) {
        this.onChipRemove.emit(chipState);
    }
}
