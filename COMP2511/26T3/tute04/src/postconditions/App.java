package postconditions;

import java.util.Timer;
import java.util.TimerTask;

public class App extends TimerTask {
    private NumberGenerator gen = new NumberGeneratorC();

    @Override
    public void run() {
        // Prints out a random number to two decimal places.
        System.out.printf("Generated %.2f\n", gen.generateNumber());
    }

    // Runs the run() method every second.
    // By NumberGenerator's contract, only numbers between 0 and 10 should be printed.
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new App(), 0, 1000);
    }
}
