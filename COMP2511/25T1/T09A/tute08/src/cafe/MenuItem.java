package cafe;

// This is the interface that the decorators and the objects being decorated
// should both implement - this is important, as the decorators have to store
// an object of this type; this allows a decorator to store both the base type
// and also a decorated type.
public interface MenuItem {
    public String getDescription();

    public double getCost();
}
