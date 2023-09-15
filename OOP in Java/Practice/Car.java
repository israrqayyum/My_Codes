class Car { 
public String make; 
protected int weight; 
private String color;
public Car (String make, int weight, String color){ 
this.make = make; 
this.weight = weight; 
this.color = color; 
}
public Car () { 
this("unknown", -1, "white"); 
}
}
class ElectricCar extends Car { 
private int rechargeHour;
public ElectricCar() { 
this(10); 
}
public ElectricCar(int charge){ 
super(); 
rechargeHour = charge; 
}
}
class TestMain { 
public static void main (String[] args){
Car myCar1, myCar2; 
ElectricCar myElec1, myElec2;
myCar1 = new Car(); 
myCar2 = new Car("Ford", 1200, "Green");
myElec1 = new ElectricCar(); 
myElec2 = new ElectricCar(15);
}
}