package youtube;

public class SuperFan extends Viewer {
    public SuperFan(String name) {
        super(name);
    }

    @Override
    public void notify(Video v) {
        super.notify(v);
        v.watch();
        System.out.println("Video " + v + " was watched by " + getName());
    }
    
}
