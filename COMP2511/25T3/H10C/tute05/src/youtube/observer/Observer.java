package youtube.observer;

import youtube.Video;

public interface Observer {
    // What is the method that the subject should call to notify its observers?
    public void addToWatchLater(Video v);
}
