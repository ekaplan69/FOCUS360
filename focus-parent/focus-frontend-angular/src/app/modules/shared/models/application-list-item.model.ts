export class ApplicationListItem {
    constructor(
        public label: string,
        public href: string,
        public icon?: string,
    ) {}

    static of(data): ApplicationListItem {
        if (data == null) {
            return null;
        }

        if (data.icon) {
            return new ApplicationListItem(data.label, data.href, data.icon);
        } else {
            return new ApplicationListItem(data.label, data.href);
        }
    }

    static ofList(data): ApplicationListItem[] {
        if (data == null) {
            return null;
        }

        if (data.length == 0) {
            return [];
        }

        let list = [];
        for (let x of data) {
            list.push(ApplicationListItem.of(x));
        }
        return list;
    }
}
