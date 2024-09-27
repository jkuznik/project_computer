package computer.software.file.image;

import computer.software.file.shared.AbstractFile;
import computer.software.file.shared.FileType;

public class JPGImageFIle extends AbstractFile {
    private final int compression;

    public JPGImageFIle(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }
    public void showImage(){
        System.out.println("Showing Image");
    }

    @Override
    public FileType getType() {
        return FileType.JPEG;
    }
}
