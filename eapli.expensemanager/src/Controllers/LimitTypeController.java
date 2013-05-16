/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.LimitType;
import Persistence.LimitTypeRepository;
import Persistence.PersistenceFactory;
/**
 *
 * @author Ana
 */
public class LimitTypeController extends BasicController {
    

    private LimitTypeRepository pRepository = PersistenceFactory.buildPersistenceFactory().LimitTypeRepository();

    public LimitTypeController() {}
    
    public LimitType createLimitType(int aId, String aName) {
        LimitType pLimitType = new LimitType(aId, aName);
        return pRepository.save(pLimitType);
    }
}
