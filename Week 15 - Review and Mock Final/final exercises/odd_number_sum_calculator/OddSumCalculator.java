import java.util.Scanner;

public class OddSumCalculator {

    public static int sumOdd(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return sumOdd(n - 1);
        } else {
            return n + sumOdd(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumOdd(number);
        System.out.println("Sum of odd numbers from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}