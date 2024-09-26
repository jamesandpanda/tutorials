package overriding;

public class Main {
    public static void main(String[] args) {
        UNSWStudent a = new UNSWStudent();
        a.speak();
        UniStudent b = a;
        b.speak();
        b = new UniStudent();
        b.speak();
        a.speak();
    }
}

class UniStudent {
    public void speak() {
        System.out.println("I love semesters!");
    }
}

class UNSWStudent extends UniStudent {
    @Override
    public void speak() {
        System.out.println("I love trimesters!");
    }
}
