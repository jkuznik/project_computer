package computer.hardware.components.monitor;

import computer.hardware.components.Component;
import computer.hardware.components.ComponentType;

public class Monitor implements Component {
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
        return "Current resolution: " + width + "x" + height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.MONITOR;
    }
}
