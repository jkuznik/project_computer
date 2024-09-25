package computer;

public enum MenuOption {
    USB_DEVICES_MENU("1","main"),
    FILES_MENU("2","main"),
    HARDWARE_MENU("3","main"),

    ADD_USB_DEVICE("1" , "usb"),
    REMOVE_USB_DEVICE("2" , "usb"),
    LIST_USB_DEVICES("3","usb"),

    ADD_FILE("1" , "file"),
    REMOVE_FILE("2" , "file"),
    FIND_FILE("3" , "file"),
    LIST_ALL_FILES("4","file"),

    ADD_HARDWARE("1","hardware"),
    REMOVE_HARDWARE("2","hardware"),
    LIST_HARDWARE("3","hardware"),
    SET_HIGH_MONITOR_RESOLUTION("4","hardware"),
    SET_LOW_MONITOR_RESOLUTION("5","hardware"),
    CHANGE_HEADPHONE_VOLUME("6","hardware"),
    SHOW_CURRENT_HEADPHONE_VOLUME("7","hardware"),
    BACK("back","universal"),
    END("end", "universal");

    private final String choice;
    private final String menuIndicator;

    MenuOption(String choice, String menuIndicator) {
        this.choice = choice;
        this.menuIndicator = menuIndicator;
    }
    public static MenuOption chosenAction(String userChoice, String chosenMenuIndicator){
        for (MenuOption option : values()){
            if (userChoice.equals("back")){
                return MenuOption.BACK;
            }
            if (userChoice.equals("end")){
                return MenuOption.END;
            }
            if (option.choice.equals(userChoice) && option.menuIndicator.equals(chosenMenuIndicator)){
                return option;
            }
        }
        throw new RuntimeException("Asked option doesn't exist in enum MenuOption"); //sprawia że default w case jest bezużyteczny
    }
}
