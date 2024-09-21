package computer.hardware.drive;
import computer.hardware.Components;
import computer.software.file.File;

public interface Drive  extends Components {
    void addFile(File file);
    void removeFile(File file);
    void listFiles();
    File findFile(String fileName);
}
