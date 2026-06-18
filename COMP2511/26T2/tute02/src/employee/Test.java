package employee;

public class Test {
    private static int x = 0; // static - shared
    private int y = 0; // instance - belongs to particular objects

    /**
     * Outputs an integer x.
     *
     * @return
     */
    public static int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void increment() {
        ++x;
        ++y;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.increment();
        System.out.println(t1.getX() + " " + t1.getY());

        t2.increment();
        System.out.println(t2.getX() + " " + t2.getY());
    }
}
