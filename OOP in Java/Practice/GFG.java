import java.io.*;
import java.util.*;

class GFG {
 
    public static void main(String[] args) throws FileNotFoundException
    {
 
        // Creating a file and reading from local repository
        File file = new File("C:\\test\\a.txt");
        Scanner inputFile = new Scanner(file);
        while(inputFile.hasNext()) {
            System.out.println(inputFile.nextLine());
        }
        inputFile.close();
    }
}
