final class FinalDemo {

    final int MAX_VALUE = 100;

    final void display() {
        System.out.println("Final variable value: " + MAX_VALUE);
        System.out.println("This is a final method inside a final class");
    }
}

public class FinalKeywordExample {

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}
