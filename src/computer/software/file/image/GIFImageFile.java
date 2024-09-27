package computer.software.file.image;

import computer.software.file.shared.AbstractFile;
import computer.software.file.shared.FileType;

public class GIFImageFile extends AbstractFile {

    public GIFImageFile(String name, int size) {
        super(name, size);
    }
    public void showAnimation(){
        System.out.println("Showing funny GIF");
    }

    @Override
    public FileType getType() {
        return FileType.GIF;
    }
}
