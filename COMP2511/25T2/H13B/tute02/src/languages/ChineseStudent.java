package languages;

public class ChineseStudent extends Student {
    public ChineseStudent(String name) {
        super(name);
    }

    public void sayHi() {
        System.out.println(getName() + " says: 你好!");
    }
}
