package milktea;

public class Cafe {
    public static void main(String[] args) {
        // Create the base object (the milk tea)
        Beverage b = new MilkTea();

        // Add pearls
        b = new PearlsDecorator(b);

        // Add lychee jelly
        b = new LycheeJellyDecorator(b);

        // Add milk foam
        b = new MilkFoamDecorator(b);

        System.out.println(b.getDescription());
        System.out.println(b.getCost());
    }
}