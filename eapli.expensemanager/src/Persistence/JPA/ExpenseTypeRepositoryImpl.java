/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
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
    public boolean SaveExpenseType(ExpenseType aExpenseType) {
        if (aExpenseType == null) {
            return false;
        }
        boolean SaveResult = false;
        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(aExpenseType);
                tx.commit();
                SaveResult = true;
            } catch (PersistenceException ex) {
            }
        } finally {
            em.close();
        }
        return SaveResult;
    }
    
    @Override
    public String ExpenseTypeList(boolean aNumberedList) {
        String List = "";
        List<ExpenseType> ListaObjectos = ExpenseTypeObjectList();
        if (ListaObjectos.size() > 0) {
            for (int i = 0; i < ListaObjectos.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + ListaObjectos.get(i).GetName() + " - " + ListaObjectos.get(i).GetLongName() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }

    @Override
    public List<ExpenseType> ExpenseTypeObjectList() {
        return all();
    }
        
    @Override
    public ExpenseType GetExpenseType(int aNrObject) {
        List<ExpenseType> ListaObjectos = ExpenseTypeObjectList();
        if (aNrObject > 0 && aNrObject <= ListaObjectos.size())
            return ListaObjectos.get(aNrObject - 1);
        else
            return null;
    }
    
}
