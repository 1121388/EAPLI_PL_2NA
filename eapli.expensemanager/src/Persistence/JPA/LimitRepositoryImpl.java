/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Limit;
import Model.LimitType;
import Persistence.LimitRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author arocha
 */
public class LimitRepositoryImpl extends JpaRepository<Limit, String> implements LimitRepository {

    public Limit findOrCreate(LimitType type, BigDecimal yellow, BigDecimal red) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        Limit Limit;
        Query q = em.createQuery("SELECT et FROM Limit et WHERE et.id = :type").setParameter("type", type);
        try {
            Limit = (Limit) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            Limit = new Limit(type, yellow, red);
            save(Limit);           
        }
        return Limit;
    }   
    
    
    @Override
    public List<Limit> getListLimit() {
                
        EntityManager em = getEntityManager();
        assert em != null;

        List<Limit> listLimit = new ArrayList<Limit>();
        Query q = em.createQuery("SELECT * FROM Limit");
        try {
            listLimit = (ArrayList<Limit>) q.getResultList();
        }
        catch (NoResultException ex)
        {
            //Nao tem valores
        }
        return listLimit;
        
        //return listLimit;
    }
    
    @Override
    public Limit save(Limit l)
    {  
        EntityManager em = getEntityManager();
        assert em != null;
        em.getTransaction().begin();
        
        em.persist(l);
        em.getTransaction().commit();
        em.close();
        
        return l;
    }
}
