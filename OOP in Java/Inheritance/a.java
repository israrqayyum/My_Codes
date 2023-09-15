import java.util.Scanner;
class Vehicle {
  private String make;
  private String model;
  private int year;
  private String color;
  
  public Vehicle(String make, String model, int year, String color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }
  
  public void start(){
    System.out.println("Starting the vehicle.");
  }
  
  public void stop(){
    System.out.println("Stopping the vehicle.");
  }
  
  public String getMake(){
    return make;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getYear() {
    return year;
  }
  
  public String getColor() {
    return color;
  }
}

class Car extends Vehicle {
  private int numDoors;
  private int trunkCapacity;
  
  public Car(String make, String model, int year, String color, int numDoors, int trunkCapacity) {
    super(make, model, year, color);
    this.numDoors = numDoors;
    this.trunkCapacity = trunkCapacity;
  }
  
  public void openTrunk() {
    System.out.println("Opening the trunk.");
  }

  public void closeTrunk() {
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
  
  public SportsCar(String make, String model, int year, String color, int numDoors, int trunkCapacity, boolean hasSpoiler) {
    super(make, model, year, color, numDoors, trunkCapacity);
    this.hasSpoiler = hasSpoiler;
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
  
  public Sedan(String make, String model, int year, String color, int numDoors, int trunkCapacity, boolean hasSunroof) {
    super(make, model, year, color, numDoors, trunkCapacity);
    this.hasSunroof = hasSunroof;
  }
  
  public void engageEco() {
    System.out.println("Engaging eco mode.");
  }
  
  public boolean hasSunroof() {
    return hasSunroof;
  }
}

public class a{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the make of the sports car:");
    String sportsCarMake = scanner.nextLine();
    System.out.println("Enter the model of the sports car:");
    String sportsCarModel = scanner.nextLine();
    System.out.println("Enter the year of the sports car:");
    int sportsCarYear = scanner.nextInt();
    scanner.nextLine(); // Consume newline character
    System.out.println("Enter the color of the sports car:");
    String sportsCarColor = scanner.nextLine();
    System.out.println("Enter the number of doors of the sports car:");
    int sportsCarNumDoors = scanner.nextInt();
    System.out.println("Enter the trunk capacity in liters of the sports car:");
    int sportsCarTrunkCapacity = scanner.nextInt();
    System.out.println("Does the sports car have a spoiler?: (true/false)");
    boolean sportsCarHasSpoiler = scanner.nextBoolean();
    SportsCar sportsCar = new SportsCar(sportsCarMake, sportsCarModel, sportsCarYear, sportsCarColor, sportsCarNumDoors, sportsCarTrunkCapacity, sportsCarHasSpoiler);

    System.out.println("Make: " + sportsCar.getMake());
    System.out.println("Model: " + sportsCar.getModel());
    System.out.println("Year: " + sportsCar.getYear());
    System.out.println("Color: " + sportsCar.getColor());
    System.out.println("Number of doors: " + sportsCar.getNumDoors());
    System.out.println("Trunk capacity: " + sportsCar.getTrunkCapacity() + " L");
    System.out.println("Has spoiler: " + sportsCar.hasSpoiler());
    
    System.out.println("Enter the make of the sedan:");
    String sedanMake = scanner.nextLine();
    System.out.println("Enter the model of the sedan:");
    String sedanModel = scanner.nextLine();
    System.out.println("Enter the year of the sedan:");
    int sedanYear = scanner.nextInt();
    scanner.nextLine(); // Consume newline character
    System.out.println("Enter the color of the sedan:");
    String sedanColor = scanner.nextLine();
    System.out.println("Enter the number of doors of the sedan:");
    int sedanNumDoors = scanner.nextInt();
    System.out.println("Enter the trunk capacity in liters of the sedan:");
    int sedanTrunkCapacity = scanner.nextInt();
    System.out.println("Does the sedan have a sunroof?: (true/false)");
    boolean sedanHasSunroof = scanner.nextBoolean();
    Sedan sedan = new Sedan(sedanMake, sedanModel, sedanYear, sedanColor, sedanNumDoors, sedanTrunkCapacity, sedanHasSunroof);
    
    System.out.println("Make: " + sedan.getMake());
    System.out.println("Model: " + sedan.getModel());
    System.out.println("Year: " + sedan.getYear());
    System.out.println("Color: " + sedan.getColor());
    System.out.println("Number of doors: " + sedan.getNumDoors());
    System.out.println("Trunk capacity: " + sedan.getTrunkCapacity() + " L");
    System.out.println("Has sunroof: " + sedan.hasSunroof());
    scanner.close();
  }
}


