package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {
    private List<Trainer> trainers;

    public LocalDate bookTraining(String employee, List<LocalDate> availability) {
        for (Trainer trainer : trainers) {
            LocalDate bookedDate = trainer.bookTraining(employee, availability);
            if (bookedDate != null) {
                return bookedDate;
            }
        }

        return null;
    }
}
