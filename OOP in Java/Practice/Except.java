// import java.util.Scanner;
// public class Except {
    // public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number:");
        // while (!sc.hasNextInt()) {
            // System.out.println("Invalid input. Please enter an integer:");
            // sc.next(); // Discard the invalid input
        // }
        // int x = sc.nextInt();
        // System.out.println("You entered: " + x);
    // }
// }
import java.util.Scanner;

public class Except {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int x;
        do {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer:");
                sc.next(); // Discard the invalid input
            }
        } while (true);
        System.out.println("You entered: " + x);
    }
}
