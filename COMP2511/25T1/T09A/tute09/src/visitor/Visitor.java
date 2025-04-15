package visitor;

// A program to demonstrate why 'double dispatch' is required.
public class Visitor {
    public void visit(Chicken chicken) {
        System.out.println("just a chicken");
    }

    public void visit(ChickenJockey chicken) {
        System.out.println("chiiiiiicken jockey");
    }

    public void visit(SuperChicken chicken) {
        System.out.println("flint and steel!");
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Chicken chickenJockey = new ChickenJockey();
        Chicken superChicken = new SuperChicken();

        Visitor v = new Visitor();
        // The compiler uses the static type declared to determine which method
        // is called - but we want polymorphic behaviour
        v.visit(chicken);
        v.visit(chickenJockey);
        v.visit(superChicken);
    }
}
