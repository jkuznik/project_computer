package computer.hardware.drive;

import computer.hardware.Capacity;
import computer.hardware.ComponentType;
import computer.software.file.File;
import computer.software.file.FileStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSDDrive extends FileStorage {
    private Capacity capacity;
    String name;
    Map<String, File> files =new HashMap<>();

    public SSDDrive(Capacity capacity, String name) {
        super(capacity);
        this.name = name;
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
