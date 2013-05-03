/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author Raul.Lima
 */
public interface ExpenseTypeRepository {
    
    public boolean SaveExpenseType(ExpenseType aExpenseType);
    public String ExpenseTypeList(boolean aNumberedList);
    public List<ExpenseType> ExpenseTypeObjectList();
    public ExpenseType GetExpenseType(int aNrObject);
    
}
