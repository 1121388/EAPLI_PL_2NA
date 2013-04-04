/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import java.util.List;
import Persistence.ExpenseRepository;
import java.util.ArrayList;

/**
 *
 * @author adao
 */
public class ExpensesMonthlyController {

    public List<String> consultaDadosMensais(String mes, String ano)
    {
        List<Expense> j = new ExpenseRepository().getMonthlyExpenses( Integer.parseInt(mes), Integer.parseInt(ano));
        List<String> a = new ArrayList<String>();
        
        for(int i=0; i<j.size(); i++)
        {   
            a.add("Data: "+j.get(i).getDateOccurred()+" Valor: "+j.get(i).getAmount());
        }
        //TODO
        //buscar tipos 
        //criar lista de tipos com ou sem valor
        return a;
    }
}
