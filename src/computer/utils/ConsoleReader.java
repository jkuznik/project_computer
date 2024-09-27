package computer.utils;

import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);
    private static ConsoleReader instance;

    private ConsoleReader(){
    }

    public static ConsoleReader getInstance() {
        if (instance == null) {
            instance = new ConsoleReader();
        }
        return instance;
    }

    public Scanner readFromConsole() {
        return scanner;
    }
}
