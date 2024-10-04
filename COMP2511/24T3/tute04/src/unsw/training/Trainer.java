package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * A trainer that runs in person seminars.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Trainer {
    private String name;
    private String room;
    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate bookSeminar(String employee, List<LocalDate> availabilities) {
        for (Seminar seminar : seminars) {
            LocalDate ret = seminar.addAttendee(employee, availabilities);
            if (ret != null) {
                return ret;
            }
        }

        return null;
    }
}
