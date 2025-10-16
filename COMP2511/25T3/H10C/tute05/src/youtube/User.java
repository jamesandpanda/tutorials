package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;

public class User implements Observer {
    private String name;
    private List<Video> watchLater = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public void addToWatchLater(Video v) {
        watchLater.add(v);
        System.out.println("Added video " + v.toString() + " to watch later list of user " + name);
    }
    
}
