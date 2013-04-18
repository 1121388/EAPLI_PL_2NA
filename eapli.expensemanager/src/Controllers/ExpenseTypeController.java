/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseTypeController extends BasicController {

    private ExpenseTypeRepository pRepository = ExpenseTypeRepository.GetInstance();
    
    public ExpenseTypeController() {}
    
    public boolean RegisterExpenseType(String aDescription) {
        ExpenseType pExpenseType = new ExpenseType(aDescription);
        return pRepository.SaveExpenseType(pExpenseType);
    }
    public String ExpenseTypeList(boolean aNumberedList) {
        return pRepository.ExpenseTypeList(aNumberedList);
    }
    
    public ExpenseType GetExpenseType(int aNrObject) {
        return pRepository.GetExpenseType(aNrObject);
    }
    
}
