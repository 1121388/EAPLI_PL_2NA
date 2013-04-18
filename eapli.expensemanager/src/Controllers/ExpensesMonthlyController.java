/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Model.ChekingAccount;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adao
 */
public class ExpensesMonthlyController {

    public BigDecimal consultaDadosMensais(String mes, String ano)
    {
        int year = Integer.parseInt(ano);
        int month = Integer.parseInt(mes);
        int day = 1;
        Date inicio = new Date(year, month-1, day);
        Date fim = new Date(year, month, day);
        List<Expense> despesas = new ChekingAccount().getExpensesByPeriod(inicio, fim);
        BigDecimal amount = BigDecimal.ZERO; 
        
        // Verificar a existência de despesas para o mês pretendido.
        if ( despesas == null) {
            return amount;
        }
        
        for(int i=0; i<despesas.size(); i++)
        {
            amount = amount.add(despesas.get(i).getAmount());
        }
        
        return amount;
    }
}
