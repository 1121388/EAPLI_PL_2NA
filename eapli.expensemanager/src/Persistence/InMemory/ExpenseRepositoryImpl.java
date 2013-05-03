
package Persistence.InMemory;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.ArrayList;
import java.util.List;



public class ExpenseRepositoryImpl implements ExpenseRepository {

    private static ExpenseRepositoryImpl repository = null;
    private List<Expense> listExpense= new ArrayList<Expense>();
    
    
    @Override
    public ExpenseRepositoryImpl GetInstance() {
        if (repository == null)
            repository = new ExpenseRepositoryImpl() {};
        return repository;
    }
  
    @Override
    public List<Expense> getListExpense(){
        return listExpense;
    }
    
    @Override
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }
}

