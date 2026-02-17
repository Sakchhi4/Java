public class EXCP {

    public static void main(String[] args) {

        try {

            int[] numbers = new int[5];
            int divisor = 0;

            for (int i = 0; i < numbers.length; i++) {
                int result = numbers[i] / divisor;   // causes ArithmeticException
                System.out.println(result);
            }

        } catch (ArithmeticException e) {

            throw new RuntimeException(
                    "Error: Division by zero occurred in loop", e);
        }
    }
}
