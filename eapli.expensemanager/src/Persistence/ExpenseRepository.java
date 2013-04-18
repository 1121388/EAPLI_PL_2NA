/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 *
 * @author losa
 */
public class ExpenseRepository  implements IExpenseRepository
{
    // class member
    private static ExpenseRepository repository = null;
    private List<Expense> listExpense= new ArrayList<Expense>();

    private ExpenseRepository() {}
    
    public static ExpenseRepository GetInstance() {
        if (repository == null)
            repository = new ExpenseRepository();
        return repository;
    }
    
    public List<Expense> getListExpense(){
        return listExpense;
    }
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }

}
