/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author arocha
 */
public class ExpenseTypeRepositoryImpl implements ExpenseTypeRepository {
    private static ExpenseTypeRepository pRepository = null;
    private static List<ExpenseType> pExpenseTypeList = new ArrayList<ExpenseType>();
      
    public static ExpenseTypeRepository GetInstance() {
        if (pRepository == null)
            pRepository = new ExpenseTypeRepositoryImpl();
        return pRepository;
    }
    
    @Override
    public boolean SaveExpenseType(ExpenseType aExpenseType) {
        if (CheckIfNotExist(aExpenseType)) {
            pExpenseTypeList.add(aExpenseType);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String ExpenseTypeList(boolean aNumberedList) {
        String List = "";
        if (pExpenseTypeList.size() > 0) {
            for (int i = 0; i < pExpenseTypeList.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + pExpenseTypeList.get(i).GetName() + " - " + pExpenseTypeList.get(i).GetLongName() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }

    @Override
    public List<ExpenseType> ExpenseTypeObjectList() {
        return pExpenseTypeList;
    }

    @Override
    public ExpenseType GetExpenseType(int aNrObject) {
        if (aNrObject > 0 && aNrObject <= pExpenseTypeList.size())
            return pExpenseTypeList.get(aNrObject - 1);
        else
            return null;
    }
    
    private boolean CheckIfNotExist(ExpenseType aExpenseType) {
        for (int i = 0; i < pExpenseTypeList.size(); i++)
            if (pExpenseTypeList.get(i).GetName().equals(aExpenseType.GetName()))
                return false;
        return true;
    }
}
