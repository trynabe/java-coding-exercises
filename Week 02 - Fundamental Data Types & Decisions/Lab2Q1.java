import java.util.Scanner;
public class Lab2Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter your weight: ");
        double w1 = in.nextDouble();
        double w2 = in.nextDouble();
        double w3 = in.nextDouble();
        double w4 = in.nextDouble();
        
        System.out.print("enter your height: ");
        double h1 = in.nextDouble();
        double h2 = in.nextDouble();
        double h3 = in.nextDouble();
        double h4 = in.nextDouble();

        double result_w = (w1+w2+w3+w4)/4;
        double result_h = (h1+h2+h3+h4)/4;
        System.out.printf("The average weight is %.2f kg\n" , result_w);
        System.out.printf("The average height is %.2f kg\n" , result_h);

        in.close();
    }
}
// Name : Saran Jompachoke
// Student Number : 6887056
// Section : 2
