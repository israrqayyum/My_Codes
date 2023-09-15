import java.io.*;           //imports all classes and interfaces defined in java.io
//the * charcter is wildcard charcter that represents all the classes and interfaces in the java.io package
import java.util.Scanner;   //scanner function for getting data in input screen
   public class Subtraction //class decleration
   {
       public static void main(String []args)
       /*Entry point of java programs.When You Run this Java program the java virtual machine(jvm) looks for this special method
         String []args means it is the parameter list of this method .it specifies that the method takes an array of strings as 
         input,which can be used to pass command-line arguments to the program.
        */
       {
           Scanner t=new Scanner(System.in);        //scanner function 
           System.out.print("Enter First Number:"); //diplsay on output screen
           int num1=t.nextInt();                    //declare varaible for getting data on runtime
           System.out.print("Enter Second Number:");//display on output screen
           int num2=t.nextInt();                    //declare variable for getting data on runtime
           int Sub;                                 //simple declearing variable
           Sub=num1-num2;                           //performing calculations
           System.out.println("First Number is:"+num1+"\nSecond Number is:"+num2);//display on output screen
           System.out.println("Subtraction is:"+Sub);//display on output screen
           t.close();
        }
   }