package youtube;

public class YoutubeTest {
    public static void main(String[] args) {
        Producer p = new Producer("Joe");
        User a = new User("Alex");
        User b = new User("Bob");
        p.attach(a);
        p.attach(b);

        p.createVideo("How not to Observer Pattern", 2);
    }
}
