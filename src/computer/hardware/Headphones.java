package computer.hardware;

public class Headphones implements Components {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNAME() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return null;
    }
}
