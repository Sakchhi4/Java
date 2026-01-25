class StudentStatic {

    
    static String collegeCode = "CSE2025";

   
    int rollNo;


    StudentStatic(int r) {
        rollNo = r;
    }

    void display() {
        System.out.println("Roll No: " + collegeCode + rollNo);
    }

    public static void main(String args[]) {

        StudentStatic s1 = new StudentStatic(101);
        StudentStatic s2 = new StudentStatic(102);

        s1.display();
        s2.display();
    }
}
