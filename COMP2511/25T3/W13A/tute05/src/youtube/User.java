package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Subscriber;

public class User implements Subscriber {
    private String name;
    private List<Video> watchLater = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public void addToWatchLater(Video v) {
        watchLater.add(v);

        System.out.println("User " + name + "has added " + v + " to their watch later list!");
    }
}
