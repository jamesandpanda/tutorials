package youtube.observer;

import youtube.Video;

public interface Subscriber {
    public void update(Video v);
}
