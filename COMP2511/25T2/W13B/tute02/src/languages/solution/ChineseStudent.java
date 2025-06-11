package languages.solution;

public class ChineseStudent extends Student {
    public ChineseStudent(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + " says: 你好!");
    }
}
