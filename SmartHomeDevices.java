import java.util.Scanner;

interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            Device d = line.equalsIgnoreCase("Fan") ? new Fan() : new Light();
            d.turnOn();
            d.turnOff();
        }
        sc.close();
    }
}