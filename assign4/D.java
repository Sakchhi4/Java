interface A {
    void show();
}

interface B extends A {
    void show();
}

interface C extends A {
    void show();
}

class D implements B, C {

    public void show() {
        System.out.println("Diamond problem solved using Interface in Java");
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
