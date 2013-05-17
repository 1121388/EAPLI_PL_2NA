/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 *
 * @author nunovsilva
 */
public class IncomeTypeRepositoryImpl extends JpaRepository<IncomeType, String> implements IncomeTypeRepository {

    public IncomeType findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        IncomeType incomeType;
        Query q = em.createQuery("SELECT et FROM IncomeType et WHERE et.id = :type").setParameter("type", key);
        try {
            incomeType = (IncomeType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            incomeType = new IncomeType(key, description);
            save(incomeType);           
        }
        return incomeType;
    }   

    @Override
    public boolean SaveIncomeType(IncomeType aIncomeType) {
        if (aIncomeType == null) {
            return false;
        }
        boolean SaveResult = false;
        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(aIncomeType);
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
    public String IncomeTypeList(boolean aNumberedList) {
        String List = "";
        List<IncomeType> ListaObjectos = IncomeTypeObjectList();
        if (ListaObjectos.size() > 0) {
            for (int i = 0; i < ListaObjectos.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + ListaObjectos.get(i).getShortID()+ " - " + ListaObjectos.get(i).getDescription() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }

    @Override
    public List<IncomeType> IncomeTypeObjectList() {
        return all();
    }
        
    @Override
    public IncomeType GetIncomeType(int aNrObject) {
        List<IncomeType> ListaObjectos = IncomeTypeObjectList();
        if (aNrObject > 0 && aNrObject <= ListaObjectos.size())
            return ListaObjectos.get(aNrObject - 1);
        else
            return null;
    }
    

    @Override
    public IncomeType save(IncomeType inc) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeType> getIncomeTypes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getIncomeTypesStrings() {

        
        List<String> list=new ArrayList<String>();
        
        for (IncomeType inc:IncomeTypeObjectList())
            list.add(inc.getDescription());
        
        return list;
    }
     

    @Override
    public IncomeType getIncomeTypeByDescription(String desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
