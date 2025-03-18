package video;

import video.states.*;

public class Video {
    private String name;
    private int duration;
    private int currDuration;
    private VideoState state;

    /**
     * Creates a new name with the given name and duration.
     *
     * @param name       the title of the video
     * @param duration   the duration of the video in seconds; must be greater than 0
     */
    public Video(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.state = new PlayingState(this);
    }

    public int getDuration() {
        return duration;
    }

    public int getCurrDuration() {
        return currDuration;
    }

    public void incrCurrDuration() {
        currDuration += 1;
    }

    public void resetCurrDuration() {
        currDuration = 0;
    }

    public void setState(VideoState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void play() {
        state.onPlay();
    }

    public void pause() {
        state.onPause();
    }
}
