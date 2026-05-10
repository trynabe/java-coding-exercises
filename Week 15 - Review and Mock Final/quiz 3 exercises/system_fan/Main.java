package system_fan;

public class Main {
    public static void main(String[] args) {
        Switchable t0 = new Fan();
        Switchable t1 = new Fan();

        t0.turnOn();
        t1.turnOff();
    }
}
