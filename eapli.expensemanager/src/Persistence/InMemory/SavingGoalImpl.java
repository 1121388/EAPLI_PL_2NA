package Persistence.InMemory;

import Model.SavingGoal;
import Persistence.SavingGoalRepository;
import java.util.ArrayList;
import java.util.List;

public class SavingGoalImpl implements SavingGoalRepository {

    private static SavingGoal repository = null;
    private List<SavingGoal> listSaving = new ArrayList<SavingGoal>();

    private SavingGoalImpl() {
    }

    public static SavingGoal GetInstance() {
        if (repository == null) {
            repository = new SavingGoal();
        }
        return repository;
    }

    @Override
    public SavingGoal save(SavingGoal exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listSaving.add(exp);
        return repository;
    }

    @Override
    public List<SavingGoal> all() {
        return listSaving;
    }
}
