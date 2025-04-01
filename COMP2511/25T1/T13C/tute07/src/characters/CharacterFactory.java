package characters;

import java.util.Random;

public class CharacterFactory {
    private static Random r = new Random();
    
    public static Archer createArcher() {
        int attack = r.nextInt(2, 5);
        int defence = r.nextInt(1, 3);
        int speed = r.nextInt(1, 4);
        int range = 2;
        return new Archer(attack, defence, speed, range);
    }

    public static Swordsman createSwordsman() {
        int attack = r.nextInt(1, 4);
        int defence = r.nextInt(1, 4);
        int speed = r.nextInt(1, 4);
        int range = 1;
        return new Swordsman(attack, defence, speed, range);
    }

    public static Tank createTank() {
        int attack = r.nextInt(1, 3);
        int defence = r.nextInt(3, 6);
        int speed = r.nextInt(1, 3);
        int range = 1;
        return new Tank(attack, defence, speed, range);
    }
}
