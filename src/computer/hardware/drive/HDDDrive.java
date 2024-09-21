package computer.hardware.drive;
import computer.hardware.Capacity;
import computer.hardware.ComponentType;
import computer.software.file.File;
import computer.software.file.FileStorage;

public class HDDDrive implements Drive {
    private final String name;
    private final FileStorage fileStorage;


    public HDDDrive(String name, Capacity storageCapacity) {
        this.name = name;
        fileStorage = new FileStorage(storageCapacity);
    }

    @Override
    public void addFile(File file) {
        fileStorage.addFile(file);
    }

    @Override
    public void removeFile(File file) {
        fileStorage.removeFile(file);
    }

    @Override
    public void listFiles() {
        fileStorage.listFiles();
    }

    @Override
    public File findFile(String fileName) {
        return fileStorage.findFile(fileName);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.DRIVE;
    }
}
