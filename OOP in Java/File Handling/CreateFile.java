import java.io.*;// Import the IOException class to handle errors
public class CreateFile {
  public static void main(String[] args) {
    try{
      File myObj=new File("oop.txt");
      if (myObj.createNewFile()) {//built in function
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();//e.printStackTrace();
    }
  }
}