package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates a new employee given a name and salary.
     * 
     * @param name - the full name
     * @param salary - salary in AUD
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
        return getClass().getSimpleName() + " Name: " + name + ", Salary: $" + salary;
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

        Employee other = (Employee) obj;
        return name.equals(other.name) && salary == other.salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 2);
        System.out.println(e.toString());

        String s1 = new String("Max");
        String s2 = new String("Max");

        Employee e1 = new Employee(s1, 1);
        Employee e2 = new Employee(s2, 1);
        System.out.println(e1.equals(e2));
    }
}
