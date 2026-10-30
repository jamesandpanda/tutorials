package icecream;

public class Main {
    public static void main(String[] args) {
        IceCream ic = new VanillaIceCream();
        System.out.println(ic.getDescription());
        System.out.println(ic.getCost());
    }
}
