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
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author nunovsilva
 */
public class IncomeTypeRepositoryImpl extends JpaRepository<IncomeType, String> implements IncomeTypeRepository {
    
    private static IncomeTypeRepository pRepository = null;
    private static List<IncomeType> pIncomeTypeList = new ArrayList<IncomeType>();

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
            incomeType = new IncomeType(description);
            save(incomeType);           
        }
        return incomeType;
    }
    
    
    public static IncomeTypeRepository GetInstance() {
        if (pRepository == null)
            pRepository = new IncomeTypeRepositoryImpl();
        return pRepository;
    }
    
    
    @Override
    public boolean SaveIncomeType(IncomeType aIncomeType) {
        if (CheckIfNotExist(aIncomeType)) {
            pIncomeTypeList.add(aIncomeType);
            return true;
        } else {
            return false;
        }
    }
    
    
    @Override
    public String IncomeTypeList(boolean aNumberedList) {
        String List = "";
        if (pIncomeTypeList.size() > 0) {
            for (int i = 0; i < pIncomeTypeList.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + pIncomeTypeList.get(i).getShortID() + " - " + pIncomeTypeList.get(i).getDescription() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }
    
    
    @Override
    public List<IncomeType> IncomeTypeObjectList() {
        return pIncomeTypeList;
    }
    
    
    @Override
    public IncomeType GetIncomeType(int aNrObject) {
        if (aNrObject > 0 && aNrObject <= pIncomeTypeList.size())
            return pIncomeTypeList.get(aNrObject - 1);
        else
            return null;
    }

//    @Override
//    public String IncomeTypeList(boolean aNumberedList) {
//        String List = "1-xx";
//        
//        // To Do - rever código abaixo.
//        
////        if (pExpenseTypeList.size() > 0) {
////            for (int i = 0; i < pExpenseTypeList.size(); i++) {
////                if (aNumberedList)
////                    List = List + "[" + (i + 1) + "] ";
////                else
////                    List = List + "- ";
////                List = List + pExpenseTypeList.get(i).GetDescription() + "\n";
////            }
////        } else {
////            List = List + "No items to display!\n";
////        }
//        return List;
//    }

//    @Override
//    public List<IncomeType> IncomeTypeObjectList() {
//        // ToDo
//        //return pExpenseTypeList;
//        return null;
//    }
//        

        
    public boolean CheckIfNotExist(IncomeType aIncomeType) {
        for (int i = 0; i < pIncomeTypeList.size(); i++)
            if ((pIncomeTypeList.get(i).getDescription()).equals(aIncomeType.getDescription()))
                return false;
        return true; 
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IncomeType getIncomeTypeByDescription(String desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
