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
        //ToDo
        if (pRepository == null)
            pRepository = new ExpenseTypeRepositoryImpl();
        return pRepository;
    }
    
    @Override
    public ExpenseType save(ExpenseType aExpenseType) {
        //To Do - estava a retornar true or false. Colocar exceções...
//        if (GetInstance().CheckIfNotExist(aExpenseType)) {
//            AddExpenseType(aExpenseType);
//            return aExpenseType;
//        } else {
//            return aExpenseType;
//        }
        
        AddExpenseType(aExpenseType);
        return aExpenseType;
    }
    
    private void AddExpenseType(ExpenseType aExpenseType) {
        pExpenseTypeList.add(aExpenseType);
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
    
    @Override
    public boolean CheckIfNotExist(ExpenseType aExpenseType) {
        for (int i = 0; i < pExpenseTypeList.size(); i++)
            if (pExpenseTypeList.get(i).GetName().equals(aExpenseType.GetName()))
                return false;
        return true;
    }
}
