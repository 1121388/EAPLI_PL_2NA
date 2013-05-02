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

    //private ExpenseTypeRepository pRepository = ExpenseTypeRepository.GetInstance();
    private ExpenseTypeRepository pRepository = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();

    
    public ExpenseTypeController() {}
    
    public ExpenseType RegisterExpenseType(String aDescription) {
        //ToDo - necessário pedir mais um input
        ExpenseType pExpenseType = new ExpenseType(aDescription, aDescription);
        return pRepository.save(pExpenseType);
    }
    public String ExpenseTypeList(boolean aNumberedList) {
        return pRepository.ExpenseTypeList(aNumberedList);
    }
    
    public ExpenseType GetExpenseType(int aNrObject) {
        return pRepository.GetExpenseType(aNrObject);
    }
    
}
