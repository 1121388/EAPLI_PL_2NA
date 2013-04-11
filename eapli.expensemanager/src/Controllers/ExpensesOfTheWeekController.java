/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ChekingAccount;
import Model.Expense;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author i111051
 */
public class ExpensesOfTheWeekController {
    
    Model.ChekingAccount conta;
    
    public ExpensesOfTheWeekController(){
        conta = new ChekingAccount ();
    }

    public BigDecimal currentlyWeekExpenses()
    {
        return conta.getWeekExpenses();
    }
}
