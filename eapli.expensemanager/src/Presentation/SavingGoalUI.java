package Presentation;

import Controllers.BasicController;
import Controllers.SavingGoalController;
import eapli.util.Console;
import java.util.Date;

public class SavingGoalUI extends BasicUI {

    private SavingGoalController controller = new SavingGoalController();

    @Override
    public void getBody() {

        String name = Console.readLine("Description:");
        double valor = Console.readDouble("Value:");
        Date date = Console.readDate("Date:");
        String aliass = Console.readLine("Alias ??:");

        controller.CreateSavingGoal(name, valor, date, aliass);
        System.out.println("Saving Goal recorded.");
    }

    @Override
    public String getTitle() {
        return "Establishment of savings";
    }

    @Override
    public BasicController getController() {
        return controller;
    }
}
