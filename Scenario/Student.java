import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    List<Double> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return grades.size() == 0 ? 0 : sum / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println("--------------------");
    }
}
