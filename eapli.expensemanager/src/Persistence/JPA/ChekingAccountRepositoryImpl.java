/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.ChekingAccount;
import Persistence.ChekingAccountRepository;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Marco
 */
public class ChekingAccountRepositoryImpl extends JpaRepository<ChekingAccount, String> implements ChekingAccountRepository {

    @Override
    public ChekingAccount GetChekingAccount() {
        String key = "1";

        EntityManager em = getEntityManager();
        assert em != null;

        ChekingAccount checkaccount;
        Query q = em.createQuery("SELECT et FROM ChekingAccount et WHERE et.id = :type").setParameter("type", key);
        try {
            checkaccount = (ChekingAccount) q.getSingleResult();
        } catch (NoResultException ex) {
            checkaccount = new ChekingAccount(key, "2NA");
            save(checkaccount);
        }
        return checkaccount;
    }

    @Override
    public void SaveChekingAccount(ChekingAccount aChekingAccount) {
        save(aChekingAccount);
    }
}
