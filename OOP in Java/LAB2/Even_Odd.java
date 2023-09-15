import java.util.*; 
// Importing the required classes from the java.util package

public class Even_Odd 
 // Defining the class
{
    public static void main(String[] args) 
    // Defining the main method
      {  
        Scanner sc=new Scanner(System.in); 
        // Creating a Scanner object for user input
        System.out.println("Enter a Number to Find Whether it is Even or Odd");
        // Prompting the user to enter a number
        int n=sc.nextInt(); 
        // Reading the user input and storing it in the integer variable n
        if(n%2==0)
        // Checking whether n is divisible by 2
        System.out.println("You Entered Even Number"); 
        // If n is even, print this message
        else if(n%2==1)
        // Checking whether n is not divisible by 2 (i.e., odd)
        System.out.println("You Entered Odd Number");
        // If n is odd, print this message
        else 
        // If the input is not a valid number
        System.out.println("You Entered Invalid Input"); 
        // Print this message
    }
}
