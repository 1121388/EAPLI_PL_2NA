/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Income;
import Persistence.IncomeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vcosta
 */
public class IncomeRepositoryImpl implements IncomeRepository {
    private static IncomeRepository pRepository = null;
    private static List<Income> pIncomeList = new ArrayList<Income>();
      
    public static IncomeRepository GetInstance() {
        //ToDo
        if (pRepository == null)
            pRepository = new IncomeRepositoryImpl();
        return pRepository;
    }
    
    @Override
    public boolean saveIncome(Income aIncome) {
        //To Do - estava a retornar true or false. Colocar exceções...
//        if (GetInstance().CheckIfNotExist(aExpenseType)) {
//            AddExpenseType(aExpenseType);
//            return aExpenseType;
//        } else {
//            return aExpenseType;
//        }
        
        AddIncome(aIncome);
        return true;
    }
    
    private void AddIncome(Income aIncome) {
        pIncomeList.add(aIncome);
    }
    
    @Override
    public String IncomeList(boolean aNumberedList) {
        String List = "";
        if (pIncomeList.size() > 0) {
            for (int i = 0; i < pIncomeList.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + pIncomeList.get(i).GetDescription() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }

    @Override
    public List<Income> IncomeObjectList() {
        return pIncomeList;
    }
        
    @Override
    public Income GetIncome(int aNrObject) {
        if (aNrObject > 0 && aNrObject <= pIncomeList.size())
            return pIncomeList.get(aNrObject - 1);
        else
            return null;
    }
    
//    @Override
//    public boolean CheckIfNotExist(Income aIncome) {
//        for (int i = 0; i < pIncomeList.size(); i++)
//            if (pIncomeList.get(i).GetDescription().equals(aIncome.GetDescription()))
//                return false;
//        return true;
//    }
}
