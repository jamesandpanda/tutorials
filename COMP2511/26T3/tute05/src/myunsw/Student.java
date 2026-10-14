package myunsw;

public class Student {
    private int id;
    private int programCode;

    public Student(int id, int programCode) {
        this.id = id;
        this.programCode = programCode;
    }

    public int getId() {
        return id;
    }

    public int getProgramCode() {
        return programCode;
    }
}
