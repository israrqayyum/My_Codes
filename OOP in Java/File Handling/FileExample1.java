import java.io.File;
import java.io.IOException;
class FileExample1{
    public static void main(String args[]) {
        File s = new File("Israr.txt");
        try
        {
            s.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace(); //printStackTrace();
        }
    
    }
}