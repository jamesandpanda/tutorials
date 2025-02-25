package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // It probably doesn't make sense to include this.
    public void setHireDate(LocalDate hireDate) {
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

        Manager m = (Manager) other;
        return hireDate.equals(m.hireDate);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Joe", 1);
        System.out.println(m1.toString());

        String s1 = new String("Jane");
        Employee e1 = new Employee(s1, 2);
        System.out.println(e1.toString());

        String s2 = new String("Jane");
        Employee e2 = new Employee(s2, 2);
        System.out.println(e1.equals(e2));
    }
}
