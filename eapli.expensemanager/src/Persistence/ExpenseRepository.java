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
    private static List<Expense> listExpense= new ArrayList<Expense>();

    public ExpenseRepository() {}
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }
    /** 
     * Função utilizada para devolver uma lista da despesas relativa a um mês 
     * Hugo Silva
     * 22/03/2013
     */
    public List<Expense> getMonthlyExpenses(int mes, int ano)
    {        
        List<Expense> data = new ArrayList<Expense>();
        
        Date dini = new Date(ano, mes, 1);
        Date dfim;
        
        if(mes==12)
            dfim = new Date(ano+1, 1, 1);
        else
            dfim = new Date(ano, mes+1, 1);

        for (int i=0; i<listExpense.size();i++)
        {
            if(dini.compareTo(listExpense.get(i).getDateOccurred()) * listExpense.get(i).getDateOccurred().compareTo(dfim) > 0)
                data.add(listExpense.get(i));
        }
        return data;
    }
}
