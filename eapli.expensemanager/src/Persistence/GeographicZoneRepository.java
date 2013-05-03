/**
 *
 * @author adaoss <1030066>
 */

package Persistence;

import Model.GeographicZone;
import java.util.ArrayList;
import java.util.List;

public interface GeographicZoneRepository {    
    public GeographicZone save(GeographicZone Obj); 
    public String GeographicZoneList(boolean aNumberedList);
    public List<GeographicZone> GeographicZoneObjectList();
    public GeographicZone GetGeographicZone(int aNrObject);
    public boolean CheckIfNotExist(GeographicZone Obj);
   
}
