import { Component, OnDestroy } from "@angular/core";
import { Observable } from "rxjs";
import { Kunde } from "../../../shared/models/kunde.model";
import { Person } from "../../../shared/models/Person.model";
import { SucheService } from "../../../shared/services/backend/suche/suche.service";
import { InfoHeaderDetailsComponent } from "../../components/info-header-details/info-header-details.component";

@Component({
    selector: "f360-info-header",
    templateUrl: "./info-header.container.html",
    standalone: true,
    imports: [InfoHeaderDetailsComponent],
})
export class InfoHeaderContainer implements OnDestroy {
    $kunde: Observable<Kunde>;
    $versicherter: Observable<Person>;

    constructor(private sucheService: SucheService) {
        this._selectVersicherter();
        this._selectKunde();
    }

    ngOnDestroy() {}

    private _selectKunde() {
        this.$kunde = this.sucheService.selectKunde();
    }

    private _selectVersicherter() {
        this.$versicherter = this.sucheService.selectVersicherter();
    }
}
