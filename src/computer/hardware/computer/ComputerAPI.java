package computer.hardware.computer;

import computer.hardware.components.Component;
import computer.hardware.components.ComponentType;
import computer.hardware.components.usbdevice.USBDevice;
import computer.software.file.shared.File;

import java.util.List;

public interface ComputerAPI {

    void addComponent(Component component);
    Component getComponent(ComponentType componentType);
    void removeComponent(Component component);
    List<Component> getComponents();
    List<USBDevice> getUSBDevices();

    void addFile(File file);
    void removeFile(File file);
    File findFile(String fileName);
    void listFiles();
}
