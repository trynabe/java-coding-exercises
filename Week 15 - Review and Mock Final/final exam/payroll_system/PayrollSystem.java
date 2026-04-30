import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee type (hourly/daily): ");
        String type = scanner.nextLine().trim().toLowerCase();

        try {
            Payable employee = null;

            if (type.equals("hourly")) {
                System.out.print("Enter hours worked: ");
                int hours = scanner.nextInt();
                employee = new HourlyEmployee(hours);
            } else if (type.equals("daily")) {
                System.out.print("Enter days worked: ");
                int days = scanner.nextInt();
                employee = new DailyEmployee(days);
            } else {
                System.out.println("Invalid employee type.");
                scanner.close();
                return;
            }
            
            System.out.println("Total pay: " + employee.calculatePay() + " baht");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
