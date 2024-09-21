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
    private final Capacity capacity;
    String name;
    Map<String, File> files =new HashMap<>();

    public SSDDrive(String name, Capacity capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public void addFile(File file) {
        // TODO SSD Drive przechowuje pliki w HashMap a nie w List, albo to zmieniamy albo logika dodawania plików musi być oddzielna
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
    public String getName() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.DRIVE;
    }
}
