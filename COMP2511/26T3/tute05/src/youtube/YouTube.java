package youtube;

public class YouTube {
    public static void main(String[] args) {
        YouTuber y = new YouTuber("COMP2511 UNSW");
        Viewer u1 = new SuperFan("COMP2511Fan5");
        Viewer u2 = new Viewer("compscimenace2");
        Viewer u3 = new Viewer("COMP2511Hater4");

        y.addObserver(u1);
        y.addObserver(u2);
        y.createVideo("Observer Pattern Tutorial");
    }
}
