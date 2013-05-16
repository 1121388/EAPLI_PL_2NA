/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

/**
 *
 * @author vcosta
 */
import Model.Income;
import Persistence.IncomeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class IncomeRepositoryImpl extends JpaRepository<Income, String> implements IncomeRepository {
    
    
//    public Income findOrCreate(String key, String description) {
//        if (key == null || key.trim().length() == 0) {
//            throw new IllegalArgumentException();
//        }
//        
//        EntityManager em = getEntityManager();
//        assert em != null;
//
//        Income income;
//        Query q = em.createQuery("SELECT inc FROM Income inc WHERE inc.id = :type").setParameter("type", key);
//        try {
//            income = (Income) q.getSingleResult();
//        }
//        catch (NoResultException ex)
//        {
//            income = new Income(description);
//            save(income);           
//        }
//        return income;
//    }   

//    private static IncomeRepository pRepository = null;
//    private static List<Income> pIncomeList = new ArrayList<Income>();
//
//    public static IncomeRepository GetInstance() {
//        //ToDo
//        if (pRepository == null) {
//            pRepository = new IncomeRepositoryImpl();
//        }
//        return pRepository;
//    }
//
//    @Override
//    public Income save(Income aIncome) {
//        //To Do - estava a retornar true or false. Colocar exceções...
////        if (GetInstance().CheckIfNotExist(aExpenseType)) {
////            AddExpenseType(aExpenseType);
////            return aExpenseType;
////        } else {
////            return aExpenseType;
////        }
//
//        AddIncome(aIncome);
//        return aIncome;
//    }
//
//    private void AddIncome(Income aIncome) {
//        pIncomeList.add(aIncome);
//    }
//
//    @Override
//    public String IncomeList(boolean aNumberedList) {
//        String List = "";
//        if (pIncomeList.size() > 0) {
//            for (int i = 0; i < pIncomeList.size(); i++) {
//                if (aNumberedList) {
//                    List = List + "[" + (i + 1) + "] ";
//                } else {
//                    List = List + "- ";
//                }
//                List = List + pIncomeList.get(i).GetDescription() + "\n";
//            }
//        } else {
//            List = List + "No items to display!\n";
//        }
//        return List;
//    }
//
//    @Override
//    public List<Income> IncomeObjectList() {
//        return pIncomeList;
//    }
//
//    @Override
//    public Income GetIncome(int aNrObject) {
//        if (aNrObject > 0 && aNrObject <= pIncomeList.size()) {
//            return pIncomeList.get(aNrObject - 1);
//        } else {
//            return null;
//        }
//    }
//
//    @Override
//    public boolean CheckIfNotExist(Income aIncome) {
//        for (int i = 0; i < pIncomeList.size(); i++) {
//            if (pIncomeList.get(i).GetDescription().equals(aIncome.GetDescription())) {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean saveIncome(Income aIncome) {
        if (aIncome == null) {
            return false;
        }
        boolean SaveResult = false;
        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(aIncome);
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
    public String IncomeList(boolean aNumberedList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Income> IncomeObjectList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Income GetIncome(int aNrObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CheckIfNotExist(Income aIncome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
