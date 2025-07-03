package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Publisher;
import youtube.observer.Subscriber;

public class YouTuber implements Publisher {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    public void createVideo(String name) {
        Video v = new Video(name, this);
        videos.add(v);

        for (Subscriber s : subscribers) {
            s.addToWatchLater(v);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }
}
