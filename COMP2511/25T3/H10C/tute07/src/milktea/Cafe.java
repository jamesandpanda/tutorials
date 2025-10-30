package milktea;

public class Cafe {
    public static void main(String[] args) {
        MenuItem m = new MilkTea();
        m = new Pearls(m);
        m = new LycheeJelly(m);

        // can only remove the top-most layer
        m = m.removeTopping();

        System.out.println(m.getDescription());
        System.out.println(m.getCost());
    }
}
