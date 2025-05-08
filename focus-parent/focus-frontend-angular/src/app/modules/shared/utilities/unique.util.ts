export function generateUniqueId(): string {
    return (Date.now() + Math.random()).toString().replace(".", "");
}
