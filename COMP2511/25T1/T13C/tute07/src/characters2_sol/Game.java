package characters2_sol;

import java.util.Scanner;

import characters2_sol.standards.*;
import characters2_sol.supers.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to create a standard or super character?");
        String characterType = sc.nextLine().toLowerCase();

        System.out.println("Which character would you like to create?");
        String character = sc.nextLine().toLowerCase();
        sc.close();

        CharacterFactory cf = switch (characterType) {
            case "standard" -> new StandardCharacterFactory();
            case "super" -> new SuperCharacterFactory();
            default -> throw new IllegalArgumentException("Not a valid type");
        };

        Character c = switch (character) {
            case "swordsman" -> cf.createSwordsman();
            case "archer" -> cf.createArcher();
            case "tank" -> cf.createTank();
            default -> throw new IllegalArgumentException("Not a valid character");
        };

        System.out.println(String.format("Created a %s %s with %d attack, %d defence, %d speed and %d range",
            characterType, character, c.getAttack(), c.getDefence(), c.getSpeed(), c.getRange()));
    }
}
