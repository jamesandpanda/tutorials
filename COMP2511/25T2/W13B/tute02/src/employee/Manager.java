package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        this(name, salary);
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
        return super.toString() + " hireDate: " + hireDate;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        }

        // IMPORTANT: all checks in super.equals(...) have been done.
        // this includes the .getClass() check, which would have checked if the
        // other object is a Manager, even if the code is in the Employee class.

        Manager m = (Manager) other;
        // Since name and salary have already been checked in super.equals(...) we
        // only need to check the hire date.
        return hireDate.equals(m.getHireDate());
    }
}
