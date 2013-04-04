/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseTypeRepository {
    
    private static ExpenseTypeRepository pRepository = null;
    private List<ExpenseType> pExpenseTypeList = new ArrayList<ExpenseType>();
    
    private ExpenseTypeRepository() {}
    
    public static ExpenseTypeRepository GetInstance() {
        if (pRepository == null)
            pRepository = new ExpenseTypeRepository();
        return pRepository;
    }
    
    public void SaveExpenseType(ExpenseType aExpenseType) {
        AddExpenseType(aExpenseType);
    }
    
    private void AddExpenseType(ExpenseType aExpenseType) {
        pExpenseTypeList.add(aExpenseType);
    }
    
    public String ExpenseTypeList() {
        String List = "";
        if (pExpenseTypeList.size() > 0) {
            List = "\nExpense types list:\n";
            for (int i = 0; i < pExpenseTypeList.size(); i++) {
                List = List + "[" + (i + 1) + "] " + pExpenseTypeList.get(i).GetDescription() + "\n";
            }
        }
        return List;
    }

    public List<ExpenseType> ExpenseTypeObjectList() {
        return pExpenseTypeList;
    }
        
    public ExpenseType GetExpenseType(int aNrObject) {
        return pExpenseTypeList.get(aNrObject - 1);
    }
    
}
