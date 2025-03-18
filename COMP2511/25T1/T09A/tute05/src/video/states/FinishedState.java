package video.states;

import video.Video;

public class FinishedState implements VideoState {
    private Video video;

    public FinishedState(Video video) {
        this.video = video;
    }

    @Override
    public void onPlay() {
        System.out.println("Restarting " + video.getName() + " from the start!");
        video.resetCurrDuration();
        video.setState(new PlayingState(video));
    }

    @Override
    public void onPause() {
        System.err.println("Error: Cannot pause a video that is already finished!");
    }
}
