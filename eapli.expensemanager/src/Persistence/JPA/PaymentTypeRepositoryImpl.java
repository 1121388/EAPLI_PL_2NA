/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Cash;
import Persistence.PaymentTypeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;


/**
 *
 * @author Abilio
 */
public class PaymentTypeRepositoryImpl extends JpaRepository<Cash, String> implements PaymentTypeRepository {

    @Override
    public void AddPaymentType(Cash paymentType) {
        
        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(paymentType);
                tx.commit();
            } catch (PersistenceException ex) {
            }
        } finally {
            em.close();
        }
    }

    @Override
    public String listPaymentTypeList() {
        
        List<Cash> PaymentTypeList = all();
        String list = "\nPayment types list:\n";
            for (int i = 0; i < PaymentTypeList.size(); i++) {
                list = list + (i + 1) + " -> " + PaymentTypeList.get(i).getAlias() + "\n";
            }
        return list;
    }

    @Override
    public Cash GetPaymentType(int pos) {
        
        List<Cash> ListaObjectos = all();
        if (pos > 0 && pos <= ListaObjectos.size())
            return ListaObjectos.get(pos - 1);
        else
            return null;
    }
    
}
