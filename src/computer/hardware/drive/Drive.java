package computer.hardware.drive;
import computer.software.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String fileName);
}
