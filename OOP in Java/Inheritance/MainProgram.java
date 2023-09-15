import java.util.Scanner;
class Vehicle {
  private 
  String make;
  String model;
  int year;
  String color;
  public Vehicle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the make of the vehicle:");
    this.make=sc.nextLine();
    System.out.println("Enter the model of the vehicle:");
    this.model=sc.nextLine();
    System.out.println("Enter the year of the vehicle:");
    this.year=sc.nextInt();
    sc.nextLine();//consume newline character
    System.out.println("Enter the color of the vehicle:");
    this.color=sc.nextLine();
  }
  public void start(){
    System.out.println("****----Starting the vehicle****----");
  }
  public void stop(){
    System.out.println("****----Stopping the vehicle****----");
  }
  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public int getYear(){
        return year;
  }
  public String getColor(){
        return color;
  }
}

class Car extends Vehicle{
    private 
    int numDoors;
    int trunkCapacity;
    public Car(){
      super();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number of doors:");
      this.numDoors = scanner.nextInt();
      System.out.println("Enter the trunk capacity in liters:");
      this.trunkCapacity = scanner.nextInt();
    }

    public void openTrunk(){
      System.out.println("Opening the trunk.");
    }

    public void closeTrunk(){
      System.out.println("Closing the trunk.");
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }
}

class SportsCar extends Car {
    private boolean hasSpoiler;
    public SportsCar() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does the car have a spoiler? (true/false)");
        this.hasSpoiler = scanner.nextBoolean();
    }
    public void engageSport() {
        System.out.println("Engaging sport mode.");
    }
    public boolean hasSpoiler() {
        return hasSpoiler;
    }
}
class Sedan extends Car {
    private boolean hasSunroof;
    public Sedan() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does the car have a sunroof? (true/false)");
        this.hasSunroof = scanner.nextBoolean();
    }
    public void engageEco() {
        System.out.println("Engaging eco mode.");
    }
    public boolean hasSunroof() {
        return hasSunroof;
    }
}

public class MainProgram{
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println("Make: " + sportsCar.getMake());
        System.out.println("Model: " + sportsCar.getModel());
        System.out.println("Year: " + sportsCar.getYear());
        System.out.println("Color: " + sportsCar.getColor());
        System.out.println("Number of doors: " + sportsCar.getNumDoors());
        System.out.println("Trunk capacity: " + sportsCar.getTrunkCapacity() + " L");
        System.out.println("Has spoiler: " + sportsCar.hasSpoiler());
        Sedan sedan = new Sedan();
        System.out.println("Make: " + sedan.getMake());
        System.out.println("Model: " + sedan.getModel());
        System.out.println("Year: " + sedan.getYear());
        System.out.println("Color: " + sedan.getColor());
        System.out.println("Number of doors: " + sedan.getNumDoors());
        System.out.println("Trunk capacity: " + sedan.getTrunkCapacity() + " L");
        System.out.println("Has sunroof: " + sedan.hasSunroof());
    }
}