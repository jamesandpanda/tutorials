package youtube;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Video> watchLater = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
