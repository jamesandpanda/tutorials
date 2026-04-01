package milktea;

public class Cafe {
    public static void main(String[] args) {
        MenuItem m = new MilkTea();
        System.out.println(m.getDescription());
        System.out.println(m.getCost());

        m = new Pearls(m);
        System.out.println(m.getDescription());
        System.out.println(m.getCost());

        m = new Pearls(m);
        System.out.println(m.getDescription());
        System.out.println(m.getCost());

        m = new LycheeJelly(m);
        System.out.println(m.getDescription());
        System.out.println(m.getCost());

        m = m.removeDecorator();
        System.out.println(m.getDescription());
        System.out.println(m.getCost());
    }
}
