package Controllers;

import Model.SavingGoal;
import java.util.Date;

public class SavingGoalController extends BasicController {

    public SavingGoalController() {
    }

    public SavingGoal CreateSavingGoal(String desc, Double valor, Date data, String alias) {
        return new SavingGoal(desc, valor, data, alias);
    }
}
