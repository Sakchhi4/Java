abstract class Calculator {

    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract int modulus(int a, int b);
    abstract double divide(int a, int b);

    void info() {
        System.out.println("Calculator Application using Abstract Class");
    }
}

class AdvancedCalculator extends Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int modulus(int a, int b) {
        return a % b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return (double) a / b;
    }
}

public class AbstractCalculatorExample {

    public static void main(String[] args) {

        Calculator c = new AdvancedCalculator();

        c.info();

        System.out.println("Addition: " + c.add(20, 10));
        System.out.println("Subtraction: " + c.subtract(20, 10));
        System.out.println("Multiplication: " + c.multiply(20, 10));
        System.out.println("Division: " + c.divide(20, 10));
        System.out.println("Modulus: " + c.modulus(20, 10));
    }
}

