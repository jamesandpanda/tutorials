package youtube;

import java.util.ArrayList;
import java.util.List;

// this is the Subject, aka the thing being watched
// the important event is whenever a YouTuber uploads a video, they will notify all of their subscribers.
public class YouTuber {
    private String name;
    private List<Video> videos = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addObserver(Observer o) {
        subscribers.add(o);
    }

    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    public void createVideo(String title) {
        Video v = new Video(title, this);
        videos.add(v);

        for (Observer o : subscribers) {
            o.notify(v);
        }
    }
}
