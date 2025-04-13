package cafe;

public class Cafe {
    public static void main(String[] args) {
        MenuItem m = new MilkTea();

        // Adding a 'layer' (aka another decorator) involves calling the decorator's
        // constructor and then passing in the object to be decorated.
        // Currently, m is just the base object

        m = new LycheeJelly(m);
        // Now, m is the base milk tea + lychee jelly

        m = new MilkFoam(m);
        // Now, m is the base milk tea + lychee jelly + milk foam

        m = new Pearls(m);
        // Now, m is the base milk tea + lychee jelly + milk foam + pearls

        System.out.println(m.getDescription());
        System.out.println(m.getCost());
    }
}
