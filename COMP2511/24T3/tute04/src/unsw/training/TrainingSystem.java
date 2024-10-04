package unsw.training;

import java.time.LocalDate;
import java.util.List;

public class TrainingSystem {
    private List<Trainer> trainers;

    public LocalDate bookTraining(String employee, List<LocalDate> availabilities) {
        for (Trainer trainer : trainers) {
            LocalDate ret = trainer.bookSeminar(employee, availabilities);
            if (ret != null) {
                return ret;
            }
        }

        return null;
    }
}
