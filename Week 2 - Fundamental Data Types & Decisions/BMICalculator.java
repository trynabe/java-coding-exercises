import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in centimeter: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);

        System.out.printf("Your BMI is %.2f\n",BMI);
        if (BMI < 18.5){
            System.out.println("Underweight");
        } else if (18.5 <= BMI && BMI < 24.9){
            System.out.println("Normal weight");
        } else if (24.9 <= BMI && BMI < 29.9){
            System.out.println("Overweight");
        } else if (BMI >= 30){
            System.out.println("Obesity");
        }
        scanner.close();
    }
}

//Name: Saran Jompachoke
//ID: 6887056
//Section: 2