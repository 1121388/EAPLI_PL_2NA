/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ChekingAccount;
import java.math.BigDecimal;

/**
 *
 * @author i111051
 */
public class BasicController {
    Model.ChekingAccount conta = null;
    
    public BasicController()
    {
        conta = new ChekingAccount();
    }
    
    public BigDecimal currentMonthExpenses()
    {
        if (conta == null)
            conta = new ChekingAccount();
        return conta.getMonthExpenses();
        
    }
    
    public BigDecimal currentWeekExpenses()
    {
        if (conta == null)
            conta = new ChekingAccount();
        return conta.getWeekExpenses();
    }
    
    public Double currentBalance() //se calhar BigDecimal?
    { 
        if (conta == null)
            conta = new ChekingAccount();
        return conta.getSaldo();
    }
}
