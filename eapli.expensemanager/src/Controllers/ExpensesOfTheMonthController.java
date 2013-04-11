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
public class ExpensesOfTheMonthController {
    
    Model.ChekingAccount conta;
    
    public ExpensesOfTheMonthController(){
        conta = new ChekingAccount ();
    }

    public BigDecimal currentlyMonthExpenses()
    {
        //return conta.getMonthExpenses();
        return null;
        
    }
}
