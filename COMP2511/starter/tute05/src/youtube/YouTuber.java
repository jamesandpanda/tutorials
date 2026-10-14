package youtube;

import java.util.ArrayList;
import java.util.List;

public class YouTuber {
    private String name;
    private List<Viewer> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
