
public class Main2 {
 public static void main(String[] args) {
 int dividend = 10;
 int divisor = 0;
 try {
 divide(dividend, divisor);
 } catch (ArithmeticException e) {
 System.out.println("Error: " + e.getMessage());
 }
 } 
 public static void divide(int dividend, int divisor) {
 if (divisor == 0) {
 throw new ArithmeticException("Divisor cannot be zero");
 }
 int result = dividend / divisor;
 System.out.println("Result: " + result);
 }
}