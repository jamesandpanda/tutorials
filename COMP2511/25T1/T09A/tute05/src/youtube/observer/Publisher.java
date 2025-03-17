package youtube.observer;

public interface Publisher {
    public void addSubscriber();

    public void removeSubscriber();

    // TODO - Change this method signature according to the requirements
    public void notifySubscribers();
}
