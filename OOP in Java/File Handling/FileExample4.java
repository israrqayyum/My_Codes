import java.io.*;
class FileExample4{
    public static void main(String args[]){
       String file=null;
       try{
         java.util.Scanner sc=new java.util.Scanner(System.in);
         System.out.println("Enter File Name:");
         file=sc.next();
         BufferedReader inputStream=new BufferedReader(new FileReader(file));
         
         String line=null;
         line=inputStream.readLine();
       
         while(line!=null){
             System.out.println(line);//bscs
             line=inputStream.readLine();
         }
         inputStream.close();
       }
       catch(FileNotFoundException e){
           System.out.println("File "+file+" not found"); 
       }
       catch(IOException e){
           System.out.println("Error reading from "+file+" file"); 
       }
  }
}