package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {
    private List<Trainer> trainers;

    public LocalDate bookTraining(String attendee, List<LocalDate> availabilities) {
        for (Trainer trainer : trainers) {
            LocalDate bookedDate = trainer.bookTraining(attendee, availabilities);
            if (bookedDate != null) {
                return bookedDate;
            }
        }
        return null;
    }
}
