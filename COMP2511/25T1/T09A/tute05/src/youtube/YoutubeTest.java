package youtube;

public class YoutubeTest {
    public static void main(String[] args) {
        YouTuber y = new YouTuber("COMP2511 UNSW CSE");
        User u1 = new User("COMP2511Fan5");
        User u2 = new User("compscimenace2");
        User u3 = new User("COMP2511Hater4");

        y.addSubscriber(u1);
        y.addSubscriber(u2);
        y.createVideo("YAY I LOVE OBSERVER PATTERN");
    }
}
