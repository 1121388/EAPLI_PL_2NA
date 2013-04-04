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
public class ExpenseTypeController {

    private ExpenseTypeRepository pRepository = ExpenseTypeRepository.GetInstance();
    
    public ExpenseTypeController() {}
    
    public void RegisterExpenseType(String aDescription) {
        ExpenseType pExpenseType = new ExpenseType(aDescription);
        pRepository.SaveExpenseType(pExpenseType);
    }
    
    public String ExpenseTypeList() {
        return pRepository.ExpenseTypeList();
    }
    
}
