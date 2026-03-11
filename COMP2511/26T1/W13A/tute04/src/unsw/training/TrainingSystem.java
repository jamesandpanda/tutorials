package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {
    private List<Trainer> trainers;

    public void bookTraining(String employee, List<LocalDate> availabilities) {
        for (Trainer trainer : trainers) {
            for (Seminar seminar : trainer.getSeminars()) {
                for (LocalDate availability : availabilities) {
                    if (seminar.getStart().equals(availability) &&
                            seminar.getAttendees().size() < 10) {
                        seminar.getAttendees().add(employee);
                        System.out.println("Booked a training session for " + employee + " on " + availability);
                    }
                }
            }
        }
    }
}
