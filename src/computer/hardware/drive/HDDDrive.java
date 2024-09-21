package computer.hardware.drive;
import computer.hardware.Capacity;
import computer.hardware.ComponentType;
import computer.software.file.File;
import computer.software.file.FileStorage;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive extends FileStorage{
    String name;

    public HDDDrive(Capacity capacity, String name) {
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
