import java.util.Scanner;
public class Two_Dimensional_Array{
    public static void main(String[]args){
          int array[][]=new int[][] {{1,2},{3,4},{5,6}};
          int array1[][]=new int[2][5];
          System.out.println("Array is:");
          for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
              System.out.println(array[i][j]);         
            }
          }
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Two Dimensional Array");     
          for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
             array1[i][j]=sc.nextInt();
            }
          }
          System.out.println("You Entered two Dimensional Array is");
          for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
             System.out.println(array1[i][j]);
            }
          }
    }
}