/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.*;
import java.util.List;


/**
 *
 * @author MNLyle
 */
public interface ExpenseRepository {
    
    public abstract ExpenseRepository GetInstance();
    
    public abstract List<Expense> getListExpense();
    
    public abstract void save(Expense exp);
    
}
