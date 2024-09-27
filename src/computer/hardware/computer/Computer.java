package computer.hardware.computer;

import computer.hardware.components.Component;
import computer.hardware.components.ComponentType;
import computer.hardware.components.drive.Drive;
import computer.software.file.shared.File;
import computer.hardware.components.usbdevice.USBDevice;
import computer.software.file.shared.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerAPI{
    List<Component> components = new ArrayList<>();

    private static Computer instance;

    private Computer(){
    }

    public static Computer getInstance(){
        if (instance == null){
            instance = new Computer();
        }
        return instance;
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public Component getComponent(ComponentType componentType) {
        return components.stream()
                .filter(component -> component.getType() == componentType)
                .findFirst().orElseThrow();
    }

    @Override
    public void removeComponent(Component component){
        components.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public List<USBDevice> getUSBDevices() {
        List<USBDevice> usbDevices = new ArrayList<>();
        for (Component component : components) {
            if (component instanceof USBDevice) {
                usbDevices.add((USBDevice) component);
            }
        }
        return usbDevices;
    }
    @Override
    public void addFile(File file){ //TODO metody działające na plikach trzeba dostosować do możliwości posiadania różnych nośników (twardy dysk, pendrive)
        var drive = getDrive();
        drive.addFile(file);
    }

    @Override
    public File findFile(String fileName) {
        var drive = getDrive();
        try {
            return drive.findFile(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void removeFile(File file) {

    }

    @Override
    public void listFiles(){
        var drive = getDrive();
        drive.listFiles();
    }

    private Drive getDrive() {
        for (Component component : components) {
            if (component instanceof Drive) {
                return (Drive) component;
            }
        }
        throw new RuntimeException("No component found");
    }
}
