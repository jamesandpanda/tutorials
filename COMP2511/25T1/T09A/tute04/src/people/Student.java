package people;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age, "LVL0");
    }

    @Override
    public int getSalary() {
        // Is this valid inheritance?
        return 0;
    }

    @Override
    public void setSalary(String payRate) {
        // Is this valid inheritance?
        return;
    }
}
