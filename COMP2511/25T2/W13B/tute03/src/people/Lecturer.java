package people;

import java.util.Map;

public class Lecturer extends Person {
    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    private int salary;

    public Lecturer(String name, int age, String payRate) {
        super(name, age);
        setSalary(payRate);
    }

    /**
     * Sets the salary of a person given their pay rate
     * @param payRate New pay rate of the person
     * @precondition payRate is "LVL0", "LVL1", "LVL2", "LVL3"
     * @postcondition the person's salary is set to the appropriate rate according to payRate
     */
    public void setSalary(String payRate) {
        Integer pay = PAY_RATES.get(payRate);
        salary = pay;
    }
}
