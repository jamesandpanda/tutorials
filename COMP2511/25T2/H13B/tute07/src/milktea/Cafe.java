package milktea;

public class Cafe {
    public static void main(String[] args) {
        MenuItem m = new MilkTea();
        m = new Pearls(m); // adding pearls
        m = new LycheeJelly(m); // adding lychee jelly
        m = new Pearls(m); // adding more pearls
        m = m.getWrappedObject(); // removing the top-most decorator (pearls)
        System.out.println(m.getDescription());
        System.out.println(m.getCost());
    }
}
