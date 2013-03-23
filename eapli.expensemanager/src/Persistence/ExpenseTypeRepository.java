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
    
    private List<ExpenseType> ExpenseTypeList = new ArrayList<ExpenseType>();
    
    public ExpenseTypeRepository() {}
    
    public void SaveExpenseType(ExpenseType aExpenseType) {
        AddExpenseType(aExpenseType);
    }
    
    private void AddExpenseType(ExpenseType aExpenseType) {
        ExpenseTypeList.add(aExpenseType);
    }
    
    public String ExpenseTypeList() {
        String List = "";
        if (ExpenseTypeList.size() > 0) {
            List = "\nExpense types list:\n";
            for (int i = 0; i < ExpenseTypeList.size(); i++) {
                List = List + "[" + (i + 1) + "] " + ExpenseTypeList.get(i).GetDescription() + "\n";
            }
        }
        return List;
    }

    
}
