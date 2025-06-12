package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        this(name, salary); // we don't need to do this
        // we can just do super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        super(name, salary);
        this.hireDate = LocalDate.now();
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", hireDate: " + hireDate;
    }
}
