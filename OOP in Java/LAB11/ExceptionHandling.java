import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter an integer value: ");
            int value1=sc.nextInt();
            System.out.print("Enter another integer value: ");
            int value2=sc.nextInt();
            // Arithmetic exception handling
            int quotient=value1/value2;
            System.out.println("Quotient: "+quotient);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter integer values only.");
        }
    }
}
