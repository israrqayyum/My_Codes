public class sumNum{
  public static void func(int a,int b,int sum){
    if(a==b){
      sum+=a;
      System.out.println(sum);
      return;
    }
    sum+=a;
    func(a+1,b,sum);
  }
  public static void main (String args[]){
    func(1,5,0);
  }
}