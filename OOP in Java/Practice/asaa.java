import java.util.Scanner;
import java.util.InputMismatchException;

class asaa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter Integer:");
                int x = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("---Invalid Input---");
                sc.next();
            }
        } while (true);
    }
}
