package computer;

import computer.hardware.components.Monitor;
import computer.hardware.components.drive.Drive;
import computer.hardware.components.drive.HDDDrive;
import computer.hardware.components.headphones.Headphones;
import computer.hardware.components.headphones.HeadphonesAPI;
import computer.hardware.components.usbdevice.MemoryStick;
import computer.hardware.components.usbdevice.USBDevice;
import computer.hardware.computer.Computer;
import computer.hardware.computer.MenuIndicator;
import computer.hardware.computer.MenuOption;
import computer.hardware.computer.UserInterface;
import computer.software.file.shared.Capacity;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface.displayInterface();

/*      TODO: wszystko to co zakomentowane powinno zniknąć z klasy Main, jeżeli coś ma być inicializowane (do testów lub na stałe) w trakcie tworzenia komputera należy to dodać do konstrukora klasy Computer,
        TODO: reszta może być uwzględniona w interfejsie i wykonywane podczas RUN TIME.
        Mouse mouse = new Mouse("Mysz");
        MemoryStick memoryStick = new MemoryStick("Pendrive", Capacity.GB1);

        computer.addComponent(mouse);
        computer.addComponent(memoryStick);

        MP3File mp3File = new MP3File("audio.mp3", 4000, "Rammstein", "Sonne", 100);
        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);
        JPGImageFIle jpgImageFIle = new JPGImageFIle("holidays.jpg", 400, 80);

        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFIle);*/


    }
}