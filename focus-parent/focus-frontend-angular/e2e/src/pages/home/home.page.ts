import { browser, by, element } from "protractor";

export class HomePage {
    title = element(by.css(".title"));

    navigateTo() {
        return browser.get("/");
    }
}
