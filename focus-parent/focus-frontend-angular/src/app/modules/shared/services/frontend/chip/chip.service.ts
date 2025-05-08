import { Injectable } from "@angular/core";
import { ChipItem } from "../../../components/chip-list/chip-list.component";

@Injectable({
    providedIn: "root",
})
export class ChipService {
    chips: ChipItem[] = [];

    constructor() {}

    public activateChip(fs: string) {
        this.chips = this.chips.map((chipItem: ChipItem) => {
            return {
                ...chipItem,
                selected: fs ? chipItem.id === fs : false,
            };
        });
    }

    public addChip(fs: string, chipActivated?: boolean) {
        if (this.chips.length === 0) {
            this.chips.push(this._generateAlleSchliessenChip());
        }

        if (this.chips.length === 6) {
            this.chips.splice(4, 1);
        }

        this.chips = [this._generateChip(fs, chipActivated), ...this.chips];
    }

    public addOrActivateChip(fs: string) {
        const index = this.chips.findIndex(
            (chipItem: ChipItem) => chipItem.id === fs,
        );
        if (index === -1) {
            this.addChip(fs);
        }
        this.activateChip(fs);
    }

    public clearChips() {
        this.chips = [];
    }

    public removeChip(chipStateID: string) {
        this.chips = this.chips.filter(
            (chipItem: ChipItem) => chipItem.id !== chipStateID,
        );
        if (this.chips.length === 1) {
            this.clearChips();
        }
    }

    public unselectAll() {
        this.chips.forEach((c) => {
            c.selected = false;
        });
    }

    private _generateAlleSchliessenChip() {
        return {
            id: "alle_schliessen",
            label: "Alle Schließen",
            tooltip: "Alle Schließen",
            selected: false,
            removable: false,
            selectable: true,
        };
    }

    private _generateChip(fs: string, chipActivated?: boolean) {
        return {
            id: fs,
            label: fs,
            selected: chipActivated != null ? chipActivated : true,
            removable: true,
            selectable: true,
        };
    }
}
