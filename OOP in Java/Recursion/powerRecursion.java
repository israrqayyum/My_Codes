public class powerRecursion{
  public static int pow(int x,int y){
    if(y==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int xpownm1=pow(x,y-1);
    int xpow=x*xpownm1;
    return xpow;
  }
  public static void main(String args[]){
    int x=2,y=5;
    int c=pow(x,y);
    System.out.println(c);
  }
}