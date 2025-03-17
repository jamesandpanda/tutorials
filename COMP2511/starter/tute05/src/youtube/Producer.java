package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private List<User> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    public void createVideo(String name) {
        Video v = new Video(name, this);
        videos.add(v);
    }

    @Override
    public String toString() {
        return name;
    }
}
