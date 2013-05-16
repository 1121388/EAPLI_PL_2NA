/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */
public interface RepositoryFactory {
    
 //    ExpenseRepository expenseRepository();

    ExpenseTypeRepository expenseTypeRepository(); 
    GeographicZoneRepository geographicZoneRepository(); 
    
    LimitRepository LimitRepository();
    IncomeTypeRepository incomeTypeRepository();
    IncomeRepository incomeRepository();
    PaymentTypeRepository paymentTypeRepository();
}
