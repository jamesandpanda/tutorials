package video.states;

import video.Video;

public class PlayingState implements VideoState {
    private Video video;

    public PlayingState(Video video) {
        this.video = video;
    }

    @Override
    public void onPlay() {
        video.incrCurrDuration();
        if (video.getDuration() == video.getCurrDuration()) {
            System.out.println(video.getName() + " has finished playing!");
            video.setState(new FinishedState(video));
        } else {
            System.out.println("Playing " + video.getName() + "! There are "
                + (video.getDuration() - video.getCurrDuration()) + " seconds remaining.");
        }
    }

    @Override
    public void onPause() {
        System.out.println("Pausing " + video.getName() + "!");
        video.setState(new PausedState(video));
    }
}
