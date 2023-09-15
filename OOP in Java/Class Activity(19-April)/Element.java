import java.util.Scanner;
public class Element{
  private String name;
  private int number;                   
  private String symbol;                
  private double mass;                  
  private int period;                  
  private int group;    
  //Declare private variables to store information about the element
  Element(String name,int number,String symbol,double mass,int period,int group){
    this.name=name;
    this.number=number;
    this.symbol=symbol;
    this.mass=mass;
    this.period=period;
    this.group=group;
    //Define a constructor for the Element class
  }
  //Accessor Methods
  public String getName(){
    return this.name;
  }
  public int getNumber(){
    return this.number;
  }
  public String getSymbol(){
    return this.symbol;
  }
  public double getMass(){
    return this.mass;
  }
  public int getPeriod(){
    return this.period;
  }
  public int getGroup(){
    return this.group;
  }
  @Override 
  public String toString(){
    return
    "Name of Element:"   + this.name   + "\n" +
    "Number of Element:" + this.number + "\n" +
    "Symbol of Element:" + this.symbol + "\n" +
    "Mass of Element:"   + this.mass   + "\n" +
    "Period of Element:" + this.period + "\n" +
    "Group of Element:"  + this.group  + "\n";
    //toString method that prints the element information 
  }
  //Main Method
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Atomic Symbol to Display Element Details: ");
    String symbol=sc.nextLine();
    setElements obj=new setElements();
    for(int i=0;i<10;i++){
      //If a match is found, print the details of the Element object and break out of the loop
      if(obj.E[i].getSymbol().equals(symbol)){
       System.out.println(obj.E[i].toString());
       break;
      }
    }
  }
}
class setElements{
  Element []E=new Element[10];
  //Define an array of Element objects
  setElements(){
    E[0] = new Element("Hydrogen" , 1 , "H" , 1.008  , 1 , 1);
    E[1] = new Element("Helium"   , 2 , "He", 4.003  , 1 , 18);
    E[2] = new Element("Lithium"  , 3 , "Li", 6.941  , 2 , 1);
    E[3] = new Element("Beryllium", 4 , "Be", 9.012  , 2 , 2);
    E[4] = new Element("Carbon"   , 6 , "C" , 12.011 , 2 , 14);
    E[5] = new Element("Nitrogen" , 7 , "N" , 14.007 , 2 , 15);
    E[6] = new Element("Oxygen"   , 8 , "O" , 15.999 , 2 , 16);
    E[7] = new Element("Fluorine" , 9 , "F" , 18.998 , 2 , 17);
    E[8] = new Element("Sodium"   , 11, "Na", 22.990 , 3 , 1);
    E[9] = new Element("Chlorine" , 17, "Cl", 35.453 , 3 , 17);
  }
}