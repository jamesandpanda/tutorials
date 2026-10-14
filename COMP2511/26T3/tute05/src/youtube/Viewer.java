package youtube;

import java.util.List;
import java.util.ArrayList;

public class Viewer {
    private String name;
    private List<String> notifications = new ArrayList<>();

    public Viewer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getNotifications() {
        return notifications;
    }
}
