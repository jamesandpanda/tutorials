package youtube.observer;

public interface Publisher {
    public void addSubscriber(Subscriber s);

    public void removeSubscriber(Subscriber s);

    public void createVideo(String name);
}
