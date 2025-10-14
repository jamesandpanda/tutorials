package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * An in person all day seminar with a maximum of 10 attendees.
 * 
 * @author Robert Clifton-Everest
 */
public class Seminar {
    private LocalDate start;
    private List<String> attendees;

    public LocalDate getStart() {
        return start;
    }

    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    public boolean canAttendSeminar(LocalDate availability) {
        return start.equals(availability) && attendees.size() < 10;
    }

    public LocalDate bookTraining(String employee, List<LocalDate> availabilities) {
        for (LocalDate availability : availabilities) {
            if (canAttendSeminar(availability)) {
                addAttendee(employee);
                return availability;
            }
        }

        return null;
    }
}
