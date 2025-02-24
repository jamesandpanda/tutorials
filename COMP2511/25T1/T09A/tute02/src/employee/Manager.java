package employee;

import java.time.LocalDateTime;

public class Manager extends Employee {
    private LocalDateTime hireDate;

    public Manager(String name, int salary, LocalDateTime hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        super(name, salary);
        this.hireDate = LocalDateTime.now();
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    // A setter here might not make too much sense.
    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " hireDate:" + hireDate;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        }

        // a type-check has already been performed through super.equals(), so we
        // know that other must be of type Manager if we are here
        Manager m = (Manager) other;

        // the only thing left to check for is the hire date.
        return hireDate.equals(m.hireDate);
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 1);
        System.out.println(e.toString());

        Manager m = new Manager("Jane", 2);
        System.out.println(m.toString());

        Employee e1 = new Employee("John", 1);
        Employee e2 = new Employee("John", 1);
        System.out.println(e1.equals(e2));

        LocalDateTime now = LocalDateTime.now();
        Manager m1 = new Manager("Jane", 2, now);
        Manager m2 = new Manager("Jane", 2, now);
        System.out.println(m1.equals(m2));
    }
}
