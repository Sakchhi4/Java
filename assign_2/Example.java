class Example {


    static String college = "CSE";

   
    int rollNo;

  
    void display() {
        System.out.println("College: " + college);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {

    
        Example s1 = new Example();

        
        s1.rollNo = 101;

        s1.display();
    }
}
