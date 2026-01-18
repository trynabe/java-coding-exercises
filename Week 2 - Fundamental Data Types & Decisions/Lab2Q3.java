import java.util.Scanner;

public class Lab2Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter your money: ");
        double money = in.nextInt();
        
        if (money <= 50){
            System.out.printf("%.1f\n", money);
        } else if (money > 50 && money < 100){
            System.out.printf("%.1f\n", money * 95/100);
        } else if (money > 100 && money < 1000){
            System.out.printf("%.1f\n", money * 90/100);
        } else if (money >= 1000){
            System.out.printf("%.1f\n", money * 80/100);
        }

        in.close();
    }
}
// Name : Saran Jompachoke
// Student Number : 6887056
// Section : 2