class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor called");
    }

    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super();
        System.out.println("Child constructor called");
    }

    void display() {
        System.out.println("Value of x using this: " + this.x);
        System.out.println("Value of x using super: " + super.x);
        super.show();
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
