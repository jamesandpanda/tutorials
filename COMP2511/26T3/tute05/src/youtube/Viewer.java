package youtube;

import java.util.List;
import java.util.ArrayList;

public class Viewer implements Observer {
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

    @Override
    public void notify(Video v) {
        String notification = name + ": video " + v.toString() + " was just uploaded";
        notifications.add(notification);
        System.out.println(notification);
    }
}
