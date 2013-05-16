/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.Limit;
import Model.LimitType;
import Persistence.LimitRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author Hugo Silva
 */
public class LimitController extends BasicController {
    
    //LimitRepository repo = LimitRepository.GetInstance();
    LimitRepository repo = PersistenceFactory.buildPersistenceFactory().LimitRepository();
    
    public LimitController() {
    }
    
    public void createLimit(Integer id, BigDecimal v1, BigDecimal v2) {
        LimitType t = new LimitType(id, null);
        Limit tmp = new Limit( t, v1, v2);
        repo.save(tmp);
    }
}
