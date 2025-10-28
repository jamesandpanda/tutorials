package youtube.observer;

public interface Subject {
    public void addSubscriber(Observer s);

    public void removeSubscriber(Observer s);

    // What is the method that the observer will be waiting on?
    public void uploadVideo(String name);
}
