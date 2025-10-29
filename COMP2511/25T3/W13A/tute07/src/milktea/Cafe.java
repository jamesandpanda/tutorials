package milktea;

public class Cafe {
    public static void main(String[] args) {
        MenuItem m = new MilkTea();

        // milk tea with 1 serving of pearls
        m = new Pearls(m);

        // milk tea with 1 serving of pearls and 1 serving of lychee jelly
        m = new LycheeJelly(m);

        // milk tea with 2 servings of pearls and 1 serving of lychee jelly
        m = new Pearls(m);

        System.out.println(m.getDescription());
        System.out.println(m.getCost());
    }
}
