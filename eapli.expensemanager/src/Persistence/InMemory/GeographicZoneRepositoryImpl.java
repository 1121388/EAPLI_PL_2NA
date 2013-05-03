package Persistence.InMemory;

import Model.GeographicZone;
import Persistence.GeographicZoneRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adaoss <1030066>
 */

public class GeographicZoneRepositoryImpl implements GeographicZoneRepository {
    private static GeographicZoneRepository pRepository = null;
    private static List<GeographicZone> pList = new ArrayList<GeographicZone>();
      
    public static GeographicZoneRepository GetInstance() {
        //ToDo
        if (pRepository == null)
            pRepository = new GeographicZoneRepositoryImpl();
        return pRepository;
    }
    
    @Override
    public GeographicZone save(GeographicZone tRecord) {
   
        AddExpenseType(tRecord);
        return tRecord;
    }
    
    private void AddExpenseType(GeographicZone aExpenseType) {
        pList.add(aExpenseType);
    }
    
    @Override
    public String GeographicZoneList(boolean aNumberedList) {
        String List = "";
        if (pList.size() > 0) {
            for (int i = 0; i < pList.size(); i++) {
                if (aNumberedList)
                    List = List + "[" + (i + 1) + "] ";
                else
                    List = List + "- ";
                List = List + pList.get(i).getDescription() + "\n";
            }
        } else {
            List = List + "No items to display!\n";
        }
        return List;
    }

    @Override
    public List<GeographicZone> GeographicZoneObjectList() {
        return pList;
    }

    @Override
    public GeographicZone GetGeographicZone(int aNrObject) {
        if (aNrObject > 0 && aNrObject <= pList.size())
            return pList.get(aNrObject - 1);
        else
            return null;
    }
    
    @Override
    public boolean CheckIfNotExist(GeographicZone aObj) {
        for (int i = 0; i < pList.size(); i++)
            if (pList.get(i).getDescription().equals(aObj.getDescription()))
                return false;
        return true;
    }
}
