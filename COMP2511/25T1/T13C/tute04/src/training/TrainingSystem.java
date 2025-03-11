package training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {
    private List<Trainer> trainers;

    public LocalDate bookTraining(String attendee, List<LocalDate> availabilities) {
        for (Trainer trainer : trainers) {
            LocalDate result = trainer.bookTraining(attendee, availabilities);
            if (result != null) {
                return result;
            }
        }

        return null;
    }
}
