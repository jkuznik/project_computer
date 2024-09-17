package computer.hardware.usbdevice;

import computer.hardware.ComponentType;

public class Mouse extends USBDevice{

    // TODO zrobić bliźniaczą klase reprezentującą klawiaturę

    public Mouse(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println("Mouse connected");
        connected = true;
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected");
        connected = false;
    }
}
