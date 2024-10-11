package youtube;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(Subject subject) {
        if (subject instanceof Producer) {
            Producer p = (Producer) subject;
            System.out.println(p.getName() + " has uploaded a new video!");
        }
    }
}
