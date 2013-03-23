/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;



/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController {

    public ExpenseRegisterController() {
    }
    
    public String ExpenseTypeList(){
        ExpenseTypeRepository expenseTypeRepository = new ExpenseTypeRepository();
        return expenseTypeRepository.ExpenseTypeList();
    }
    
    public void registerExpense(String what, Date date, BigDecimal amount, String expenseType) {
        Expense expense = new Expense( what, date, amount,expenseType);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
}
