package characters2_sol.supers;

import characters2_sol.Swordsman;
import characters2_sol.Tank;

import java.util.Random;

import characters2_sol.Archer;
import characters2_sol.CharacterFactory;

public class SuperCharacterFactory implements CharacterFactory {
    private Random r = new Random();

    @Override
    public Swordsman createSwordsman() {
        int attack = r.nextInt(11, 14);
        int defence = r.nextInt(11, 14);
        int speed = r.nextInt(1, 4);
        int range = 2;
        return new SuperSwordsman(attack, defence, speed, range);
    }

    @Override
    public Archer createArcher() {
        int attack = r.nextInt(15, 21);
        int defence = r.nextInt(3, 6);
        int speed = r.nextInt(2, 5);
        int range = 4;
        return new SuperArcher(attack, defence, speed, range);
    }

    @Override
    public Tank createTank() {
        int attack = r.nextInt(5, 11);
        int defence = r.nextInt(20, 31);
        int speed = r.nextInt(1, 3);
        int range = 1;
        return new SuperTank(attack, defence, speed, range);
    }
}
