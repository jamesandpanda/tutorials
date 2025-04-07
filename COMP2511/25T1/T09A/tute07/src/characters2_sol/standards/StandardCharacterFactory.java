package characters2_sol.standards;

import java.util.Random;

import characters2_sol.Archer;
import characters2_sol.CharacterFactory;
import characters2_sol.Swordsman;
import characters2_sol.Tank;

public class StandardCharacterFactory implements CharacterFactory {
    private Random r = new Random();

    @Override
    public Swordsman createSwordsman() {
        int attack = r.nextInt(1, 4);
        int defence = r.nextInt(1, 4);
        int speed = r.nextInt(1, 4);
        int range = 1;
        return new StandardSwordsman(attack, defence, speed, range);
    }

    @Override
    public Archer createArcher() {
        int attack = r.nextInt(2, 5);
        int defence = r.nextInt(1, 3);
        int speed = r.nextInt(1, 4);
        int range = 2;
        return new StandardArcher(attack, defence, speed, range);
    }

    @Override
    public Tank createTank() {
        int attack = r.nextInt(1, 3);
        int defence = r.nextInt(3, 6);
        int speed = r.nextInt(1, 3);
        int range = 1;
        return new StandardTank(attack, defence, speed, range);
    }
}
