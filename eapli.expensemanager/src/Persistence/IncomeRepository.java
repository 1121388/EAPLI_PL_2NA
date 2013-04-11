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
 * @author jfoliveira
 */
public class IncomeRepository implements IIncomeRepository{

       // class member
    private static List<Income> listIncome= new ArrayList<Income>();

    public IncomeRepository() {}
    
    public void save(Income inc)
    {
        if (inc==null) throw new IllegalArgumentException();
        listIncome.add(inc);
      
    }
    
    public List<Income> getListIncome(){
        return listIncome;
    }
    
    public List<Income> getMonthlyIncomes(int mes, int ano)
    {        
        List<Income> data = new ArrayList<Income>();
        
        Date dini = new Date(ano, mes, 1);
        Date dfim;
        
        if(mes==12)
            dfim = new Date(ano+1, 1, 1);
        else
            dfim = new Date(ano, mes+1, 1);
/*
        for (int i=0; i<listIncome.size();i++)
        {
            if(dini.compareTo(listIncome.get(i).getDateOccurred()) * listIncome.get(i).getDateOccurred().compareTo(dfim) > 0)
                data.add(listIncome.get(i));
        }*/
        return data;
    }
    
    
    
    
}
