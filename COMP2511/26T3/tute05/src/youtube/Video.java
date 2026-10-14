package youtube;

public class Video {
    private String title;
    private int views;
    private YouTuber producer;

    public Video(String title, YouTuber producer) {
        this.title = title;
        this.producer = producer;
    }

    public void watch() {
        ++views;
    }

    @Override
    public String toString() {
        return title + " by " + producer.getName();
    }

    public int getViews() {
        return views;
    }
}
