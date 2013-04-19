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
    private static IncomeRepository repository = null;
    private List<Income> listIncome= new ArrayList<Income>();

    private IncomeRepository() {}
    
    public static IncomeRepository GetInstance() {
        if (repository == null)
            repository = new IncomeRepository();
        return repository;
    }
    
    public List<Income> getListIncome(){
        return listIncome;
    }

    public void save(Income inc)
    {
        if (inc==null) throw new IllegalArgumentException();
        listIncome.add(inc);
      
    }
    
    
    
    
}
