import java.util.*;
public class linear_Searching_using_Methods{
  public static void main(String []args){
    int array[]=new int[5];
    int a;
    System.out.println("Enter Array of 5-Elements");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
     array[i]=sc.nextInt();
    System.out.print("You Entered Array is:");
    for(int i=0;i<5;i++)
     System.out.print(array[i]+" ");
    System.out.println("");
    System.out.print("Entered Number that you Find from Array:");
    a=sc.nextInt();
    int s=func(array,a);
    if(s==-1)
    System.out.println("Number Not Find");
    else
    System.out.println("Found on Index:"+s);
  }
  public static int func(int x[],int m){
    for(int i=0;i<5;i++){
     if(x[i]==m){
     return i;
     }
    }
    return -1;
  }
}
