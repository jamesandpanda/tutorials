package youtube2;

import youtube2.state.PausedState;
import youtube2.state.ViewingState;

public class Viewing {
    private Video video;
    private Video nextVideo;
    private User user;
    private ViewingState state = new PausedState(this);
    private boolean playing = false;

    public Viewing(Video video, Video nextVideo, User user) {
        this.video = video;
        this.nextVideo = nextVideo;
        this.user = user;
    }

    public void setPlaying(boolean play) {
        this.playing = play;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void changeState(ViewingState newState) {
        this.state = newState;
    }

    public String getNextVideo() {
        return nextVideo.getName();
    }

    public String lock() {
        return state.onLock();
    }

    public String play() {
        return state.onPlay();
    }

    public String next() {
        this.video = nextVideo;
        return state.onNext();
    }

    public static void main(String[] args) {
        User producer = new User("Ashesh");
        Viewing view = new Viewing(new Video("Video 1", 10, producer), new Video("Video 2", 14, producer), producer);

        System.out.println(view.play());
        System.out.println(view.play());
        System.out.println(view.next());
        System.out.println(view.lock());
        System.out.println(view.play());
        System.out.println(view.next());
        System.out.println(view.play());
    }
}
