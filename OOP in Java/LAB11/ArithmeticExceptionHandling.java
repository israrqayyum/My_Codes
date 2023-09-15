import java.util.Scanner;
public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int value1=sc.nextInt();
        System.out.print("Enter the second value: ");
        int value2=sc.nextInt();
        try {
            // Perform arithmetic operations
            int sum=value1+value2;
            int difference=value1-value2;
            int product=value1*value2;
            int quotient=value1/value2;
            // Display the results
            System.out.println("Sum: "+sum);
            System.out.println("Difference: "+difference);
            System.out.println("Product: "+product);
            System.out.println("Quotient: "+quotient);
        } catch (ArithmeticException e){
            // Handle arithmetic exception (division by zero)
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
