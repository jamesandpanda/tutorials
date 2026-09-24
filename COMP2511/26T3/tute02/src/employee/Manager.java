package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate; // simplifying assumption that the hire date
    // will not change, so I don't write a setter

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary); // refers to the constructor for Employee that takes in name and salary
        // which does the job of initialising those two variables
    
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now()); // this refers to the constructor taking
        // three arguments above

        // this(...) refers to another constructor inside of this class
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        // super.toString() gets the implementation done in the Employee class

        return super.toString() + ", hireDate: " + hireDate;
    }

    @Override
    public boolean equals(Object other) {
        // you can always follow this structure when overriding equals
        // check if super.equals returns false, then check the new fields

        if (!super.equals(other)) {
            return false;
        }

        Manager m = (Manager) other;
        return hireDate.equals(m.hireDate);
    }
}
