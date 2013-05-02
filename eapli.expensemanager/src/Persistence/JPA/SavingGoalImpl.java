package Persistence.JPA;

import Model.SavingGoal;
import Persistence.SavingGoalRepository;

public class SavingGoalImpl extends JpaRepository<SavingGoal, String> implements SavingGoalRepository {
}
