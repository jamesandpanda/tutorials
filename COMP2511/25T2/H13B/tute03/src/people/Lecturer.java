package people;

import java.util.Map;

public class Lecturer extends Person {
    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    private Integer salary;

    public Lecturer(String name, int age, String payRate) {
        super(name, age);
        setSalary(payRate);
    }

    /**
     * Sets the salary of a lecturer given their pay rate
     * @param payRate New pay rate of the person
     * @precondition payRate is one of "LVL0", "LVL1", "LVL2" or "LVL3"
     * @postcondition the lecturer's salary is set according to the given pay rate
     */
    public void setSalary(String payRate) {
        Integer pay = PAY_RATES.get(payRate);
        salary = pay;
    }
}
