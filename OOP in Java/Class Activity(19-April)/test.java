import java.util.Scanner;
public class test{
   private String name;
   private int number;                   
   private String symbol;                
   private double mass;                  
   private int period;                   
   private int group;    
   test(String name,int number,String symbol,double mass,int period,int group) 
    {
     this.name=name;
     this.number=number;
     this.symbol=symbol;
     this.mass=mass;
     this.period=period;
     this.group=group;
    }
    public String getName()
    {
        return this.name;
    }
    public int getNumber()
    {
        return this.number;
    }
    public String getSymbol()
    {
        return this.symbol;
    }
    public double getMass()
    {
      return this.mass;
    }
    public int getPeriod()
    {
        return this.period;
    }
    public int getGroup()
    {
        return this.group;
    }
     @Override
      public String toString() {
      return
           "Name of Element:"   + this.name   + "\n" +
           "Number of Element:" + this.number + "\n" +
           "Symbol of Element:" + this.symbol + "\n" +
           "Mass of Element:"   + this.mass   + "\n" +
           "Period of Element:" + this.period + "\n" +
           "Group of Element:"  + this.group  + "\n";
    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Atomic Symbol to Display Element Details: ");
     String symbol=sc.nextLine();
     setElements obj=new setElements();
     boolean found=false;
     Element element=null;
     switch (symbol)
     {
        case "H": 
            element = obj.E1; 
            found = true; 
            break;
        case "He":
            element = obj.E2; 
            found = true; 
            break;
        case "Li":
            element = obj.E3; 
            found = true; 
            break;
        case "Be": 
            element = obj.E4; 
            found = true; 
            break;
        case "C":
            element = obj.E5;
            found = true;
            break;
        case "N": 
            element = obj.E6; 
            found = true; 
            break;
        case "O":
            element = obj.E7;
            found = true; 
            break;
        case "F": 
            element = obj.E8;
            found = true;
            break;
        case "Na":
            element = obj.E9;
            found = true;
            break;
        case "Cl": 
            element=obj.E10;
            break;
        default: System.out.println("Element not found!");
            break;
     }
     if (found)
     {
        element.toString();
     }
  } 
}
class setElements
 {
  Element E1 = new Element("Hydrogen" , 1,  "H",  1.008,  1, 1);
  Element E2 = new Element("Helium"   , 2,  "He", 4.003,  1, 18);
  Element E3 = new Element("Lithium"  , 3,  "Li", 6.941,  2, 1 );
  Element E4 = new Element("Beryllium", 4,  "Be", 9.012,  2, 2 );
  Element E5 = new Element("Carbon"   , 6,  "C",  12.011, 2, 14);
  Element E6 = new Element("Nitrogen" , 7,  "N",  14.007, 2, 15);
  Element E7 = new Element("Oxygen"   , 8,  "O",  15.999, 2, 16);
  Element E8 = new Element("Fluorine" , 9,  "F",  18.998, 2, 17);
  Element E9 = new Element("Sodium"   , 11, "Na", 22.990, 3, 1 );
  Element E10 =new Element("Chlorine" , 17, "Cl", 35.453, 3, 17);
 }