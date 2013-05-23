/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.LimitType;
import Persistence.LimitTypeRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author arocha
 */
public class LimitTypeRepositoryImpl extends JpaRepository<LimitType, String> implements LimitTypeRepository {

    public LimitType findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        LimitType LimitType;
        Query q = em.createQuery("SELECT et FROM LimitType et WHERE et.id = :type").setParameter("type", key);
        try {
            LimitType = (LimitType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            LimitType = new LimitType(Integer.parseInt(key), description);
            save(LimitType);           
        }
        return LimitType;
    }   
    
    
    @Override
    public List<LimitType> getListLimit() {
                
        EntityManager em = getEntityManager();
        assert em != null;

        List<LimitType> listLimit = new ArrayList<LimitType>();
        Query q = em.createQuery("SELECT lt FROM LimitType lt");
        try {
            listLimit = q.getResultList();
        }
        catch (NoResultException ex)
        {
            System.out.println("No Limit type list values.");
        }
        return listLimit;
    }
    
    @Override
    public LimitType save(LimitType l)
    {  
        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(l);
            tx.commit();
        } finally {
            em.close();
        }        
        return l;
    }
}
