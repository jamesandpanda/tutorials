package youtube;

public class Video {
    private String title;
    private int views;
    private YouTuber producer;

    public Video(String title, YouTuber producer) {
        this.title = title;
    }

    public void watch() {
        ++views;
    }

    public String toString() {
        return title + "uploaded by " + producer.getName();
    }

    public int getViews() {
        return views;
    }
}
