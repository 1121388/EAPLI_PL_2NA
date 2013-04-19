package Persistence;

import Model.SavingGoal;
import java.util.ArrayList;
import java.util.List;

public class SavingGoalRepository {

    private static SavingGoal repository = null;
    private List<SavingGoal> listSaving = new ArrayList<SavingGoal>();

    private SavingGoalRepository() {
    }

    public static SavingGoal GetInstance() {
        if (repository == null) {
            repository = new SavingGoal();
        }
        return repository;
    }

    public void save(SavingGoal exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listSaving.add(exp);
    }

    public List<SavingGoal> getListSavings() {
        return listSaving;
    }
}
