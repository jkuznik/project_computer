package computer.hardware.drive;
import computer.hardware.ComponentType;
import computer.software.file.File;
import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive{
    String name;

    public HDDDrive(String name) {
        this.name = name;
    }

    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : files){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String fileName) {
        for (File file : files){
            if (fileName.equals(file.getName())){
                return file;
            }
        }
        return null;
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
