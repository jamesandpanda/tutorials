package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     * 
     * @param name   The full name of the employee.
     * @param salary The employee's yearly salary in AUD.
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the employee's full name
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
        // to get the name of the class of the object, use getClass().getSimpleName();
        return getClass().getSimpleName() + " name: " + name + ", salary: $" + salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null) {
            return false;
        } else if (getClass() != other.getClass()) {
            return false;
        }

        Employee e = (Employee) other;

        return name.equals(e.name) && salary == e.salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 5);
        Employee e2 = new Employee("Bob", 10);
        System.out.println(e1.equals(e2));

        // String s1 = new String("Hello World");
        // String s2 = new String("Hello World");
        // System.out.println(s1 == s2); // direct memory address
        // System.out.println(s1.equals(s2)); // comparing fields;
    }
}
