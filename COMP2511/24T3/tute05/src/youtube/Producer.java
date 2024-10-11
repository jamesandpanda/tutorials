package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void createVideo(String name, int length) {
        videos.add(new Video(name, length, this));
        notifyObservers();
    }

    public String getName() {
        return name;
    }
}
