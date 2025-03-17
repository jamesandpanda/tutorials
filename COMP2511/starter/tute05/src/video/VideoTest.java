package video;

public class VideoTest {
    public static void main(String[] args) {
        Video v = new Video("State Pattern 101", 3);
        v.play(); // 2 seconds left
        v.play(); // 1 second left
        v.play(); // video finishes
        v.play(); // video restarts, 3 seconds left
        v.play(); // 2 seconds left
        v.pause(); // paused, 2 seconds left
        v.pause(); // error: already paused
        v.play(); // unpause, 2 second left
        v.play(); // 1 second left
        v.play(); // video finishes
        v.pause(); // error: cannot pause finished video
    }
}
