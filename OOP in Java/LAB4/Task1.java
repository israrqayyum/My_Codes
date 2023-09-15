/*
 * NAME:ISRAR QAYYUM
 * ID:F22605004
 * BATCH:CS-2022
 * SEMESTER:SPRING 2023
 * OBJECT ORIENTED PROGRAMMING LAB (2006)
 */

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Declaring a public class named Task1
public class Task1
{
    // Declaring a public static method named KineticEnergy
    public static void KineticEnergy(double mass,double velocity)
    {
        // Calculating the kinetic energy using the formula
        double KE=(0.5*(mass*(velocity*velocity)));
        
        // Printing the calculated kinetic energy to the console
        System.out.println("Kinetic Energy is: "+KE+" Joules");
    }
    
    // Declaring the main method of the program
    public static void main(String args[])
    {
      // Creating a new Scanner object to read input from the console
      Scanner sc=new Scanner(System.in);
      
      // Prompting the user to enter the mass of the object
      System.out.print("Enter Mass of Object in Kilograms:");
      double a=sc.nextDouble();
      
      // Prompting the user to enter the velocity of the object 
      System.out.print("Enter Velocity of Object:");
      double b=sc.nextDouble();
      
      // Calling the KineticEnergy method with the values entered by the user
      KineticEnergy(a,b);
    }
}
