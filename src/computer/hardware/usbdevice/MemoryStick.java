package computer.hardware.usbdevice;

import computer.software.file.File;
import computer.software.file.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class MemoryStick extends USBDevice {

    List<File> files = new ArrayList<>();

    public MemoryStick(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("Memory Stick Connected");
        connected = true;
    }

    @Override
    public void disconnect() {
        System.out.println("Memory Stick disconnected");
        connected = false;
    }

    public void addFile(File file) {
        if (connected) {
            files.add(file);
        } else {
            throw new MemoryStickDisconnectedException("Memory Stick is disconnected");
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
}
