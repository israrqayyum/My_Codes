import java.util.Scanner;
public class Elements{
   private 
   String name;
   int number;                   
   String symbol;                
   double mass;                  
   int period;                   
   int group;    
   //class data members
   Elements(String n,int number,String symbol,double mass,int period,int group) 
    {//parametrized constructor
     this.name=n;
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
    public static void main(String args[])
    {
      /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter Object Number to Display Elements Details: ");
        int s=sc.nextInt();
        setElements elements=new setElements();
        switch(s) 
        {
          case 1: 
            elements.E1.display();
            break;
        case 2:
            elements.E2.display();
            break;
        case 3:
            elements.E3.display();
            break;
        case 4:
            elements.E4.display();
            break;
        case 5:
            elements.E5.display();
            break;
        case 6:
            elements.E6.display();
            break;
        case 7:
            elements.E7.display();
            break;
        case 8:
            elements.E8.display();
            break;
        case 9:
            elements.E9.display();
            break;
        case 10:
            elements.E10.display();
            break;
        default:
            System.out.println("Invalid object number!");
        char s=sc.next().charAt(0);
        }*/
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Atomic Symbol to Display Element Details: ");
    String symbol=sc.nextLine();
    setE obj=new setE();
    boolean found=false;
    Elements element=null;
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
            obj.E10.display();//Or Second Method without class varaible and found case;direct access
            break;
            
        default: System.out.println("Element not found!");
            break;
    }
    if (found)
    {
        element.display();
    }
   }

   public void display()
    {
        System.out.println("Name of Element:"  +this.name);
        System.out.println("Number of Element:"+this.number);
        System.out.println("Symbol of Element:"+this.symbol);
        System.out.println("Mass of Element:"  +this.mass);
        System.out.println("Period of Element:"+this.period);
        System.out.println("Group of Element:" +this.group);
    }
}
class SetE
 {
  Elements E1 = new Elements("Hydrogen" , 1,  "H",  1.008,  1, 1);
  Elements E2 = new Elements("Helium"   , 2,  "He", 4.003,  1, 18);
  Elements E3 = new Elements("Lithium"  , 3,  "Li", 6.941,  2, 1 );
  Elements E4 = new Elements("Beryllium", 4,  "Be", 9.012,  2, 2 );
  Elements E5 = new Elements("Carbon"   , 6,  "C",  12.011, 2, 14);
  Elements E6 = new Elements("Nitrogen" , 7,  "N",  14.007, 2, 15);
  Elements E7 = new Elements("Oxygen"   , 8,  "O",  15.999, 2, 16);
  Elements E8 = new Elements("Fluorine" , 9,  "F",  18.998, 2, 17);
  Elements E9 = new Elements("Sodium"   , 11, "Na", 22.990, 3, 1 );
  Elements E10 =new Elements("Chlorine" , 17, "Cl", 35.453, 3, 17);
 }
  // public static void main(String[] args) {
        // ArrayList<Element> elements = new ArrayList<>();
        // elements.add(new Element("Hydrogen", 1, "H", 1.008, 1, 1));
        // elements.add(new Element("Helium", 2, "He", 4.003, 1, 18));
        // elements.add(new Element("Lithium", 3, "Li", 6.941, 2, 1));
        // elements.add(new Element("Beryllium", 4, "Be", 9.012, 2, 2));
        // elements.add(new Element("Carbon", 6, "C", 12.011, 2, 14));
        // elements.add(new Element("Nitrogen", 7, "N", 14.007, 2, 15));
        // elements.add(new Element("Oxygen", 8, "O", 15.999, 2, 16));
        // elements.add(new Element("Fluorine", 9, "F", 18.998, 2, 17));
        // elements.add(new Element("Sodium", 11, "Na", 22.990, 3, 1));
        // elements.add(new Element("Chlorine", 17, "Cl", 35.453, 3, 17));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Atomic Symbol to Display Element Details: ");
        // String symbol = sc.nextLine();
        // boolean found = false;
        // for (Element e : elements) {
        // if (e.getSymbol().equals(symbol)) {
        // e.display();
        // found = true;
        // break;
        // }
        // }
        // if (!found) 
        // {
        // System.out.println("Element not found!");
        // }