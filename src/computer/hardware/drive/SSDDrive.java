package computer.hardware.drive;

import computer.hardware.ComponentType;
import computer.software.file.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSDDrive implements Drive{
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
    public void listFiles() {
        Set<String> fileNames = files.keySet();
        for (String fileName : fileNames){
            System.out.println(fileName);
        }
    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
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
