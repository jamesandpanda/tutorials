package youtube;

public class Video {
    private String name;
    private YouTuber producer;

    public Video(String name, YouTuber producer) {
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return name + " by " + producer;
    }
}
