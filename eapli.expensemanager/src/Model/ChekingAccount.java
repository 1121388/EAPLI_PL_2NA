/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author pseeno
 */

public class ChekingAccount {
    
    BigDecimal saldo;
    
    ArrayList<Expense> despesas = new ArrayList<Expense>();
    ArrayList<Recepies> receitas = new ArrayList<Recepies>();
      
    public void getSaldo(){
    
    saldo = this.saldo; 
    
    }
    
}
