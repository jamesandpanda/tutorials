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

    @Override
    public String toString() {
        return super.toString() + ", hireDate:" + hireDate;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        }
        // The type-check in super.toString() will actually check that the other
        // object is of type Manager, NOT Employee even though it is called from
        // the employee class!

        // By now, I know that I am of type Manager
        Manager m = (Manager) other;
        // super.equals() has already checked that the name and salaries are equal,
        // so the only thing to check now is the hire date.
        return hireDate.equals(m.hireDate);
    }

    public static void main(String[] args) {
        // So that we can construct managers with the same hire date
        LocalDate current = LocalDate.now();

        Employee e1 = new Employee("Joe", 1);
        System.out.println(e1.toString());

        // Manager m1 = new Manager("Jill", 2) is also valid, as we have defined
        // a constructor that takes in two arguments. That constructor will initialise
        // the hireDate to be the current time
        Manager m1 = new Manager("Jill", 2, current);
        System.out.println(m1.toString());

        Employee e2 = new Employee("Joe", 1);

        // This should be true, as the name and salary are the same
        System.out.println(e1.equals(e2));

        Manager m2 = new Manager("Jill", 2, current);
        // This should be true, as the name and salary are the same
        System.out.println(m1.equals(m2));
    }
}
