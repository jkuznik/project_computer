package computer.software.file;

public class NotEnoughSpaceException extends Exception {
    public NotEnoughSpaceException(String message) {
        super(message);
    }
}
