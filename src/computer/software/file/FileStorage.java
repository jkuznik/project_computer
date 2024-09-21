package computer.software.file;

import computer.hardware.Capacity;

import java.util.ArrayList;
import java.util.List;

public class FileStorage {

    private final Capacity storageCapacity;
    private final List<File> files = new ArrayList<>();
    private Integer capacityUsage = 0;


    public FileStorage(Capacity STORAGE_CAPACITY) {
        this.storageCapacity = STORAGE_CAPACITY;
    }

    public void addFile(File file) {
        if (isEnoughSpace(file))
            files.add(file);
    }

    public void removeFile(File file) {
        if (files.contains(file)) {
            files.remove(file);
        } else throw new IllegalArgumentException("The given file does not exist");
    }

    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public File findFile( String name) {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        throw new FileNotFoundException("File " + name + " not found");
    }

    public int getStorageCapacity() {
        return storageCapacity.getSize().intValue();
    }

    private boolean isEnoughSpace(File file) {
        if (storageCapacity.getSize().intValue() > capacityUsage + file.getSize()) {
            return true;
        } else throw new NotEnoughSpaceException("Not enough space");
    }

}
