package computer;

public class Monitor {
    private final String name;
    private int width;
    private int height;

    public Monitor(String name) {
        this.name = name;

        setHeightResolution();
    }

    public void setHeightResolution(){
        width = 3840;
        height = 1920;
    }

    public void setLowResolution(){
        width = 800;
        height = 600;
    }
    public String getResolution(){
        return width + "x" + height;
    }
}
