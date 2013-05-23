/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;


/**
 *
 * @author MNLyle
 */
public class ExpenseRepositoryImpl extends JpaRepository<Expense, String> implements ExpenseRepository {

    @Override
    public ExpenseRepository GetInstance() {
        return new ExpenseRepositoryImpl();
    }
    
    @Override
    public List<Expense> getListExpense() { 
        return all();
    }
    

    @Override
    public void saveExpense(Expense exp) {

        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(exp);
                tx.commit();

            } catch (PersistenceException ex) {
            }
        } finally {
            em.close();
        }
 
    }

}
