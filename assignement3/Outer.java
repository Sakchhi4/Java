class Outer {

    int a = 10;


    class Inner {
        void show() {
            System.out.println("Value of a is: " + a);
        }
    }

    public static void main(String[] args) {

        Outer obj = new Outer();          
        Outer.Inner in = obj.new Inner(); 

        in.show();
    }
}

