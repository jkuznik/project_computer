package computer.hardware.usbdevice;

import computer.hardware.Capacity;
import computer.software.file.File;
import computer.software.file.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class MemoryStick extends USBDevice {

    private final Capacity STORAGE_CAPACITY;
    private Integer capacityUsage = 0;

    private List<File> files = new ArrayList<>();

    public MemoryStick(String name, Capacity storageCapacity) {
        super(name);
        this.STORAGE_CAPACITY = storageCapacity;
    }

    public void addFile(File file) {
        if (connected) {
            if(STORAGE_CAPACITY.getSize() > capacityUsage + file.getSize()) {
                files.add(file);
                capacityUsage+=file.getSize();
            } else {
                System.out.println("Not enough space in storage capacity");     //TODO utworzyć wyjątek i wykorzystać tutaj
            }
        } else {
            throw new MemoryStickDisconnectedException("Memory Stick is disconnected");
        }
    }

    public void removeFile(File file) {
        try{
            findFileByName(file.getName());
            files.remove(file);
            capacityUsage-=file.getSize();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<File> getFiles() {
        return files;
    }

    public File findFileByName(String name) {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        throw new FileNotFoundException("File " + name + " not found");
    }

    public Capacity getStorageCapacity() {
        return STORAGE_CAPACITY;
    }
}
