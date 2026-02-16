public class Main {
    public static void main(String[] args) {

        GradeManager manager = new GradeManager();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(88);

        s2.addGrade(75);
        s2.addGrade(80);
        s2.addGrade(70);

        System.out.println("\nAll Students:");
        manager.displayAllStudents();

        System.out.println("\nSearching for Alice:");
        Student found = manager.findStudentByName("Alice");

        if (found != null) {
            found.displayStudentDetails();
        } else {
            System.out.println("Student not found.");
        }
    }
}
