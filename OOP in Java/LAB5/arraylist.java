import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class arraylist{
    public static void main(String args[]){
       // ArrayList<Integer> list =new ArrayList<Integer>(); //correct    
       ArrayList<Double> list =new ArrayList<>();    
       ArrayList<Integer> list1=new ArrayList<>();
       // ArrayList <String> Israr =new ArrayList<>();
       list.add(10.0);
       list.add(20.0);
       list.add(30.0);
       System.out.println(list);
       double element=list.get(0);
       System.out.println(element);
       list.add(1,4.22); //means add new element in 1 location and the element that already in 1 location push forward
       System.out.println(list);
       list.set(0,232.3);
       System.out.println(list);
       list.remove(3); 
       System.out.println(list);
       int size=list.size();
       System.out.println(size);
       //loop
       for(int i=0;i<list.size();i++){
           System.out.println(list);
       }
       //sorting
       Collections.sort(list);
       System.out.println(list);
    }
}