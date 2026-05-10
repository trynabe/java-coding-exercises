package system_fan;

public class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is now on.");
    }

    public void turnOff() {
        System.out.println("Fan is now off.");
    }
}