public class logn{
  public static int calc(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    if(n%2==0){
      return calc(x,n/2)*calc(x,n/2);
    }
    else{
      return calc(x,n/2)*calc(x,n/2)*x;
    }
  }
  public static void main(String args[]){
    int x=2,y=5;
    int c=calc(x,y);
    System.out.println(c);
  }
}