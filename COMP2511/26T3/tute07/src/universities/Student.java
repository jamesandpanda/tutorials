package universities;

public abstract class Student {
    private int id;
    private int luck;

    public Student(int id, int luck) {
        this.id = id;
        this.luck = luck;
    }

    public int getId() {
        return id;
    }

    public int getLuck() {
        return luck;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": id " + id + ", luck " + luck;
    }
}
