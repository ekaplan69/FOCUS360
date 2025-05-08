import { Injectable, OnDestroy } from "@angular/core";
import { NavigationStart, Router } from "@angular/router";
import { Observable, ReplaySubject } from "rxjs";
import { filter, map, takeUntil } from "rxjs/operators";

@Injectable({
    providedIn: "root",
})
export class RouterService implements OnDestroy {
    private destroyed$: ReplaySubject<boolean> = new ReplaySubject(1);
    private fromRouteState: ReplaySubject<NavigationStart> =
        new ReplaySubject();
    private previousState: NavigationStart = null;
    private toRouteState: ReplaySubject<NavigationStart> = new ReplaySubject();

    constructor(private router: Router) {
        this.router.events
            .pipe(
                filter((e: any) => e instanceof NavigationStart),
                takeUntil(this.destroyed$),
            )
            .subscribe((e: NavigationStart) => {
                this.fromRouteState.next(this.previousState);
                this.toRouteState.next(e);
                this.previousState = e;
            });
    }

    ngOnDestroy() {
        this.destroyed$.next(true);
        this.destroyed$.complete();
    }

    public selectCurrentRouteState() {
        return this.toRouteState.asObservable();
    }

    public selectCurrentUrlWithOrigin(): Observable<string> {
        return this.toRouteState.pipe(
            map((toRouterState) => location.origin + toRouterState.url),
        );
    }

    public selectFromRouteState() {
        return this.fromRouteState.asObservable();
    }

    public selectToRouteState() {
        return this.toRouteState.asObservable();
    }
}
