package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Publisher;
import youtube.observer.Subscriber;

public class YouTuber implements Publisher {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void createVideo(String name) {
        Video v = new Video(name, this);
        for (Subscriber s : subscribers) {
            s.update(v);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
