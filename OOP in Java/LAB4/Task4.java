/*
 * NAME:ISRAR QAYYUM
 * ID:F22605004
 * BATCH:CS-2022
 * SEMESTER:SPRING 2023
 * OBJECT ORIENTED PROGRAMMING LAB (2006)
 */
// Importing Scanner class from java.util package
import java.util.Scanner;
// Defining a class named Task4
public class Task4
{
 // Declaring a private instance variable named area
 private int area;
 // Constructor with one parameter to initialize area
 Task4(int area)
 {
    this.area=area;
 }

 // Public getter method to access the private instance variable area
 public int getArea()
 {
    return this.area;
 }

 // Public method to calculate the number of gallons of paint required
 public int calcGallons(int area)
 {
    int gallon=area/180; // Assuming one gallon of paint covers 180 square feet
    return gallon;
 }

 // Public method to calculate the number of hours of labor required
 public int calcTime(int gallons)
 {
    int time=gallons*8; // Assuming one gallon of paint requires 8 hours of labor
    return time;
 }

 // Public method to calculate the cost of paint required
 public int gallonCharges(int quantity)
 {
    int c=quantity*4000; // Assuming one gallon of paint costs Rs. 4000
    return c;
 }

 // Public method to calculate the cost of labor
 public int labourCharges(int time)
 {
   int c=time*200; // Assuming one hour of labor costs Rs. 200
   return c;
 }

 // Main method of the program
 public static void main(String args[])
 {
    // Creating an object of Scanner class to read user input
    Scanner sc=new Scanner(System.in);
    
    // Prompting the user to enter the area to be painted in square feet
    System.out.println("Enter space where you want to paint it(Area in Square Feets):");
    int space=sc.nextInt();
    
    // Creating an object of Task4 class with the entered area as parameter
    Task4 t=new Task4(space);
    
    // Calculating the number of gallons of paint required
    int gallons=t.calcGallons(space);
    
    // Calculating the number of hours of labor required
    int time=t.calcTime(gallons);
    
    // Calculating the cost of paint required
    int charges=t.gallonCharges(gallons);
    
    // Calculating the cost of labor
    int lcharges=t.labourCharges(time);
    
    // Displaying the number of gallons of paint required
    System.out.println("The total number of gallons of paint required:"+gallons);
    
    // Displaying the number of hours of labor required
    System.out.println("The hours of labor required:"+time);
    
    // Displaying the cost of labor
    System.out.println("The labor charges:"+lcharges);
    
    // Displaying the total cost of the paint job
    System.out.println("Total cost of the paint job:"+(charges+lcharges));
 }
}