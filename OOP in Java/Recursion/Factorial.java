public class Factorial{
  public static int calcfac(int n){
    if(n==0 || n==1){
      return 1;
    }
    int a=n*calcfac(n-1);
    return a;
  }
  public static void main(String args[]){
    int n=5;
    int s=calcfac(n);
    System.out.println(s);
  }
}