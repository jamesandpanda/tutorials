package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", HireDate: " + hireDate;
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
        LocalDate today = LocalDate.now();
        Manager m = new Manager("James", 1, today);
        System.out.println(m.toString());
    }
}
