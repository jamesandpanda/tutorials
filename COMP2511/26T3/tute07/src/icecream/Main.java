package icecream;

public class Main {
    public static void main(String[] args) {
        // want to model 2 strawberry scoops, 1 vanilla scoop and 3 chocolate scoops on top of each other
        IceCream ic = new IceCreamCone();
        ic = new StrawberryScoop(ic);
        ic = new StrawberryScoop(ic);
        ic = new VanillaScoop(ic);
        ic = new ChocolateScoop(ic);
        ic = new ChocolateScoop(ic);
        ic = new ChocolateScoop(ic);

        System.out.println(ic.getDescription());
        System.out.println(ic.getCost());

        ic = ic.removeDecorator();
        System.out.println(ic.getDescription());
        System.out.println(ic.getCost());
    }
}
