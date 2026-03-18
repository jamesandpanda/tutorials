package youtube.observer;

public interface Publisher {
    public void addSubscriber(Subscriber s);

    public void removeSubscriber(Subscriber s);

    // What is the method that the observer will be waiting on?
    public void createVideo(String name);
}
