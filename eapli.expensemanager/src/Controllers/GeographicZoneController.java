/**
 * @author adaoss <1030066>
 */

package Controllers;

import Model.GeographicZone;
import Persistence.GeographicZoneRepository;
import Persistence.PersistenceFactory;

public class GeographicZoneController extends BasicController {
    
    private GeographicZoneRepository  pRepo =  PersistenceFactory.buildPersistenceFactory().geographicZoneRepository();

    
    public GeographicZoneController() {}
    
    public GeographicZone RegisterGeographicZone(String aDescription) {
        GeographicZone pObj = new GeographicZone(aDescription);
        return pRepo.save(pObj);
    }
    public String GeographicZoneList(boolean aNumberedList) {
        return pRepo.GeographicZoneList(aNumberedList);
    }
    
    public GeographicZone GetGeographicZone(int aNrObject) {
        return pRepo.GetGeographicZone(aNrObject);
    }
    
}
