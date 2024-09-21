package computer;

import computer.hardware.Capacity;
import computer.hardware.Computer;
import computer.hardware.Monitor;
import computer.hardware.drive.Drive;
import computer.hardware.drive.HDDDrive;
import computer.hardware.usbdevice.MemoryStick;
import computer.hardware.usbdevice.Mouse;
import computer.hardware.usbdevice.USBDevice;
import computer.software.file.image.GIFImageFile;
import computer.software.file.image.JPGImageFIle;
import computer.software.file.music.MP3File;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Monitor monitor = new Monitor("Dell");
        Drive   hddDrive = new HDDDrive(Capacity.GB64, "HDDDrive name");
        Computer computer = new Computer(monitor, hddDrive);


//        ssdDrive.addFile(new computer.software.file.File("photo.jpg"));
//        ssdDrive.listFiles();

//        computer.addFile(new JPGImageFIle("file.png", 15, 85));
//        computer.listFiles();
        Mouse mouse = new Mouse("Mysz");
        MemoryStick memoryStick = new MemoryStick("Pendrive", Capacity.GB1);
//
//        computer.removeUSBDevice(mouse);
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);
//        List<USBDevice> usbDevices = computer.getUsbDevices();
//
//        for (USBDevice device : usbDevices){
//            System.out.println(device.getName());
//        }

//        computer.addUSBDevice(mouse);
//        computer.addUSBDevice(memoryStick);           tak było

        computer.addComponent(mouse);
        computer.addComponent(memoryStick);         //  tak jest

        List<USBDevice> usbDevices = computer.getUSBDevices();
        for (USBDevice device : usbDevices){
            System.out.println(device.getName());
        }

        MP3File mp3File = new MP3File("audio.mp3", 4000, "Rammstein", "Sonne", 100);
        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);
        JPGImageFIle jpgImageFIle = new JPGImageFIle("holidays.jpg", 400, 80);

        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFIle);

//        computer.listFiles();
//        File file = computer.findFile("audio.mp3");
//        System.out.println(file.getName());
//        System.out.println(file.getSize());
//        System.out.println(file.getName());

        String menu;
        String subMenu;
        do {
            System.out.println("""
                    Choose the submenu
                    1. USB devices
                    2. Files
                    3. Hardware
                    4. end <- to exit
                    """);
            menu = scanner.nextLine();
            switch (menu){
                case "1" ->{
                    do{
                        System.out.println("""
                        Choose the option
                        1. Add USB device
                        2. Remove USB device
                        3. List USB devices
                        back <- to go back
                        end <- to exit
                        """);
                        subMenu = scanner.nextLine();
                        switch (subMenu){
                            case "1" ->{
                                System.out.println("Adding USB device");
                            }
                            case "2" ->{
                                System.out.println("Removing USB device");
                            }
                            case "3" ->{
                                for (USBDevice device : usbDevices){
                                   System.out.println(device.getName());
                                   if(device instanceof MemoryStick){
                                       System.out.println(((MemoryStick) device).getStorageCapacity() + "B");
                                   }
                               }
                            }
                            case "end" ->{
                                return;
                            }
                            default -> {
                                if (!subMenu.equals("back")){
                                    System.out.println("Wrong option");
                                }
                            }
                        }
                    }while (!subMenu.equals("back"));
                }
                case "2" ->{
                    do{
                        System.out.println("""
                        Choose the option
                        1. Add file
                        2. Remove file
                        3. Find file
                        4. List file
                        back <- to go back
                        end <- to exit
                        """);
                        subMenu = scanner.nextLine();
                        switch (subMenu){
                            case "1" ->{
                                System.out.println("Adding file");
                            }
                            case "2" ->{
                                System.out.println("Removing file");
                            }
                            case "3" ->{
                                System.out.println("Finding file");
                            }
                            case "4" ->{
                                computer.listFiles();
                            }
                            case "end" ->{
                                return;
                            }
                            default -> {
                                if (!subMenu.equals("back")){
                                    System.out.println("Wrong option");
                                }
                            }
                        }
                    }while (!subMenu.equals("back"));

                }
                case "3" ->{
                    do {
                        System.out.println("""
                        Choose the option
                        1. Add hardware
                        2. Remove hardware
                        3. List hardware
                        4. Set high monitor resolution
                        5. Set low monitor resolution
                        back <- to go back
                        end <- to exit
                        """);
                        subMenu = scanner.nextLine();
                        switch (subMenu){
                            case "1" ->{
                                System.out.println("Adding hardware");
                            }
                            case "2" ->{
                                System.out.println("Removing hardware");
                            }
                            case "3" ->{
                                System.out.println("Listing hardware");
                            }
                            case "4" ->{
                                monitor.setHeightResolution();
                                System.out.println(monitor.getResolution());
                            }
                            case "5" ->{
                                monitor.setLowResolution();
                                System.out.println(monitor.getResolution());
                            }
                            case "end" ->{
                                return;
                            }
                            default -> {
                                if (!subMenu.equals("back")){
                                    System.out.println("Wrong option");
                                }
                            }
                        }
                    }while (!subMenu.equals("back"));

                }
            }
        }while (!menu.equals("end"));
        System.out.println("cos");

    }
}