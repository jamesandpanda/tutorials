package icecream;

public class Main {
    public static void main(String[] args) {
        IceCream ic = new IceCreamCone();
        // add a chocolate scoop
        ic = new ChocolateScoop(ic);

        // add a strawberry scoop
        ic = new StrawberryScoop(ic);

        // add a vanilla scoop
        ic = new VanillaScoop(ic);
        
        // we can model any combination of scoops
        // and this only required classes for the base object (cone), the decorators (scoops) and the abstract class/interface.

        System.out.println(ic.getDescription());
        System.out.println(ic.getCost());
    }
}
