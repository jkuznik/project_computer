package computer.file.music;

import computer.file.AbstractFile;
import computer.file.FileType;

public abstract class AbstractMusicFIle extends AbstractFile implements MusicFile{
    protected String bandName;
    protected String title;

    public AbstractMusicFIle(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
