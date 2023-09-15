import java.util.Scanner;
public class Bubble_Sort{
  public static void main(String []args){
    int array1[]=new int[5];
    System.out.println("Enter 5-Elemnts of Un-Sorted Array");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
     array1[i]=sc.nextInt();
    System.out.print("Unsorted Array:");
    for(int i=0;i<5;i++)
      System.out.print(array1[i]+" ");
    System.out.println();
    //bubble Sort
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(array1[j]<array1[i]){
          int temp=array1[i];
          array1[i]=array1[j];
          array1[j]=temp;
        }
      }            
    }
    System.out.print("Sorted Array is:");
    for(int i=0;i<5;i++)
    System.out.print(array1[i]+" ");
  }
}
 