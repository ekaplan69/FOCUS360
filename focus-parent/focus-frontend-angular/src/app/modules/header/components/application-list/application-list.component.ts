import { Component, Input, OnInit } from "@angular/core";
import { MatIconModule } from "@angular/material/icon";
import { ApplicationListItem } from "../../../shared/models/application-list-item.model";

@Component({
    selector: "f360-application-list",
    templateUrl: "./application-list.component.html",
    styleUrls: ["./application-list.component.scss"],
    standalone: true,
    imports: [MatIconModule],
})
export class ApplicationListComponent implements OnInit {
    @Input() applikationsListe: ApplicationListItem[];
    @Input() benutzerAktionenListe: ApplicationListItem[];

    constructor() {}

    ngOnInit() {}
}
