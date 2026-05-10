import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionUI {
    private Scanner scanner;

    public ConversionUI() {
        this.scanner = new Scanner(System.in);
    }

    public double getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public void displayResult(String result) {
        System.out.println(result);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        UnitConverter converter = new UnitConverter();
        ConversionUI ui = new ConversionUI();

        try {
            System.out.println("Select conversion: 1 (Celsius to Fahrenheit), 2 (Meters to Feet), 3 (Kilograms to Pound)");
            double choiceDouble = ui.getInput("Enter choice (1-3):");
            int choice = (int) choiceDouble;

            if (choice == 1) {
                double celsius = ui.getInput("Enter temperature in Celsius");
                double fahrenheit = converter.celsiusToFahrenheit(celsius);
                ui.displayResult(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
            } else if (choice == 2) {
                double meters = ui.getInput("Enter distance in meters:");
                double feet = converter.metersToFeet(meters);
                ui.displayResult(meters + " meters is equal to " + feet + " feet");
            } else if (choice == 3) {
                double kilograms = ui.getInput("Enter weight in kilograms");
                double pounds = converter.kilogramsToPound(kilograms);
                ui.displayResult(kilograms + " kilograms is equal to " + pounds + " pounds");
            } else {
                System.out.println("Invalid choice selected");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is invalid");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
            ui.closeScanner();
        }
    }
}
