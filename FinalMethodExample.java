class Parent {
    final void display() {
        System.out.println("This is a final method in Parent class");
    }
}

class Child extends Parent {
   
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();   
    }
}
