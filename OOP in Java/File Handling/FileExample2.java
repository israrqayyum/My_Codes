import java.io.*;
class FileExample2{
    public static void main(String[] args) {
       java.util.Scanner keyboard=new java.util.Scanner(System.in);
       
       PrintWriter israr = null;
       try{
          israr=new PrintWriter(new FileOutputStream("Israr.txt"));
          
       }
       catch(FileNotFoundException e)
       {
           System.out.println("Error opening the file out.txt. "+ e.getMessage());
           System.exit(0);
           e.printStackTrace();
       }
       System.out.println("Enter three lines of text:");
       String line = null;
       int count;
       for(count=1;count<=3;count++){
           line = keyboard.nextLine();
           israr.println(count + " " + line);
       }
       israr.close();
       System.out.println("... written to out.txt.");
       keyboard.close();
    }
}
