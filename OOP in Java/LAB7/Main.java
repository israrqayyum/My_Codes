import java.util.Scanner;

class SimpleCalculator {
    public double add(int x, int y) {
        return x + y;
    }

    public double subtract(int x, int y) {
        return x - y;
    }

    public double multiply(int x, int y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Cannot divide by Zero.");
        }
    }
}

class AdvancedCalculator extends SimpleCalculator {
    public double exponent(int base, int power) {
        return Math.pow(base, power);
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

class DerivativeCalculator extends AdvancedCalculator {
    public double calculatePi(double pivarg) {
        return pivarg * Math.PI;
    }

    public double calculateDerivative(double coefficient, double exponent, double x) {
        return coefficient * exponent * Math.pow(x, exponent - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        double result = calculator.add(x, y);
        System.out.println("Addition: " + result);

        result = calculator.subtract(x, y);
        System.out.println("Subtraction: " + result);

        result = calculator.multiply(x, y);
        System.out.println("Multiplication: " + result);

        result = calculator.divide(x, y);
        System.out.println("Division: " + result);
     
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        result = advancedCalculator.exponent(base, power);
        System.out.println("Exponent: " + result);

        System.out.print("Enter a number for square root: ");
        double number = scanner.nextDouble();

        result = advancedCalculator.squareRoot(number);
        System.out.println("Square Root: " + result);

        DerivativeCalculator derivativeCalculator = new DerivativeCalculator();

        System.out.print("Enter a value for pi: ");
        double piValue = scanner.nextDouble();

        result = derivativeCalculator.calculatePi(piValue);
        System.out.println("Pi calculation: " + result);

        System.out.print("Enter the coefficient: ");
        double coefficient = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        System.out.print("Enter the value of x: ");
        double xValue = scanner.nextDouble();

        result = derivativeCalculator.calculateDerivative(coefficient, exponent, xValue);
        System.out.println("Derivative calculation: " + result);

        scanner.close();
    }
}