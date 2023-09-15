import java.util.*;
 public class Factorial
 {
  // Creating the main method
  public static void main(String[] args)
  {
   // Initializing the variable "cal" with a value of 1
   int cal = 1;
   // Creating a Scanner object to read user input from the console
   Scanner sc = new Scanner(System.in);
   // Prompting the user to enter a number to find its factorial
   System.out.println("Enter Number to Find its Factorial:");
   // Reading the user input and storing it in the variable "n"
   int n = sc.nextInt();
   // Starting a for loop to calculate the factorial of the entered number
   for (int i = n; i > 1; i--) 
   {
     // Multiplying the current value of "cal" with the current value of "i"
     cal = cal * i;
   }
   // Printing the final result (i.e., the factorial of the entered number)
   System.out.println("The Factorial is:" + cal);
  }
 }
