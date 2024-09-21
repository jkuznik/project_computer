package computer.software.file;

import java.util.List;

public class FileStorage {

    public static int addFile(List<File> files, File file, int emptySpace ) {
        if(emptySpace > file.getSize()) {
            files.add(file);
            emptySpace +=file.getSize();
        } else {
            System.out.println("Not enough space in storage capacity");     //TODO utworzyć wyjątek i wykorzystać tutaj
        }
        return emptySpace;
    }

    public static void removeFile(List<File> files, File file) {
        if (files.contains(file)) {
            files.remove(file);
        } else throw new IllegalArgumentException("The given file does not exist");
    }

    public static void listFiles(List<File> files) {
        for (File file : files){
            System.out.println(file.getName());
        }
    }

    public static File findFile(List<File> files, String name) {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        throw new FileNotFoundException("File " + name + " not found");
    }
}
