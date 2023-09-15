import java.time.*;
public class c{
    public static int year(){
        return 2004;
    }
    public static int getyear(){
        int currentyear=YearMonth.now().getYear();
        System.out.println("Year: "+currentyear);
        return currentyear-year();
    }
    public static void main(String args[]){
      
        int ss=getyear();
        System.out.println("Years difference: "+ss);

    }
}
