class DivideByZeroException extends RuntimeException {

    public DivideByZeroException(String message) {
        super(message);
    }
}

public class EXCP {

    static void divide(int a, int b) {

        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }

        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        try {
            divide(10, 0);   // test case
        }
        catch (DivideByZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
