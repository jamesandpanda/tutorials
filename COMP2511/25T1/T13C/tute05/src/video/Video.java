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

    public void setState(VideoState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void play() {
        state.onPlay();
        switch (state) {
            case PLAYING:
                currDuration += 1;
                if (duration == currDuration) {
                    System.out.println(name + " has finished playing!");
                    state = VideoState.FINISHED;
                } else {
                    System.out.println("Playing " + name + "! There are " + (duration - currDuration) + " seconds remaining.");
                }
                return;
            case PAUSED:
                System.out.println("Unpausing " + name + "!");
                state = VideoState.PLAYING;
                return;
            case FINISHED:
                System.out.println("Restarting " + name + " from the start!");
                currDuration = 0;
                state = VideoState.PLAYING;
                return;
        }
    }

    public void pause() {
        state.onPause();
        // switch (state) {
        //     case PLAYING:
        //         System.out.println("Pausing " + name + "!");
        //         state = VideoState.PAUSED;
        //         return;
        //     case PAUSED:
        //         System.err.println("Error: " + name + " is already paused!");
        //         return;
        //     case FINISHED:
        //         System.err.println("Error: Cannot pause a video that is already finished!");
        //         return;
        // }
    }
}
