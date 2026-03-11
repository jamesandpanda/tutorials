package myunsw;

public class Student {
    private int id;
    private int program;
    private int luck;

    public Student(int id, int program, int luck) {
        this.id = id;
        this.program = program;
        this.luck = luck;
    }

    public int getId() {
        return id;
    }

    public int getProgram() {
        return program;
    }

    public int getLuck() {
        return luck;
    }
}
