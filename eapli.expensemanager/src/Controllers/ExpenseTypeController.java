/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseTypeController extends BasicController {

    private ExpenseTypeRepository pRepository = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();

    
    public ExpenseTypeController() {}
    
    public boolean RegisterExpenseType(String aName, String aLongName) {
        ExpenseType pExpenseType = new ExpenseType(aName, aLongName);
        return pRepository.SaveExpenseType(pExpenseType);
    }
    public String ExpenseTypeList(boolean aNumberedList) {
        return pRepository.ExpenseTypeList(aNumberedList);
    }
    
    public ExpenseType GetExpenseType(int aNrObject) {
        return pRepository.GetExpenseType(aNrObject);
    }
    
}
