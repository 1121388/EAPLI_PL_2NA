/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;
import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nuno
 */


 
public class IncomeTypeRepositoryImpl implements IncomeTypeRepository {
    
    private static IncomeTypeRepository pRepository = null;
    
    private static List<IncomeType> pIncomeTypeList = new ArrayList<IncomeType>();
      
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
                List = List + pIncomeTypeList.get(i).getShortID()+ " - " + pIncomeTypeList.get(i).getDescription()+ "\n";
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
    
    private boolean CheckIfNotExist(IncomeType aIncomeType) {
        for (int i = 0; i < pIncomeTypeList.size(); i++)
            if (pIncomeTypeList.get(i).getDescription().equals(aIncomeType.getDescription()))
                return false;
        return true;
    }

    @Override
    public List<IncomeType> getIncomeTypes() {
        return pIncomeTypeList;
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

