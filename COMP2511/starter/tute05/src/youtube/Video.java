package youtube;

public class Video {
    private String name;
    private int length; // in seconds
    private Producer producer;

    public Video(String name, int length, Producer producer) {
        this.name = name;
        this.length = length;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return name + " by " + producer + ", length " + length + " seconds";
    }
}
