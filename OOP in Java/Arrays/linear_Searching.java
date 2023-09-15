import java.util.*;
public class linear_Searching{
   public static void main(String []args){
   int array[]=new int[5];
   int a,loc=-1;
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
   for(int i=0;i<5;i++){
     if(array[i]==a){
     loc=i;
     }
   }
   if(loc==-1)
   System.out.println("Number Not Found");
   else
   System.out.println("Number is Found on Index:"+loc);
  }
}
