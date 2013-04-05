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
    
    public String ExpenseTypeList(boolean aNumberedList) {
        String List = "";
        if (pExpenseTypeList.size() > 0) {
            for (int i = 0; i < pExpenseTypeList.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + pExpenseTypeList.get(i).GetDescription() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }

    public List<ExpenseType> ExpenseTypeObjectList() {
        return pExpenseTypeList;
    }
        
    public ExpenseType GetExpenseType(int aNrObject) {
        if (aNrObject > 0 && aNrObject <= pExpenseTypeList.size())
            return pExpenseTypeList.get(aNrObject - 1);
        else
            return null;
    }
    
}
