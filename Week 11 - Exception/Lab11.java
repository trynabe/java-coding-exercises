import java.util.Scanner;
import java.util.InputMismatchException;

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

public class Lab11 {
    public static int balance = 3000;

    public static void withDraw(int amount) throws BankException {
        if (amount < 0) {
            throw new BankException("You must enter amount > 0");
        }
        if (amount > balance) {
            throw new BankException("Insufficient amount to withdraw");
        }
        balance -= amount;
        System.out.println("withdraw: " + amount);
        System.out.println("balance: " + balance);
    }

    public static void main(String[] args) {

        // task1.1
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }

        // task1.2
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int x = reader.nextInt();
            System.out.println("Your number is " + x);
        } catch (InputMismatchException e) {
            System.out.println("Exception occurred.");
        }

        // task1.3
        try {
            String[] list = {"$123", "456"};
            double amount = Double.parseDouble(list[0]);
            System.out.println("The amount at index 2 " + amount);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception.");
        } finally {
            System.out.println("Program Ended");
        }

        // task2
        try {
            Scanner reader2 = new Scanner(System.in);
            System.out.print("Enter amount: ");
            int bal = reader2.nextInt();
            withDraw(bal);
        } catch (BankException e) {
            e.printStackTrace();
        }
    }
}