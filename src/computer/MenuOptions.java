package computer;

public enum MenuOptions {
    ADD_FILE(1, "file"),
    REMOVE_FILE(2, "file"),
    FIND_FILE(3, "file"),
    ADD_USB_DEVICE(1, "usb"),
    REMOVE_USB_DEVICE(2, "usb");

    private final int choose;
    private final String menuIndicator;

    MenuOptions(int choose, String menuIndicator) {
        this.choose = choose;
        this.menuIndicator = menuIndicator;
    }
}
