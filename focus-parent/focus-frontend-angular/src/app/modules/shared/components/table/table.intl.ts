// @ts-ignore
// @ts-ignore
import {Injectable} from "@angular/core";
import {MatPaginatorIntl} from "@angular/material/paginator";

/**
 * To modify the labels and text displayed, create a new instance of MatPaginatorIntl and
 * include it in a custom provider
 */

@Injectable()
// @ts-ignore
export class TablePaginatorIntl extends MatPaginatorIntl {
    /** A label for the button that moves to the first page. */
    firstPageLabel = "Erste Seite";

    /** A label for the range of items within the current page and the length of the whole list. */
    getRangeLabel = (page: number, pageSize: number, length: number) => {
        if (length === 0 || pageSize === 0) {
            return `0 / 0`;
        }

        return `Seite ${page + 1}/${Math.ceil(length / pageSize)} - insg. ${length}`;
    };

    /** A label for the page size selector. */
    itemsPerPageLabel = "";
    /** A label for the button that moves to the last page. */
    lastPageLabel = "Letzte Seite";
    /** A label for the button that increments the current page. */
    nextPageLabel = "Nächste Seite";
    /** A label for the button that decrements the current page. */
    previousPageLabel = "Vorherige Seite";
}
