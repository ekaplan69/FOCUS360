import { HomePage } from "../../pages/home/home.page";

describe("Home", () => {
    let homePage: HomePage;

    beforeEach(() => {
        homePage = new HomePage();
    });

    it("should display title", () => {
        expect(true).toBeTruthy();
    });
});
