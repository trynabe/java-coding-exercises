package check_the_temperature;

public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        double[] temperature = {-5, 25, 55};

        for (int i = 0; i < temperature.length; i++) {
            try {
                thermometer.checkTemperature(temperature[i]);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
