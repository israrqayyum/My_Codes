
import java.util.Scanner;
public class Excep
{
 public static void main(String[] args){
 Scanner cc = new Scanner(System.in); 
 int a; 
 try{
 System.out.println("Enter the integer value: ");
 a = cc.nextInt();
 System.out.println("The value passed...");
 System.out.println("Program Terminated");
 }
 catch (Exception t)
 {
 System.out.println("The Entered value is not correct... ");
 System.out.println("Try Writing an Integer");
 }
 }
}