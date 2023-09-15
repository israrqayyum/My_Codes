class Shape{
  protected double area;
  Shape(double f){
    this.area=f;
  }
  public void cArea(){
    System.out.println("............Calculating area of shape............");
  }
  public void pArea(){
    System.out.println("Area: " + area);
  }
}

class Rectangle extends Shape{
  private 
  double width;
  double height;
  public Rectangle(double width, double height){
    super(0);
    this.width = width;
    this.height = height;
  }
  public void calculateArea(){
    super.cArea();
    area = width * height;
  }
}

class Circle extends Shape {
  private double radius;
  public Circle(double radius){
    super(0);
    this.radius = radius;
  }
  public void calculateArea(){
    super.cArea();
    area = Math.PI * radius * radius;
  }
}

public class Main {
  public static void main(String[] args) {
    Rectangle R=new Rectangle(5, 10);
    Circle C=new Circle(0000000);
    Shape S=new Shape(5555555);
    S.pArea();
    R.calculateArea();
    R.pArea();
    C.calculateArea();
    C.pArea();
  }
}