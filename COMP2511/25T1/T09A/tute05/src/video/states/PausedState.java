package video.states;

import video.Video;

public class PausedState implements VideoState {
    private Video video;

    public PausedState(Video video) {
        this.video = video;
    }

    @Override
    public void onPlay() {
        System.out.println("Unpausing " + video.getName() + "!");
        video.setState(new PlayingState(video));
    }

    @Override
    public void onPause() {
        System.err.println("Error: " + video.getName() + " is already paused!");
    }
}
