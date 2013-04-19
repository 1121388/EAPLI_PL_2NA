
package Controllers;

import Model.ChekingAccount;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author adao . 1030066
 */
public class ExpensesMonthlyController {

    public HashMap<String,BigDecimal> consultaDadosMensais(Date inicio, Date fim)
    {
        ChekingAccount acc = new ChekingAccount();
        return acc.getMonthlyExpenses(inicio, fim);
    }
}
