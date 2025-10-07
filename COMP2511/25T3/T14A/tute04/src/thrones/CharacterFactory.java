package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random r = new Random(System.currentTimeMillis());

    public static King createKing() {
        return new King(r.nextInt(5), r.nextInt(5));
    }

    public static Dragon createDragon() {
        return new Dragon(r.nextInt(5), r.nextInt(5));
    }

    public static Queen createQueen() {
        return new Queen(r.nextInt(5), r.nextInt(5));
    }

    public static Knight createKnight() {
        return new Knight(r.nextInt(5), r.nextInt(5));
    }
}
