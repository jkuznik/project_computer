package computer.software.file.shared;

public enum FileType {
    GIF("1"),
    JPEG("2"),
    MP3("3"),
    DEFAULT("default");

    private String stringValue;

    FileType(String string) {
        this.stringValue = string;
    }

    public static FileType chosenAction(String userChoice) {
        FileType result = FileType.DEFAULT;
        for (FileType option: values()){
            if (option.stringValue.equals(userChoice)){
                result = option;
            }
        }
        return result;
    }
}
