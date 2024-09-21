package computer.software.file;

import computer.hardware.Capacity;
import computer.hardware.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public abstract class FileStorage implements Drive {

    protected final Capacity STORAGE_CAPACITY;
    protected Integer capacityUsage = 0;
    protected List<File> files = new ArrayList<>();

    protected FileStorage(Capacity storageCapacity) {
        STORAGE_CAPACITY = storageCapacity;
    }

    protected Capacity getStorageCapacity() {
        return STORAGE_CAPACITY;
    }

    public void addFile(File file) {
            if(STORAGE_CAPACITY.getSize() > capacityUsage + file.getSize()) {
                files.add(file);
                capacityUsage+=file.getSize();
            } else {
                System.out.println("Not enough space in storage capacity");     //TODO utworzyć wyjątek i wykorzystać tutaj
            }
    }

    public void removeFile(File file) {
        try{
            findFile(file.getName());
            files.remove(file);
            capacityUsage-=file.getSize();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listFiles() {
        for (File file : files){
            System.out.println(file.getName());
        }
    }

    public File findFile(String name) {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        throw new FileNotFoundException("File " + name + " not found");
    }
}
