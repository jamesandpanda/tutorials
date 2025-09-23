package clothes;

public abstract class ClothingItem {
    private int cost;

    public ClothingItem(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
