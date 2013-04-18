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
    
    Model.ChekingAccount conta;
    
    public BasicController(){
        conta = new ChekingAccount ();
    }
    public BigDecimal currentMonthExpenses()
    {
        return conta.getMonthExpenses();
        
    }
    public BigDecimal currentWeekExpenses()
    {
        return conta.getWeekExpenses();
    }
    
    public Double currentBalance() //se calhar BigDecimal?
    { 
        
        return conta.getSaldo();
    }
}
