package characters;

public abstract class Character {
    private int attack;
    private int defence;
    private int speed;
    private int range;

    public Character(int attack, int defence, int speed, int range) {
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.range = range;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRange() {
        return range;
    }
}
