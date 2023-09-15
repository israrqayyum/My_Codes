interface MyShape {
    void calcPerimeter(double x, double y); 
    //Calculates the perimeter of the shape
    void calcArea(double x, double y); 
    //Calculates the area of the shape
}

class Square implements MyShape {
    @Override
    public void calcPerimeter(double x, double y) {
        double calc = 4 * x; 
        //Calculate perimeter for square (4 * side length)
        System.out.println("Perimeter is: " + calc); 
        //Print the calculated perimeter
    }
    
    @Override
    public void calcArea(double x, double y) {
        double calc = x * x; 
        //Calculate area for square (side length * side length)
        System.out.println("Area is: " + calc); 
        //Print the calculated area
    }
}

class Triangle implements MyShape {
    @Override
    public void calcPerimeter(double x, double y) {
        double calc = x + y + Math.sqrt(x * x + y * y); 
        //Calculate perimeter for triangle (sum of all sides)
        System.out.println("Perimeter is: " + calc);
        //Print the calculated perimeter
    }
    
    @Override
    public void calcArea(double x, double y) {
        double calc = 0.5 * x * y; 
        //Calculate area for triangle (0.5 * base * height)
        System.out.println("Area is: " + calc); 
        //Print the calculated area
    }
}

class Circle implements MyShape {
    @Override
    public void calcPerimeter(double x, double y) {
        double calc = 2 * Math.PI * x; 
        //Calculate perimeter for circle (2 * pi * radius)
        System.out.println("Perimeter is: " + calc); 
        //Print the calculated perimeter
    }
    
    @Override
    public void calcArea(double x, double y) {
        double calc = Math.PI * x * x; 
        //Calculate area for circle (pi * radius * radius)
        System.out.println("Area is: " + calc); 
        //Print the calculated area
    }
}

public class ShapeCalculation {
    public static void main(String args[]) {
        java.util.Scanner key = new java.util.Scanner(System.in);
        do {
            System.out.println("Enter Shape:");
            System.out.println("Press 1. Square");
            System.out.println("Press 2. Triangle");
            System.out.println("Press 3. Circle");
            System.out.println("Press 4. Exit");
            
            int num = key.nextInt();
            
            switch(num) {
                case 1:
                    System.out.println("Enter Length of Square:");
                    double sqLength = key.nextDouble();
                    
                    Square square = new Square();
                    square.calcPerimeter(sqLength, 0);
                    square.calcArea(sqLength, 0);
                    break;
                case 2:
                    System.out.println("Enter Base of Triangle:");
                    double triBase = key.nextDouble();
                    System.out.println("Enter Height of Triangle:");
                    double triHeight = key.nextDouble();
                    
                    Triangle triangle = new Triangle();
                    triangle.calcPerimeter(triBase, triHeight);
                    triangle.calcArea(triBase, triHeight);
                    break;
                case 3:
                    System.out.println("Enter Radius of Circle:");
                    double circleRadius = key.nextDouble();
                    
                    Circle circle = new Circle();
                    circle.calcPerimeter(circleRadius, 0);
                    circle.calcArea(circleRadius, 0);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while(true);
    }
}
