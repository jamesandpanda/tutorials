package youtube.observer;

import youtube.Video;

public interface Subscriber {
    public void addToWatchLater(Video v);
}
