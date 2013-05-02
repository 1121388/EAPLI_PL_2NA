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
public interface ExpenseTypeRepository {
    
    public ExpenseType save(ExpenseType aExpenseType); //Nome original era SaveExpenseType
    //private void AddExpenseType(ExpenseType aExpenseType); // save and Add???
    public String ExpenseTypeList(boolean aNumberedList);
    public List<ExpenseType> ExpenseTypeObjectList();
    public ExpenseType GetExpenseType(int aNrObject);
    public boolean CheckIfNotExist(ExpenseType aExpenseType);
    
    
//    private static ExpenseTypeRepository pRepository = null;
//    private List<ExpenseType> pExpenseTypeList = new ArrayList<ExpenseType>();
//    
//    private ExpenseTypeRepository() {}
//    
//    public static ExpenseTypeRepository GetInstance() {
//        if (pRepository == null)
//            pRepository = new ExpenseTypeRepository();
//        return pRepository;
//    }
//    
//    public boolean SaveExpenseType(ExpenseType aExpenseType) {
//        if (pRepository.CheckIfNotExist(aExpenseType)) {
//            AddExpenseType(aExpenseType);
//            return true;
//        } else {
//            return false;
//        }
//    }
//    
//    private void AddExpenseType(ExpenseType aExpenseType) {
//        pExpenseTypeList.add(aExpenseType);
//    }
//    
//    public String ExpenseTypeList(boolean aNumberedList) {
//        String List = "";
//        if (pExpenseTypeList.size() > 0) {
//            for (int i = 0; i < pExpenseTypeList.size(); i++) {
//                if (aNumberedList)
//                    List = List + "[" + (i + 1) + "] ";
//                else
//                    List = List + "- ";
//                List = List + pExpenseTypeList.get(i).GetDescription() + "\n";
//            }
//        } else {
//            List = List + "No items to display!\n";
//        }
//        return List;
//    }
//
//    public List<ExpenseType> ExpenseTypeObjectList() {
//        return pExpenseTypeList;
//    }
//        
//    public ExpenseType GetExpenseType(int aNrObject) {
//        if (aNrObject > 0 && aNrObject <= pExpenseTypeList.size())
//            return pExpenseTypeList.get(aNrObject - 1);
//        else
//            return null;
//    }
//    
//    public boolean CheckIfNotExist(ExpenseType aExpenseType) {
//        for (int i = 0; i < pExpenseTypeList.size(); i++)
//            if (pExpenseTypeList.get(i).GetDescription().equals(aExpenseType.GetDescription()))
//                return false;
//        return true;
//    }
//    
}
