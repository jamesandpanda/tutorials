package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {
    private List<Trainer> trainers;

    public void bookTraining(String employee, List<LocalDate> availabilities) {
        for (Trainer trainer : trainers) {
            trainer.bookTraining(employee, availabilities);
        }
    }


}
