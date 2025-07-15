package universities;

public abstract class Lecturer {
    private int id;
    private double salary;

    public Lecturer(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": id " + id + ", salary " + salary;
    }
}
