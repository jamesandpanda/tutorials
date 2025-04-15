package computer;

import java.io.FileWriter;

import org.json.JSONObject;

public class ComputerVisitor {
    public void visit(Computer c) {
        JSONObject j = new JSONObject();
        j.put("type", "computer");
        j.put("name", c.getName());
        j.put("storage", c.getStorage());
        j.put("ram", c.getRam());

        try {
            FileWriter f = new FileWriter("src/computer/output/computer.json");
            f.write(j.toString(2));
            f.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void visit(Keyboard k) {
        JSONObject j = new JSONObject();
        j.put("type", "keyboard");
        j.put("name", k.getName());
        j.put("numKeys", k.getNumKeys());

        try {
            FileWriter f = new FileWriter("src/computer/output/keyboard.json");
            f.write(j.toString(2));
            f.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void visit(Mouse m) {
        JSONObject j = new JSONObject();
        j.put("type", "mouse");
        j.put("name", m.getName());
        j.put("dpi", m.getDpi());

        try {
            FileWriter f = new FileWriter("src/computer/output/mouse.json");
            f.write(j.toString(2));
            f.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        ComputerComponent c = new Computer("epic CSE computer", 1024, 32);
        ComputerComponent k = new Keyboard("epic gamer keyboard");
        ComputerComponent m = new Mouse("really slow cse mouse", 2);

        ComputerVisitor visitor = new ComputerVisitor();
        c.accept(visitor);
        k.accept(visitor);
        m.accept(visitor);
    }
}
