package computer.software.file;

import computer.hardware.Capacity;

import java.util.ArrayList;
import java.util.List;

public abstract class FileOperation {
    protected final Capacity STORAGE_CAPACITY;
    protected Integer capacityUsage = 0;

    protected List<File> files = new ArrayList<>();

    public FileOperation(Capacity STORAGE_CAPACITY) {
        this.STORAGE_CAPACITY = STORAGE_CAPACITY;
    }

    protected void addFiles(File file) {
        if(STORAGE_CAPACITY.getSize() > capacityUsage + file.getSize()) {
            files.add(file);
            capacityUsage+=file.getSize();
        } else {
            System.out.println("Not enough space in storage capacity");     //TODO utworzyć wyjątek i wykorzystać tutaj
        }
    }
}
