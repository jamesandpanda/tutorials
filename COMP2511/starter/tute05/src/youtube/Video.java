package youtube;

public class Video {
    private String title;
    private int views;

    public Video(String title) {
        this.title = title;
    }

    public void watch() {
        ++views;
    }

    public String getTitle() {
        return title;
    }

    public int getViews() {
        return views;
    }
}
