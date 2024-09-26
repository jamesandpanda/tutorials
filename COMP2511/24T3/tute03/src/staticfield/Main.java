package staticfield;

public class Main {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        a.incX();
        b.incY();
        System.out.println(a.getX() + " " + a.getY());
        System.out.println(b.getX() + " " + b.getY());
    }
}

class Point {
    private int x;
    private static int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incX() {
        x++;
    }

    public void incY() {
        y++;
    }
}
