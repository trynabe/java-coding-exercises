import java.util.Scanner;

public class ClassWallpaper {
    public static void main(String[] args) {

        // Task 1
        System.out.print("=== Welcome to Customized Wallpaper System ===\n");
        System.out.print("We have 3 popular styles here:\n");
        int n = 5, i, j, k;

        System.out.print("=== Style 1 ===\n");
        for(i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
            System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.print("=== Slyle 2 ===\n");
        for(i = 1; i <= n; i++) {
            for (j = 1; j < i; j++)
            System.out.print("  ");

            for (k = i ; k <= n ; k++) {
            System.out.print("_ ");
            }
            System.out.println();
        }
        System.out.print("=== Slyle 3 ===\n");
        for(i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
            System.out.print(j+" ");
            }
            for (k = n-i; k >= 1; k--) {
            System.out.print("_ ");
            }
            System.out.println();
        }
// Task 2

Scanner sc = new Scanner(System.in);

int totalCost = 0;
int choice;

do {
    System.out.print("\nPlease choose your style: ");
    choice = sc.nextInt();

    if (choice <= 0) {
        break;
    }

    System.out.print("Size: ");
    int size = sc.nextInt();

    sc.nextLine();
    System.out.print("Symbol: ");
    String sym = sc.nextLine();

    switch (choice) {

        case 1:
            for (i = 1; i <= size; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            totalCost += 100;
            break;

        case 2:
            for (i = 1; i <= size; i++) {
                for (j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                for (k = i; k <= size; k++) {
                    System.out.print(sym + " ");
                }
                System.out.println();
            }
            totalCost += 200;
            break;

        case 3:
            for (i = 1; i <= size; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (k = size - i; k >= 1; k--) {
                    System.out.print(sym + " ");
                }
                System.out.println();
            }
            totalCost += 300;
            break;

        default:
            System.out.println("Bye");
    }

} while (true);

System.out.println("\nTotal Bill: " + totalCost);
    }
}
// Name : Saran Jompachoke
// Student Number : 6887056
// Section : 2