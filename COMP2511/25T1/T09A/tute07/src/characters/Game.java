package characters;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which character would you like to create?");
        String character = sc.nextLine().toLowerCase();
        sc.close();

        Character c = switch (character) {
            case "swordsman": {
                yield CharacterFactory.createSwordsman();
            }
            case "archer": {
                yield CharacterFactory.createArcher();
            }
            case "tank": {
                yield CharacterFactory.createTank();
            }
            default:
                throw new IllegalArgumentException("Not a valid character");
        };

        System.out.println(String.format("Created a %s with %d attack, %d defence, %d speed and %d range",
            character, c.getAttack(), c.getDefence(), c.getSpeed(), c.getRange()));
    }
}
