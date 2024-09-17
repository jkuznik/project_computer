package computer;

import computer.hardware.Computer;
import computer.hardware.drive.Drive;
import computer.hardware.drive.HDDDrive;
import computer.software.file.File;
import computer.software.file.image.GIFImageFile;
import computer.software.file.image.JPGImageFIle;
import computer.software.file.music.MP3File;
import computer.hardware.Monitor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Monitor monitor = new Monitor("Dell");
        Drive   hddDrive = new HDDDrive();
        Computer computer = new Computer(monitor, hddDrive);


//        ssdDrive.addFile(new computer.software.file.File("photo.jpg"));
//        ssdDrive.listFiles();

//        computer.addFile(new File("file.png"));
//        computer.listFiles();
//        Mouse mouse = new Mouse("Mysz");
//        MemoryStick memoryStick = new MemoryStick("Pendrive");
//
//        computer.addUSBDevice(mouse);
//        computer.addUSBDevice(memoryStick);
//
//        computer.removeUSBDevice(mouse);
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);
//        List<USBDevice> usbDevices = computer.getUsbDevices();
//
//        for (USBDevice device : usbDevices){
//            System.out.println(device.getName());
//        }
        MP3File mp3File = new MP3File("audio.mp3", 4000, "Rammstein", "Sonne", 100);
        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);
        JPGImageFIle jpgImageFIle = new JPGImageFIle("holidays.jpg", 400, 80);

        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFIle);

        computer.listFiles();
        File file = computer.findFile("audio.mp3");
        System.out.println(file.getName());
        System.out.println(file.getSize());
        System.out.println(file);

        String menu;
        do {
            System.out.println("""
                    Choose the option?
                    1. Add USB device
                    2. Remove USB device
                    3. List USB devices
                    4. Add 
                    """);
            menu = scanner.nextLine();
            switch (menu){
                case "1" ->{
                    System.out.println("1");
                }
            }
        }while (!menu.equals("end"));
        System.out.println("cos");

    }
}