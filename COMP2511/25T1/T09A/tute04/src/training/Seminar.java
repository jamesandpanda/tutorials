package training;

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

    private void addAttendee(String name) {
        attendees.add(name);
    }

    private int numAttendees() {
        return attendees.size();
    }

    public LocalDate bookTraining(String attendee, List<LocalDate> availabilities) {
        for (LocalDate available : availabilities) {
            if (start.equals(available) && numAttendees() < 10) {
                addAttendee(attendee);
                return available;
            }
        }

        return null;
    }
    }
