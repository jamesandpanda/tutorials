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
    private List<Seminar> seminars;

    public String getName() {
        return name;
    }

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate bookTraining(String attendee, List<LocalDate> availabilities) {
        for (Seminar seminar : seminars) {
            for (LocalDate availability : availabilities) {
                if (seminar.canAcceptAttendee(availability)) {
                    seminar.addAttendee(attendee);
                    return availability;
                }
            }
        }

        return null;
    }
}
