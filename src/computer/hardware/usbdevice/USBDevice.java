package computer.hardware.usbdevice;

import computer.hardware.ComponentType;
import computer.hardware.Components;

public abstract class USBDevice implements Components {
    String name;
    boolean connected = false;

    public USBDevice(String name) {
        this.name = name;
    }

    public void connect(){
        connected = true;
    }

    public void disconnect(){
        connected = false;
    }

    public boolean isConnected(){
        return connected;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.USB;
    }
}
