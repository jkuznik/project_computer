package computer.software.file.music;

import computer.software.file.shared.FileType;

public class MP3File extends AbstractMusicFIle{
    private final int quality;
    public MP3File(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    @Override
    public FileType getType() {
        return FileType.MP3;
    }
}
