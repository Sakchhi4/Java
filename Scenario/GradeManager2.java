import java.util.ArrayList;

public class GradeManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                s.displayStudentDetails();
            }
        }
    }
}
