package computer.file.image;

import computer.file.AbstractFile;
import computer.file.FileType;

public class AbstractImageFIle extends AbstractFile {

    public AbstractImageFIle(String name, int size) {
        super(name, size);
    }
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
