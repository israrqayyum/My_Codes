public class NaturalNumbers{
  public static void num(int a){
  if(a==6){
    return; //return statement mean delete current layer and goes to previous layer
  }
  System.out.println(a);
  num(a+1); //recursive call
  }
  public static void main(String args[]){
  int n=1;
  num(n);
  }
}