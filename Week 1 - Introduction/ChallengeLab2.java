import java.util.Scanner;

public class ChallengeLab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        int num3 = in.nextInt();

        switch (num3) {
            case 1:
                System.out.print(num1 + num2);
                break;
            case 2:
                System.out.print(num1 - num2);
                break;
            case 3:
                System.out.print(num2 * num2);
                break;
            case 4:
                System.out.print(num1 / num2);
                break;
            default:
                System.out.print("Invalid operation");
                break;
        }
        in.close();
    }
}

