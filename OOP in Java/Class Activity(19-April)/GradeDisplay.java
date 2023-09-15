import java.util.Scanner;

public class GradeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number between 1 and 100 from the user
        System.out.println("Enter a number between 1 and 100:");
        int number = scanner.nextInt();

        // Determine the grade based on the input
        int grade = number / 10; // Divide by 10 to get the tens place

        // Display the grade using a switch statement
        switch (grade) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }
    }
}