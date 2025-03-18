package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Subscriber;

public class User implements Subscriber {
    private String name;
    private List<Video> watchLater = new ArrayList<>();

    @Override
    public void update(Video v) {
        watchLater.add(v);
        System.out.println("Added video " + v + " to " + name + "'s watch later list");
    }

    public User(String name) {
        this.name = name;
    }
}
