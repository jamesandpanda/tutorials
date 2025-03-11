package training;

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

    public LocalDate bookTraining(String attendee, List<LocalDate> availabilities) {
        for (Seminar seminar : seminars) {
            LocalDate result = seminar.bookTraining(attendee, availabilities);
            if (result != null) {
                return result;
            }
        }

        return null;
    }
}
