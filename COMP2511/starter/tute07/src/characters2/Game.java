package characters2;

import java.util.Random;
import java.util.Scanner;

import characters2.standards.*;
import characters2.supers.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to create a standard or super character?");
        String characterType = sc.nextLine().toLowerCase();

        System.out.println("Which character would you like to create?");
        String character = sc.nextLine().toLowerCase();
        sc.close();

        // This object allows us to generate random numbers.
        Random r = new Random();

        Character c = switch (characterType) {
            case "standard": {
                switch (character) {
                    case "swordsman": {
                        int attack = r.nextInt(1, 4);
                        int defence = r.nextInt(1, 4);
                        int speed = r.nextInt(1, 4);
                        int range = 1;
                        yield new StandardSwordsman(attack, defence, speed, range);
                    }
                    case "archer": {
                        int attack = r.nextInt(2, 5);
                        int defence = r.nextInt(1, 3);
                        int speed = r.nextInt(1, 4);
                        int range = 2;
                        yield new StandardArcher(attack, defence, speed, range);
                    }
                    case "tank": {
                        int attack = r.nextInt(1, 3);
                        int defence = r.nextInt(3, 6);
                        int speed = r.nextInt(1, 3);
                        int range = 1;
                        yield new StandardTank(attack, defence, speed, range);
                    }
                    default:
                        throw new IllegalArgumentException("Not a valid character");
                }
            }
            case "super": {
                switch (character) {
                    case "swordsman": {
                        int attack = r.nextInt(11, 14);
                        int defence = r.nextInt(11, 14);
                        int speed = r.nextInt(1, 4);
                        int range = 2;
                        yield new SuperSwordsman(attack, defence, speed, range);
                    }
                    case "archer": {
                        int attack = r.nextInt(15, 21);
                        int defence = r.nextInt(3, 6);
                        int speed = r.nextInt(2, 5);
                        int range = 4;
                        yield new SuperArcher(attack, defence, speed, range);
                    }
                    case "tank": {
                        int attack = r.nextInt(5, 11);
                        int defence = r.nextInt(20, 31);
                        int speed = r.nextInt(1, 3);
                        int range = 1;
                        yield new SuperTank(attack, defence, speed, range);
                    }
                    default:
                        throw new IllegalArgumentException("Not a valid character");
                }
            }
            default:
                throw new IllegalArgumentException("Not a valid type");
        };

        System.out.println(String.format("Created a %s %s with %d attack, %d defence, %d speed and %d range",
            characterType, character, c.getAttack(), c.getDefence(), c.getSpeed(), c.getRange()));
    }
}
