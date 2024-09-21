package computer.hardware.usbdevice;

import computer.hardware.Capacity;
import computer.software.file.File;
import computer.software.file.FileStorage;

public class MemoryStick extends USBDevice {

    private final FileStorage fileStorage;

    public MemoryStick(String name, Capacity storageCapacity) {
        super(name);
        fileStorage = new FileStorage(storageCapacity);
    }

    public void addFile(File file) {
        fileStorage.addFile(file);
    }

    public void removeFile(File file) {
        fileStorage.removeFile(file);
    }

    public File findFile(String fileName) {
        return fileStorage.findFile(fileName);
    }

    public int getStorageCapacity() {
        return fileStorage.getStorageCapacity();
    }
}
