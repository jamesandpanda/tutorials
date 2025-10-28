package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Subject;
import youtube.observer.Observer;

public class YouTuber implements Subject {
    private String name;
    private List<Observer> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void uploadVideo(String name) {
        Video v = new Video(name, this);
        videos.add(v);

        System.out.println("YouTuber " + name + " has uploaded video" + v.toString());

        for (Observer subscriber : subscribers) {
            subscriber.addToWatchLater(v);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
