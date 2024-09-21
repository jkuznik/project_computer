package computer.hardware.usbdevice;

import computer.hardware.ComponentType;
import computer.hardware.Components;

import java.util.Scanner;

public abstract class USBDevice implements Components {
    protected String name;
    protected boolean connected = false;
    protected boolean safeDisconnect = false;

    public USBDevice(String name) {
        this.name = name;
    }

    public void connect(){
        if(connected) {
            System.out.println(this.getNAME() + " is already connected");
        } else {
            System.out.println(this.getNAME() + " connected");
            connected = true;
        }
    }

    public void disconnect(){
        Scanner scanner = new Scanner(System.in);
        String chose;
        if(safeDisconnect){
            System.out.println(this.getNAME() + " disconnected");
            safeDisconnect = false;
            connected = false;
        } else {
            System.out.println("Safe disconnect not ready. Are you sure you want to disconnect? [Y/N]");
            chose = scanner.next();

            switch(chose){
                case "Y" ->{
                    System.out.println(this.getNAME() + " force disconnected");
                    connected = false;
                }
                case "N" ->{
                    System.out.println(this.getNAME() + " is still connected... Preparing safe disconnect..." +
                            this.getNAME() + " disconnected");
                    safeDisconnect = false;
                    connected = false;
                }
            }
        }
    }

    public boolean isConnected(){
        return connected;
    }

    protected boolean isSafeDisconnect() {
        return safeDisconnect;
    }

    protected void setSafeDisconnect(boolean safeDisconnect) {
        this.safeDisconnect = safeDisconnect;
    }

    @Override
    public String getNAME() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.USB;
    }
}
