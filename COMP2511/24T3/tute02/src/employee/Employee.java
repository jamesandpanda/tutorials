package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * A constructor that initialises the employee's name and salary
     * 
     * @param name    the full name of the employee   
     * @param salary  the yearly salary of the employee
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * A getter for the employee's name.
     * 
     * @return the employee's full name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // getClass().getName() looks like employee.Employee for this class
        return getClass().getName() +  "name: " + name + ", salary: " + salary;
    }

    public boolean equals(Object other) {
        if (this == other) {
            // If this object is at the same memory address as the other object,
            // they are definitely equal
            return true;
        } else if (other == null) {
            // This object must be non-null (as the equals method cannot be invoked
            // on null), so this object is definitely equal to null
            return false;
        } else if (getClass() != other.getClass()) {
            // If this object is not the same class as the other object, they are
            // definitely not equal
            return false;
        }

        // Because the type-check has already been performed above, I know that
        // other is an Employee, so it is safe to typecast.
        Employee oe = (Employee) other;

        // String is a non-primitive type, so make sure to use .equals() and NOT ==,
        // otherwise it will do the address comparison again.
        return name.equals(oe.name) && salary == oe.salary;
    }
}
