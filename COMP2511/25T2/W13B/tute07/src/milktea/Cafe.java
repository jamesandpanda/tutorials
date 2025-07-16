package milktea;

public class Cafe {
    public static void main(String[] args) {
        MenuItem m = new MilkTea();
        m = new Pearls(m);
        m = new LycheeJelly(m);
        m = new Pearls(m);
        m = m.getOriginalBeverage();
        System.out.println(m.getDescription());
        System.out.println(m.getCost());
    }
}
