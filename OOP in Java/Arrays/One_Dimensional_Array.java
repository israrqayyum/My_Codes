import java.util.Scanner;
public class One_Dimensional_Array{  
    public static void main(String []args){
          int array[]=new int[] {2,3,5,21,34,54};
          /*we dont specify the size in index if we initalize it here.
          another way
          int array[]=new int[5];
          array[0]=1;
          array[1]=2;
          array[2]=3;
          array[3]=4;
          array[4]=5;
          */
          System.out.println("Array Elements are:");
          for(int i=0;i<6;i++){
              System.out.println(array[i]);
          }
          //if we want to print array without main function then we create method to print it.
          Scanner sc=new Scanner(System.in); 
          System.out.println("Enter Array1 6-Elements");
          int []array1=new int[6];
          for(int i=0;i<6;i++){
              array1[i]=sc.nextInt();
          }
          System.out.println("Output");
          for(int i=0;i<6;i++){
              System.out.println(array1[i]);
          }
    }
 }