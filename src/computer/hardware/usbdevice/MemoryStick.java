package computer.hardware.usbdevice;

import computer.hardware.ComponentType;

public class MemoryStick extends USBDevice {

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
        System.out.println("Memory Stick Disconnected");
        connected = false;
    }
}
