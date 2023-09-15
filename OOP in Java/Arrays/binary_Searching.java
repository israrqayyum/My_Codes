import java.util.*;
public class binary_Searching{
  public static void main(String[]args){
    int array[]=new int[5];
    int a,loc=-1,start=0,end=5,mid;
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
    while(start<=end){
      mid=(start+end)/2;
      if(array[mid]==a){
       loc=mid;
       break;
      }
      else if(a<array[mid])
      end=mid--;
      else
      start=mid++;
    }
    if(loc==-1)
    System.out.println("Number Not Found");
    else
    System.out.println("Number is Found on Index:"+loc);
    }
  }