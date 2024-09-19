package computer;

import computer.hardware.Computer;
import computer.hardware.drive.Drive;
import computer.hardware.drive.HDDDrive;
import computer.hardware.usbdevice.MemoryStick;
import computer.hardware.usbdevice.Mouse;
import computer.hardware.usbdevice.USBDevice;
import computer.software.file.File;
import computer.software.file.image.GIFImageFile;
import computer.software.file.image.JPGImageFIle;
import computer.software.file.music.MP3File;
import computer.hardware.Monitor;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Monitor monitor = new Monitor("Dell");
        Drive   hddDrive = new HDDDrive("HDDDrive name");
        Computer computer = new Computer(monitor, hddDrive);


//        ssdDrive.addFile(new computer.software.file.File("photo.jpg"));
//        ssdDrive.listFiles();

//        computer.addFile(new JPGImageFIle("file.png", 15, 85));
//        computer.listFiles();

        Mouse mouse = new Mouse("Mysz");
        MemoryStick memoryStick = new MemoryStick("Pendrive");

//        computer.addUSBDevice(mouse);
//        computer.addUSBDevice(memoryStick);           tak było

        computer.addComponent(mouse);
        computer.addComponent(memoryStick);         //  tak jest

        List<USBDevice> usbDevices = computer.getUSBDevices();
        for (USBDevice device : usbDevices){
            System.out.println(device.getName());
        }


//        computer.removeUSBDevice(mouse);              tak było
        computer.removeComponent(mouse);            // tak jest

//        computer.removeUSBDevice(memoryStick);        tak było
        computer.removeComponent(memoryStick);      // tak jest

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

        String mainMenu = """
                    Choose the submenu
                    1. USB devices
                    2. Files
                    3. Hardware
                    4. end <- to exit
                    """;
        String usbMenu = """
                        Choose the option
                        1. Add USB device
                        2. Remove USB device
                        3. List USB devices
                        back <- to go back
                        end <- to exit
                        """;
        String fileMenu = """
                        Choose the option
                        1. Add file
                        2. Remove file
                        3. Find file
                        4. List file
                        back <- to go back
                        end <- to exit
                        """;
        String hardwareMenu = """
                        Choose the option
                        1. Add hardware
                        2. Remove hardware
                        3. List hardware
                        4. Set high monitor resolution
                        5. Set low monitor resolution
                        6. Change headphone's volume
                        7. Show current headphone's volume
                        back <- to go back
                        end <- to exit
                        """;
        String menu;
        String subMenu;
        do {
            System.out.println(mainMenu);
            menu = scanner.nextLine();
            switch (menu){
                case "1" ->{
                    do{
                        System.out.println(usbMenu);
                        subMenu = scanner.nextLine();
                        switch (subMenu){
                            case "1" ->{
                                System.out.println("Adding USB device");
                            }
                            case "2" ->{
                                System.out.println("Removing USB device");
                            }
                            case "3" ->{
                                usbDevices = computer.getUSBDevices();
                                for (USBDevice device : usbDevices){
                                   System.out.println(device.getName());
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
                        System.out.println(fileMenu);
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
                        System.out.println(hardwareMenu);
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
                            case "6" ->{
                                System.out.println("Set new volume (0-100)");

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