import { APP_BASE_HREF } from "@angular/common";
import {
    HTTP_INTERCEPTORS,
    HttpClientJsonpModule,
    provideHttpClient,
    withInterceptorsFromDi,
} from "@angular/common/http";
import { enableProdMode, importProvidersFrom } from "@angular/core";
import { MatDialogModule } from "@angular/material/dialog";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";
import { bootstrapApplication, BrowserModule } from "@angular/platform-browser";
import { provideAnimations } from "@angular/platform-browser/animations";
import { provideRouter, Routes } from "@angular/router";
import { provideToastr } from "ngx-toastr";
import { AppComponent } from "./app/app.component";
import { DashContainer } from "./app/modules/dash/dash.container";
import { ErrorContainer } from "./app/modules/error/error.container";
import { HomeContainer } from "./app/modules/home/home.container";
import { HttpHandlerInterceptor } from "./app/modules/shared/interceptors/httpHandler.interceptor";

import { environment } from "./environments/environment";

function getBaseHrefUrl() {
    if (environment.production) {
        return "/focus/";
    }
    return ".";
}

const routes: Routes = [
    {
        path: "",
        pathMatch: "full",
        redirectTo: "home",
    },
    {
        path: "home",
        component: HomeContainer,
    },
    {
        path: "dash",
        component: DashContainer,
    },
    {
        path: "error",
        component: ErrorContainer,
    },
    {
        path: "**",
        redirectTo: "error",
    },
];

if (environment.production) {
    enableProdMode();
}

bootstrapApplication(AppComponent, {
    providers: [
        importProvidersFrom(
            BrowserModule,
            MatProgressSpinnerModule,
            HttpClientJsonpModule,
        ),
        {
            provide: APP_BASE_HREF,
            useValue: getBaseHrefUrl(),
        },
        {
            provide: HTTP_INTERCEPTORS,
            useClass: HttpHandlerInterceptor,
            multi: true,
        },
        provideAnimations(),
        provideHttpClient(withInterceptorsFromDi()),
        provideRouter(routes),
        provideToastr(),
        importProvidersFrom(MatDialogModule),
    ],
}).catch((err) => console.error(err));
