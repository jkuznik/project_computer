package computer.drive;
import computer.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String fileName);
}
