package video.states;

import video.Video;

public class FinishedState implements VideoState {
    private Video video;

    public FinishedState(Video video) {
        this.video = video;
    }

    @Override
    public void onPlay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onPlay'");
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onPause'");
    }
}
