import {
    ChangeDetectorRef,
    Component,
    Input,
    OnDestroy,
    OnInit,
} from "@angular/core";
import { interval, Subscription } from "rxjs";

@Component({
    selector: "f360-kundenkontakt-form-timer",
    templateUrl: "./kundenkontakt-form-timer.component.html",
    styleUrls: ["./kundenkontakt-form-timer.component.scss"],
    standalone: true,
})
export class KundenkontaktFormTimerComponent implements OnInit, OnDestroy {
    @Input() beendet: boolean;
    hoursToDday: number;
    minutesToDday: number;
    secondsToDday: number;
    styleClass: string;
    timeDifference: number;
    @Input() private dateNowOrEndeTS: Date;
    @Input() private dateStartTS: Date;
    private milliSecondsInASecond = 1000;
    private minutesInAnHour = 60;
    private secondsInAMinute = 60;
    private subscription: Subscription;

    constructor(private cd: ChangeDetectorRef) {}

    public getTimeDifference() {
        this.timeDifference =
            this.dateNowOrEndeTS.getTime() - this.dateStartTS.getTime();
        this.allocateTimeUnits(this.timeDifference);
    }

    ngOnDestroy(): void {
        if (!this.beendet) {
            this.subscription.unsubscribe();
        }
    }

    ngOnInit(): void {
        if (this.beendet) {
            this.getTimeDifference();
            this.cd.detectChanges();
            this.subscription = interval(300).subscribe((x) => {
                this.getStyleClass();
                this.cd.detectChanges();
            });
        } else {
            this.subscription = interval(1000).subscribe((x) => {
                this.dateNowOrEndeTS = new Date();
                this.getTimeDifference();
                this.getStyleClass();
                this.cd.detectChanges();
            });
        }
    }

    private allocateTimeUnits(timeDifference) {
        this.secondsToDday = Math.floor(
            (timeDifference / this.milliSecondsInASecond) %
                this.secondsInAMinute,
        );
        this.minutesToDday = Math.floor(
            (timeDifference /
                (this.milliSecondsInASecond * this.minutesInAnHour)) %
                this.secondsInAMinute,
        );
        this.hoursToDday = Math.floor(
            timeDifference /
                (this.milliSecondsInASecond *
                    this.minutesInAnHour *
                    this.secondsInAMinute),
        );
    }

    private getStyleClass(): void {
        if (!this.beendet) {
            this.styleClass = "kontakt-timer";
        } else {
            this.styleClass = "";
        }
    }
}
