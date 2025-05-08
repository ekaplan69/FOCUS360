import { SelectOption } from "../../components/select/selectoption.interface";

export class Status implements SelectOption {
    static statusOptions: Status[] = [
        new Status(0, "Erfasst"),
        new Status(1, "Bearbeitet"),
        new Status(2, "Abgeschlossen"),
    ];

    public label: string;
    public value: Status;

    private constructor(
        public id: number,
        public description: string,
    ) {
        this.label = description;
        this.value = this;
    }

    static getById(id: number): Status {
        return this.statusOptions.find((value) => value.id == id);
    }

    static getDescription(id: number) {
        let foundStatus = this.statusOptions.find((s) => s.id === id);
        if (foundStatus != null) {
            return foundStatus.description;
        }
    }

    static getId(description: string): number {
        let status = this.statusOptions.find(
            (s) => s.description === description,
        );
        if (status == null) {
            return null;
        }

        return status.id;
    }

    static optionsAsListOfStrings(): string[] {
        return this.statusOptions.map((s) => s.description);
    }
}
