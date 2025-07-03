package youtube.observer;

import youtube.Video;

public interface Subscriber {
    // This method should be called by the subject (publisher) once the event that the observer (subscriber)
    // is waiting on happens.
    public void addToWatchLater(Video v);
}
