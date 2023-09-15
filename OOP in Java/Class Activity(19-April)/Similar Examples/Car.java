import java.util.Scanner;
public class Car{
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String engine;
    Car(String brand, String model,int year,String color,int price,String engine){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.engine=engine;
    }
    
    public static void main(String args[]){
        carDealer car=new carDealer();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Object Number to Display Car Info:");
        int s=sc.nextInt();
        switch(s){
            case 1:
                car.c1.display();
                break;
            case 2:
                car.c2.display();
                break;
            case 3:
                car.c3.display();
                break;
            case 4:
                car.c4.display();
                break;
            case 5:
                car.c5.display();
                break;
            case 6:
                car.c6.display();
                break;
            case 7:
                car.c7.display();
                break;
            case 8:
                car.c8.display();
                break;
            case 9:
                car.c9.display();
                break;
            case 10:
                car.c10.display();
                break;
            default:
                System.out.println("Invalid Object Number");
            }
        System.out.print("Enter Brand to Display its latest Car Info:");
        String b;
        sc.nextLine();
        b=sc.nextLine();
        switch(b)
        {
            case "Toyota":
                car.c1.display();
                break;
            case "Honda":
                car.c2.display();
                break;
            case "Ford":
                car.c3.display();
                break;
            case "Tesla":
                car.c4.display();
                break;
            case "Chevrolet":
                car.c5.display();
                break;
            case "BMW":
                car.c6.display();
                break;
            case "Mercedes-Benz":
                car.c7.display();
                break;
            case "Audi":
                car.c8.display();
                break;
            case "Porche":
                car.c9.display();
                break;
            case "Mazda":
                car.c10.display();
                break;
            default:
                System.out.println("Invalid Brand");
        }
    }
    public void display()
    {
        System.out.println("--------Brand--------\n\t"+this.brand);
        System.out.println("--------Model--------\n\t"+this.model);
        System.out.println("--------Year---------\n\t"+this.year);
        System.out.println("--------Color--------\n\t"+this.color);
        System.out.println("--------Price--------\n\t$"+this.price);
        System.out.println("--------Engine-------\n\t"+this.engine);
    }
}
class carDealer{
    Car c1=new Car("Toyota",       "Camry",   2022, "Red",    28000,  "2.5-liter 4-Cylinder"                    );
    Car c2=new Car("Honda",        "Civic",   2023, "Black",  24000,  "1.5-liter turbocharged 4-Cylinder"       );
    Car c3=new Car("Ford",         "Mustang", 2021, "Blue",   35000,  "2.3-liter EcoBoost 4-Cylinder"           );
    Car c4=new Car("Tesla",        "Model S", 2023, "White",  80000,  "Electric"                                );
    Car c5=new Car("Chevrolet",    "Corvette",2022, "Yellow", 70000,  "6.2-liter V8"                            );
    Car c6=new Car("BMW",          "5 Series",2021, "Silver", 55000,  "2.0-liter turbocharged 4-Cylinder"       );
    Car c7=new Car("Mercedes-Benz","S-Class", 2023, "Black",  100000, "3.0-liter inline-6 hybrid"               );
    Car c8=new Car("Audi",         "Q5",      2022, "Gray",   45000,  "2.0-liter turbocharged 4-Cylinder"       );
    Car c9=new Car("Porche",       "911",     2021, "Red",    100000, "3.0-liter twin-turbocharged flat-six"    );
    Car c10=new Car("Mazda",       "CX-5",    2023, "Blue",   30000,  "2.5-liter 4-Cylinder"                    );
}