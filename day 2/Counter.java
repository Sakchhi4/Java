public class Counter {

    static int count = 0;   // static variable

    // constructor
    Counter() {
        count++;
        System.out.println("Object Created. Count = " + count);
    }

    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Final Count = " + Counter.count);
    }
}
