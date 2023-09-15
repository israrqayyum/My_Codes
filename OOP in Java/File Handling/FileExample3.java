import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class FileExample3{
    public static void main(String args[]){
       String file=null;
       try{
         java.util.Scanner sc=new java.util.Scanner(System.in);
         System.out.println("Enter File Name:");
         file=sc.next();
         BufferedReader s=new BufferedReader(new FileReader(file));
         String line=null;
         line=s.readLine();//readLine
         System.out.println("The first line in "+file+" is:");
         System.out.println(line);
         s.close();
       }
       catch(FileNotFoundException e){
           System.out.println("File "+file+" not found"); 
       }
       catch(IOException e){
           System.out.println("Error reading from "+file+" file"); 
       }
  }
}