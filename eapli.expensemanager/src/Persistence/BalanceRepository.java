/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author Marco
 */
public class BalanceRepository {
    
    private static BalanceRepository bRepository= null;
    
    private double balance;

    public BalanceRepository() {}
    
    public double getBalance(){
        return balance;
    }
    
    public void save(double bal)
    {
       balance=bal;
    }

    
    
}
