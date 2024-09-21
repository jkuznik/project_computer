package computer.hardware.drive;

import computer.hardware.Capacity;
import computer.hardware.ComponentType;
import computer.software.file.File;
import computer.software.file.FileNotFoundException;
import computer.software.file.FileStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSDDrive implements Drive {
    private Capacity capacity;
    String name;
    Map<String, File> files =new HashMap<>();

    public SSDDrive(String name) {
        this.name = name;
    }

    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void removeFile(File file) {
        files.remove(file.getName());
    }

    @Override
    public void listFiles() {
        for (File file : files.values()) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String fileName) {
        if (files.containsKey(fileName)) {
            return files.get(fileName);
        } else throw new FileNotFoundException(fileName + " not found");
    }

    @Override
    public String getNAME() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.DRIVE;
    }
}
