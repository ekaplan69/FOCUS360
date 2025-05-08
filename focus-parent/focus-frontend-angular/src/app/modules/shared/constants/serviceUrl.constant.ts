// TODO: "Basis"-Restschnittstellen deklarieren, um es für alle Services verwenden zu können
export const API_URL = getApiUrl() + "/focus/api/rest";
export const API_RESOURCES_URL = API_URL + "/resources";

function getApiUrl() {
    // Somit ist es möglich, lokal mittels ng serve und mittels ePortal Server mit dem Backend zu kommunizieren
    // welches auf localhost:8080 liegt
    if (location.hostname === "localhost") {
        return "http://localhost:4200";
    }

    // Alle anderen Fälle (z.B. Test-Server, Trägertest, etc.) wird location.origin genommen
    return location.origin;
}
