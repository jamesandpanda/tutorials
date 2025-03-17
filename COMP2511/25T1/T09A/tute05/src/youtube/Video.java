package youtube;

public class Video {
    private String name;
    private Producer producer;

    public Video(String name, Producer producer) {
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return name + " by " + producer;
    }
}
