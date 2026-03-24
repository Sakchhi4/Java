class Employee {
    String name;
    float baseSalary;

    Employee(String name, float baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    float calculateSalary() {
        return baseSalary + (baseSalary * 0.05f); 
    }
}

class Manager extends Employee {

    Manager(String name, float baseSalary) {
        super(name, baseSalary);
    }

    float calculateSalary() {
        return super.calculateSalary() + 2000f; 
    }
}

class Executive extends Manager {

    Executive(String name, float baseSalary) {
        super(name, baseSalary);
    }

    float calculateSalary() {
        return super.calculateSalary() + (baseSalary * 0.10f);
    }
}

public class main_2 {
    public static void main(String[] args) {

        Employee e = new Employee("Alice", 10000f);
                System.out.printf("%.2f\n", e.calculateSalary());

        Employee m = new Manager("Bob", 10000f);
          System.out.printf("%.2f\n", m.calculateSalary());

        Employee ex = new Executive("Charlie", 10000f);
        System.out.printf("%.2f\n", ex.calculateSalary());
    }
}
