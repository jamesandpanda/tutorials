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

    public void bookTraining(String employee, List<LocalDate> availabilities) {
        for (Seminar seminar : seminars) {
            for (LocalDate availability : availabilities) {
                if (seminar.canTakeEmployee(availability)) {
                    seminar.addAttendees(employee);
                    System.out.println("Booked a training session for " + employee + " on " + availability);
                }
            }
        }
    }
}
