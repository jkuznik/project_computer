package computer.hardware.components.headphones;

import computer.hardware.components.ComponentType;
import computer.hardware.components.Component;
import java.util.Scanner;

public class Headphones implements Component{

    private final Scanner scanner = new Scanner(System.in);
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
        this.volume = 50;
    }

    public int getVolume() {
        return volume;
    }

    public void changeVolume() {
        System.out.println("Ustaw głośność słuchawek z zakresu 0 - 100");

        do {
            String userChoice = scanner.nextLine();
            int temp;

            try {
                temp = Integer.parseInt(userChoice);

                if ((temp < 0) || (temp > 100)){
                    System.out.println("Podano wartość spoza zakresu");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong value!");
                continue;
            }
            volume = temp;
            break;
        }while(true);
    }

    public void showVolume() {
        System.out.println("Aktualnie ustawiona głośność słuchawek to " + getVolume());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.HEADPHONES;
    }
}
