import {
    AfterContentInit,
    Component,
    ElementRef,
    EventEmitter,
    Injector,
    Input,
    OnInit,
    Output,
    ViewChild,
} from "@angular/core";
import { MatDialog } from "@angular/material/dialog";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatTooltipModule } from "@angular/material/tooltip";
import { ClkToken } from "../../models/clkToken.model";
import { PartnerId } from "../../models/partnerId.model";
import { SucheService } from "../../services/backend/suche/suche.service";
import { UserService } from "../../services/backend/user/user.service";
import { ZpvClientCoopNeuService } from "../../services/frontend/zpv/zpv-client-coop-neu.service";
import { ClkOptionsComponent } from "../clk-options/clk-options.component";

@Component({
    selector: "f360-search-field",
    templateUrl: "./search-field.component.html",
    styleUrls: ["./search-field.component.scss"],
    standalone: true,
    imports: [MatTooltipModule, MatIconModule, MatFormFieldModule],
})
export class SearchFieldComponent implements OnInit, AfterContentInit {
    public _clkToken: ClkToken;
    public _partnerId: PartnerId[];
    @Input() autoFocus: boolean;
    @ViewChild("input", { static: true }) inputElementRef: ElementRef;
    @Output() onEnter: EventEmitter<string> = new EventEmitter<string>();
    @Output() onFocus: EventEmitter<string> = new EventEmitter<string>();
    @Output() onFocusOut: EventEmitter<string> = new EventEmitter<string>();
    @Output() onUserInput: EventEmitter<string> = new EventEmitter<string>();
    @Input() value: string;

    constructor(
        injector: Injector,
        private dialogService: MatDialog,
        private clkService: ZpvClientCoopNeuService,
        private sucheService: SucheService,
        private userService: UserService,
    ) {}

    chooseFSArt() {
        let dialogRef = this.dialogService.open(ClkOptionsComponent, {
            height: "400px",
            width: "600px",
        });

        dialogRef.afterClosed().subscribe((result) => {
            if (result != null) {
                this.value = result;
                this.onEnter.emit(result);
            }
        });
    }

    clickMore() {
        this.clkService.clkSucheInitialisieren().subscribe((clkToken) => {
            if (clkToken) {
                this._clkToken = clkToken;
                const win = this.openNewWindow(
                    this.clkService.cachedUrl + clkToken.clkToken,
                );

                const timer = setInterval(checkClk, 250, clkToken.clkToken);
                const $this = this;

                function checkClk(): void {
                    if (win.closed) {
                        clearInterval(timer);
                        $this.performAfterSearch(clkToken.clkToken);
                        return;
                    }
                    try {
                        if (win && win.location.href.includes("zpvclk=")) {
                            win.close();
                            $this.performAfterSearch(clkToken.clkToken);
                        }
                    } catch (e) {}
                }
            }
        });
    }

    focusIn(value: string) {
        this.onFocus.emit(value);
    }

    focusOut(value: string) {
        this.onFocusOut.emit(value);
    }

    ngAfterContentInit(): void {
        if (this.autoFocus) {
            this.inputElementRef.nativeElement.focus();
        }
    }

    ngOnInit() {
        if (this.userService.selectedOrganisationseinheit) {
            this.clkService.loadUrl();
        }
    }

    onKeyDownEnter() {
        let svnr = this.inputElementRef.nativeElement.value.split(" ").join("");
        this.onEnter.emit(svnr);
    }

    onUserChange(event) {
        this.onUserInput.emit(event.target.value);
    }

    openNewWindow(url: string): Window {
        const padding = 50;
        const width = screen.width - padding * 2;
        const height = screen.height - padding * 2;
        const wleft = padding;
        const wtop = padding;

        const win = window.open(
            url,
            "_blank",
            "'width=" +
                width +
                ",height=" +
                height +
                ",left=" +
                wleft +
                ",top=" +
                wtop +
                ",location=no,menubar=no,status=no,toolbar=no,scrollbars=yes,resizable=yes,dependent=yes'",
        );
        win.resizeTo(width, height);
        win.moveTo(wleft, wtop);
        win.focus();

        return win;
    }

    performAfterSearch(clkToken: string) {
        this.clkService.clkSuchergebnisAbfragen(clkToken).subscribe((data) => {
            this._partnerId = data;
            if (!this._partnerId) {
                return;
            }
            return this.sucheService
                .searchByPartnerId(this._partnerId[0].partnerId)
                .subscribe((data) => {
                    if (data.length === 1) {
                        this.onEnter.emit(data[0].fachschluessel);
                    } else {
                        this.clkService._clkOptions.next(data);
                        this.chooseFSArt();
                    }
                });
        });
    }
}
