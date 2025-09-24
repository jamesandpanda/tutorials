package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * A constructor for the Manager class.
     *
     * @param name - the full name of the manager
     * @param salary - the salary of the manager in AUD
     * @param hireDate - the day that the manager was hired
     */
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

    @Override
    public String toString() {
        return super.toString() + " Hire Date: " + hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Manager other = (Manager) obj;
        return hireDate.equals(other.hireDate);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Alexa", 1, LocalDate.now());
        Manager m2 = new Manager("Alexa", 1, LocalDate.now());
        System.out.println(m1.equals(m2));
    }
}
