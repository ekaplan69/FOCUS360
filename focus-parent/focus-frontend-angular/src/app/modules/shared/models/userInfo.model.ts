import { RollenConstant } from "../constants/rollen.constant";

export class UserInfo {
    constructor(
        public benutzername?: string,
        public vorname?: string,
        public nachname?: string,
        public bundesland?: number,
        public organisationseinheiten?: string[],
        public aufgabengebiete?: string[],
        public rollen?: string[],
        public offeneKontakte?: string[],
    ) {}

    static of(data: any): UserInfo {
        if (!data) {
            return null;
        }
        return new UserInfo(
            data.benutzername,
            data.vorname,
            data.nachname,
            data.bundesland,
            data.organisationseinheiten.sort(),
            data.aufgabengebiete.sort(),
            data.rollen,
            data.offeneKontakte,
        );
    }

    containsRolle(rolle: string): boolean {
        return (
            this.rollen.includes(rolle) ||
            this.rollen.includes(RollenConstant.ROLLE_ADMIN)
        );
    }

    getFirstName() {
        return this.vorname;
    }

    getFullName() {
        return this.vorname + " " + this.nachname;
    }

    getLastName() {
        return this.nachname;
    }

    showAufgabengebiet(): boolean {
        return (
            this.rollen.includes(RollenConstant.ROLLE_KONT_VERW) ||
            this.rollen.includes(RollenConstant.ROLLE_ADMIN)
        );
    }

    showProceedToDash(): boolean {
        return (
            this.rollen.includes(RollenConstant.ROLLE_KONT_LESEN) ||
            this.rollen.includes(RollenConstant.ROLLE_KONT_VERW) ||
            this.rollen.includes(RollenConstant.ROLLE_DSGVO_LESEN) ||
            this.rollen.includes(RollenConstant.ROLLE_DSGVO_VERW) ||
            this.rollen.includes(RollenConstant.ROLLE_ADMIN)
        );
    }

    showSubaufgabengebietButtons(): boolean {
        return (
            this.rollen.includes(RollenConstant.ROLLE_KONT_VERW) ||
            this.rollen.includes(RollenConstant.ROLLE_ADMIN)
        );
    }
}
