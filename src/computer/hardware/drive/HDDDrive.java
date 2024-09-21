package computer.hardware.drive;
import computer.hardware.Capacity;
import computer.hardware.ComponentType;
import computer.software.file.File;
import computer.software.file.FileStorage;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {
    private final String NAME;
    private final Capacity STORAGE_CAPACITY;
    private final List<File> FILES = new ArrayList<>();

    private int capacityUsage = 0;

    public HDDDrive(String name, Capacity storageCapacity) {
        this.NAME = name;
        this.STORAGE_CAPACITY = storageCapacity;
    }

    @Override
    public void addFile(File file) {
        int emptySpace = STORAGE_CAPACITY.getSize().intValue() - capacityUsage;
        capacityUsage = FileStorage.addFile(FILES, file, emptySpace);
    }

    @Override
    public void removeFile(File file) {
        FileStorage.removeFile(FILES, file);
    }

    @Override
    public void listFiles() {
        FileStorage.listFiles(FILES);
    }

    @Override
    public File findFile(String fileName) {
        FileStorage.findFile(FILES, fileName);
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.DRIVE;
    }
}
