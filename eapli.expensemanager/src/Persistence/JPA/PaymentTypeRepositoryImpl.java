/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.PaymentType;
import Persistence.PaymentTypeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;


/**
 *
 * @author Abilio
 */
public class PaymentTypeRepositoryImpl extends JpaRepository<PaymentType, String> implements PaymentTypeRepository {

    @Override
    public void AddPaymentType(PaymentType paymentType) {
        
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
        
        List<PaymentType> PaymentTypeList = all();
        String list = "\nPayment types list:\n";
            for (int i = 0; i < PaymentTypeList.size(); i++) {
                list = list + (i + 1) + " -> " + PaymentTypeList.get(i).getAlias() + "\n";
            }
        return list;
    }

    @Override
    public PaymentType GetPaymentType(int pos) {
        
        List<PaymentType> ListaObjectos = all();
        if (pos > 0 && pos <= ListaObjectos.size())
            return ListaObjectos.get(pos - 1);
        else
            return null;
    }
    
}
