/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.Limit;
import Model.LimitType;
import Persistence.LimitRepository;
import Persistence.LimitTypeRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Hugo Silva
 */
public class LimitController extends BasicController {
    
    LimitRepository repo = PersistenceFactory.buildPersistenceFactory().LimitRepository();
    LimitTypeRepository repoType = PersistenceFactory.buildPersistenceFactory().LimitTypeRepository();
    
    public LimitController() {}
    
    public void createLimit(LimitType id, BigDecimal v1, BigDecimal v2) {
        Limit tmp = new Limit( id, v1, v2);
        repo.save(tmp);
    }
    
    public List<LimitType> getLimitTypeList() {
        return repoType.getListLimit();
    }
}
