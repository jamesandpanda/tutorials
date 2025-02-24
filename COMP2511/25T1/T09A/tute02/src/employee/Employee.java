package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     *
     * @param name   The full name of the employee.
     * @param salary The employee's yearly salary in dollars.
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * A getter for the employee's name
     *
     * @return the employee's full name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name
     *
     * @param name The employee's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     *
     * @return The employee's yearly salary in dollars.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the employee's salary.
     *
     * @param salary The employee's yearly salary in dollars.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // roughly, I want my string to look like
        // Employee name:[name], salary:[salary]

        return getClass().getName() + " name:" 
            + name + " salary:" + salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        }

        Employee e = (Employee) other;
        return salary == e.salary && name.equals(e.name);
    }
}