import java.util.Scanner;
public class Fibonacci{
  public static int fib(int a){
    if(a==0){
      return 0;
    }
    else if(a==1){
      return 1;
    }
    else{
     return fib(a-1) + fib(a-2);
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter End Number of Fibonacci Series:"); 
    int n=sc.nextInt();
    System.out.println("Fibonacci Series is:");
    for(int i=0;i<n;i++){
     System.out.println(fib(i));
    }
  }  
}