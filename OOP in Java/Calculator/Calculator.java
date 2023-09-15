import java.util.Scanner;
public class Calculator {
  public int add(int x, int y) {
    return x + y;
  }
  public double add(double x, double y) {
    return x + y;
  }
  public int add(int x, int y, int z) {
    return x + y + z;
  }
  public int sub(int x, int y) {
    return x - y;
  }
  public double sub(double x, double y) {
    return x - y;
  }
  public int sub(int x, int y, int z) {
    return x - y - z;
  }  
  public int mul(int x, int y) {
    return x * y;
  }
  public double mul(double x, double y) {
    return x * y;
  }
  public int mul(int x, int y, int z) {
    return x * y * z;
  }
  public int div(int x, int y) {
    return x / y;
  }
  public double div(double x, double y) {
    return x / y;
  }
  public int div(int x, int y, int z) {
    return x / y / z;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator calculator = new Calculator();
    System.out.print("Enter Your Operation ('+' '-' '*' '/')");
    char ch=sc.next().charAt(0); 
    switch(ch){
      case '+':
      System.out.print("Press 1 for 2-Numbers Addition\nPress 2 for 2-doubleType-Numbers Addition\nPress 3 for 3-Numbers Addition\nEnter:");
      int s=sc.nextInt();
      switch(s){
        case 1:
        System.out.print("Enter two integers to add: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = calculator.add(num1, num2);
        System.out.println("Result: " + result1);
        break;
        case 2:
        System.out.print("Enter two doubles to add: ");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double result2 = calculator.add(num3, num4);
        System.out.println("Result: " + result2);    
        break;
        case 3:
        System.out.print("Enter three integers to add: ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int result3 = calculator.add(num5, num6, num7);
        System.out.println("Result: " + result3);
        break;
        default:
        System.out.println("You Entered Invalid Number");
      }
      break;
      case '-':
      System.out.print("Press 1 for 2-Numbers Subtraction\nPress 2 for 2-doubleType-Numbers Subtraction\nPress 3 for 3-Numbers Subtraction\nEnter:");
      int sm=sc.nextInt();
      switch(sm){
        case 1:
        System.out.print("Enter two integers to Subtract: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = calculator.sub(num1, num2);
        System.out.println("Result: " + result1);
        break;
        case 2:
        System.out.print("Enter two doubles to Subtract: ");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double result2 = calculator.sub(num3, num4);
        System.out.println("Result: " + result2);    
        break;
        case 3:
        System.out.print("Enter three integers to Subtract: ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int result3 = calculator.sub(num5, num6, num7);
        System.out.println("Result: " + result3);
        break;
        default:
        System.out.println("You Entered Invalid Number");
      }
      break;
      case '*':
      System.out.print("Press 1 for 2-Numbers Multiplication\nPress 2 for 2-doubleType-Numbers Multiplication\nPress 3 for 3-Numbers Multiplication");
      int smu=sc.nextInt();
      switch(smu){
        case 1:
        System.out.print("Enter two integers to Multiply: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = calculator.mul(num1, num2);
        System.out.println("Result: " + result1);
        break;
        case 2:
        System.out.print("Enter two doubles to Multiply: ");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double result2 = calculator.mul(num3, num4);
        System.out.println("Result: " + result2);    
        break;
        case 3:
        System.out.print("Enter three integers to Multiply: ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int result3 = calculator.mul(num5, num6, num7);
        System.out.println("Result: " + result3);
        break;
        default:
        System.out.println("You Entered Invalid Number");
      }
      break;
      case '/':
      System.out.print("Press 1 for 2-Numbers Division\nPress 2 for 2-doubleType-Numbers Division\nPress 3 for 3-Numbers Division\nEnter:");
      int sd=sc.nextInt();
      switch(sd){
        case 1:
        System.out.print("Enter two integers to Divide: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = calculator.div(num1, num2);
        System.out.println("Result: " + result1);
        break;
        case 2:
        System.out.print("Enter two doubles to Divide: ");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double result2 = calculator.div(num3, num4);
        System.out.println("Result: " + result2);    
        break;
        case 3:
        System.out.print("Enter three integers to Divide: ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int result3 = calculator.div(num5, num6, num7);
        System.out.println("Result: " + result3);
        break;
        default:
        System.out.println("You Entered Invalid Number");
      }
      break;
      default:
      System.out.println("You Entered Invalid Number");
    }
  }
}
