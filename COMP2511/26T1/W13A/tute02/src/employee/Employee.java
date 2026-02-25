package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * ADD YOUR DESCRIPTION OF THE METHOD HERE
     *
     * @param name - the full name of the employee
     * @param salary - the salary of the employee in AUD
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the employee's name
     * 
     * @return The full name of the employee.
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
        return getClass().getSimpleName() + " name: " +
            name + " salary: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }

        Employee oth = (Employee) obj;
        return salary == oth.salary && name.equals(oth.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Bob", 0);
        System.out.println(e.toString());

        // Manager m = new Manager("Alice", 100000);
        // System.out.println(m.toString());

        Employee e2 = new Employee("Bob", 0);
        System.err.println(e.equals(e2));
    }
}
