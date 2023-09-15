import java.util.Scanner;
public class Grader
{
    private double testScores[];
    Grader(double a[]){
        this.testScores=a;
    }
    public double getLowestScore()
    {  
    for(int i=0;i<testScores.length;i++){
     for(int j=i+1;j<testScores.length;j++){
      if(testScores[i]>testScores[j]){
        double temp=testScores[j];
        testScores[i]=testScores[j];
        testScores[i]=temp;
      }
     }
     }
    double s=testScores[0];
    return s;
    }
    public double getAverage()
    {
        double sum=0;
        for(int i=0;i<testScores.length;i++)
        {
         sum+=testScores[i];
        }
        double avg=sum/testScores.length;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Courses:");
        int n=sc.nextInt();
        double []arr=new double[n];
        System.out.println("Enter marks of "+n+" Courses:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
        }
        Grader obj=new Grader(arr);
        double s=obj.getAverage();
        System.out.println("The Average of "+n+" Courses:"+s);
        double d=obj.getLowestScore();
        System.out.println("Lowest marks is:"+d);
    }
}
