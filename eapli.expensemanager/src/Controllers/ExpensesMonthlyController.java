/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import java.util.List;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author adao
 */
public class ExpensesMonthlyController {

    public List<String> consultaDadosMensais(String mes, String ano)
    {
        List<Expense> despesas = new ExpenseRepository().getMonthlyExpenses( Integer.parseInt(mes), Integer.parseInt(ano));
        List<String> result = new ArrayList<String>(); 
        List<BigDecimal> amountList = new ArrayList<BigDecimal>(); 
        
        List<ExpenseType> typeList = new ExpenseTypeRepository().ExpenseTypeObjectList();
        
        for(int i=0; i<typeList.size(); i++)
        {   
            amountList.add(BigDecimal.ZERO);
            
            for(int j=0; j<despesas.size(); j++)
            {   
                if(despesas.get(j).getExpenseType() == typeList.get(i))
                {
                    amountList.set(i, (amountList.get(i).add(despesas.get(j).getAmount())));
                }
            }
            
            result.add( "Despesa do Tipo: "+typeList.get(i).GetDescription()+" Gasto: "+amountList.get(i)+" €");
        }
        
        return result;
    }
}
