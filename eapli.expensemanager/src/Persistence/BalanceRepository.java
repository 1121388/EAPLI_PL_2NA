/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.math.BigDecimal;

/**
 *
 * @author Marco
 */
public class BalanceRepository {

    private BigDecimal initialBalance;
    
    private static BalanceRepository uniqueInstance = new BalanceRepository();

    private BalanceRepository() {
        
    }

    public static BalanceRepository getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BalanceRepository();
        }
        return uniqueInstance;
    }

    public void setBalance(BigDecimal bal) {
        initialBalance = bal;
    }
    
    public BigDecimal getBalance() {
        return initialBalance;
    }
}
