import java.util.Scanner;
public class task2
{
    // Declaring three private instance variables of the classe
    private String BookID;
    private int pages;
    private int price;
    
 
    // Declaring a public method named setBook that takes in BookID, pages, and price as parameters and sets the corresponding instance variables
    public void setBook(String BookID,int pages,int price){
         this.BookID=BookID;
         this.pages=pages;
         this.price=price;
    }
    
    
    
    
    
  
    
    // Declaring a public method named show that prints out the BookID, pages, and price of the book
    // public void show()
    // {
        // System.out.println("BookID:"+BookID);
        // System.out.println("Book Pages:"+getPages());
        // System.out.println("Book Price:"+getPrice());
    // }
    
    // Declaring the main method of the program
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        task2 t=new task2("Physics",23,5);
        
       
    }
}
