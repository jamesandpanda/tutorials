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
            System.out.println("Playing " + name + "! There are " + (duration - currDuration) + " seconds remaining.");
        }
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onPause'");
    }
}
