class assign {

    String name;
    int rollNo;
    String division;

  
    assign(String n, int r, String d) {
        name = n;
        rollNo = r;
        division = d;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Division: " + division);
    }

    public static void main(String args[]) {
        assign s1 = new assign("Sakchhi", 20, "B");
        s1.display();
    }
}

