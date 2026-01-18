import java.util.Scanner;
public class Lab2Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter your coins: ");
        int coin = in.nextInt();

        int compute_ten = coin / 10;
        System.out.printf("10: %d\n", compute_ten);
        compute_ten = coin % 10;

        int compute_five = compute_ten / 5;
        System.out.printf("5: %d\n", compute_five);
        compute_five = coin % 5;

        int compute_one = compute_five / 1;
        System.out.printf("1: %d\n", compute_one);

        in.close();
    }
}
// Name : Saran Jompachoke
// Student Number : 6887056
// Section : 2