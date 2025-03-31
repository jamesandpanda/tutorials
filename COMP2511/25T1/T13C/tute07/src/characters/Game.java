package characters;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which character would you like to create?");
        String character = sc.nextLine().toLowerCase();
        sc.close();

        // This object allows us to generate random numbers.
        Random r = new Random();

        Character c = switch (character) {
            case "swordsman": {
                int attack = r.nextInt(1, 4);
                int defence = r.nextInt(1, 4);
                int speed = r.nextInt(1, 4);
                int range = 1;
                yield new Swordsman(attack, defence, speed, range);
            }
            case "archer": {
                int attack = r.nextInt(2, 5);
                int defence = r.nextInt(1, 3);
                int speed = r.nextInt(1, 4);
                int range = 2;
                yield new Archer(attack, defence, speed, range);
            }
            case "tank": {
                int attack = r.nextInt(1, 3);
                int defence = r.nextInt(3, 6);
                int speed = r.nextInt(1, 3);
                int range = 1;
                yield new Tank(attack, defence, speed, range);
            }
            default:
                throw new IllegalArgumentException("Not a valid character");
        };

        System.out.println(String.format("Created a %s with %d attack, %d defence, %d speed and %d range",
            character, c.getAttack(), c.getDefence(), c.getSpeed(), c.getRange()));
    }
}
