package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * A trainer that runs in person seminars.
 * 
 * @author Robert Clifton-Everest
 */
public class Trainer {
    private String name;
    private String room;

    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Seminar seminar : seminars) {
            LocalDate bookedTime = seminar.bookTraining(employee, availability);
            if (bookedTime != null) {
                return bookedTime;
            }
        }

        return null;
    }
    
}
