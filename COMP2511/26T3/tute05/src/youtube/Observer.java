package youtube;

public interface Observer {
    // what will the observer in response to the "important event"?
    public void notify(Video v);
}
