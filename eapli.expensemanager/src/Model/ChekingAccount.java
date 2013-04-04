/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author psereno
 */

public class ChekingAccount {
    
    BigDecimal saldo, tdespesas, treceitas;
    
    ArrayList<Expense> despesas = new ArrayList<Expense>();
    ArrayList<Recepies> receitas = new ArrayList<Recepies>();
      
    public void getSaldo(){
    
    //saldo.add();
    saldo.add(treceitas);
    saldo.subtract(tdespesas);
    
    }
    
     public void determinaTotalDespesas(){
    
         for (int i = 0; i < despesas.size(); i++) {
             
             tdespesas.add((despesas.get(i)).getAmount()); 
         }
    }
     
     public void determinaTotalrendimento(){
    
         for (int i = 0; i < receitas.size(); i++) {
             
             treceitas.add((receitas.get(i)).getAmount()); 
         }
    }
}
