import java.util.*;
// create a public class named Find_Maximum_Number
public class Find_Maximum_Number
{   
    // create a main method that takes in user input
    public static void main(String[] args)
    {        
        // create a Scanner object to read user input
        Scanner sc=new Scanner(System.in); 
        // prompt the user to enter three numbers to find the maximum
        System.out.println("Enter Three Numbers to find which one is Maximum");   
        // read in the user's input for the three numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // compare the three numbers to find the maximum and print out the result
        if(a>b)
        { 
            if(a>c)
            {
                System.out.println(a+" is Maximum Number");
            } 
        }
        else if(b>c)
        {
            System.out.println(b+" is Maximum Number");
        }
        else
        {    
            System.out.println(c+" is Maximum Number");
        }
    }
}
