/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author arocha
 */
public class ExpenseTypeRepositoryImpl extends JpaRepository<ExpenseType, String> implements ExpenseTypeRepository {

    public ExpenseType findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        ExpenseType expenseType;
        Query q = em.createQuery("SELECT et FROM ExpenseType et WHERE et.id = :type").setParameter("type", key);
        try {
            expenseType = (ExpenseType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            expenseType = new ExpenseType(key, description);
            save(expenseType);           
        }
        return expenseType;
    }   

    @Override
    public String ExpenseTypeList(boolean aNumberedList) {
        String List = "1-xx";
        
        // To Do - rever código abaixo.
        
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
        return List;
    }

    @Override
    public List<ExpenseType> ExpenseTypeObjectList() {
        // ToDo
        //return pExpenseTypeList;
        return null;
    }
        
    @Override
    public ExpenseType GetExpenseType(int aNrObject) {
//        if (aNrObject > 0 && aNrObject <= pExpenseTypeList.size())
//            return pExpenseTypeList.get(aNrObject - 1);
//        else
//            return null;
        //ToDo
        return null;
    }
    
    @Override
    public boolean CheckIfNotExist(ExpenseType aExpenseType) {
//        for (int i = 0; i < pExpenseTypeList.size(); i++)
//            if (pExpenseTypeList.get(i).GetDescription().equals(aExpenseType.GetDescription()))
//                return false;
//        return true;
        
        //ToDo
        return false;
    }
}
