package youtube;

import java.util.ArrayList;
import java.util.List;

public class YouTuber {
    private String name;
    private List<User> subscribers = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    public void createVideo(String name) {
        Video v = new Video(name, this);
    }

    @Override
    public String toString() {
        return name;
    }
}
