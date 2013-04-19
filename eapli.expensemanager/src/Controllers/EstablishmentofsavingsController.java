package Controllers;

import Model.*;
import java.util.Date;

public class EstablishmentofsavingsController extends BasicController {

    EstablishmentofsavingsController() {
    }

    public void createsavings(String desc, double valor, Date data, String Alias) {
        SavingGoal sv = new SavingGoal(desc, valor, data, Alias);
    }
}
