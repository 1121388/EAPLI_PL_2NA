/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */

class InMemoryRepositoryFactory implements RepositoryFactory {

//    @Override
//    public ExpenseRepository expenseRepository() {
//        return new eapli.expensemanager.persistence.inmemory.ExpenseRepositoryImpl();
//    }

    @Override
    public ExpenseRepository expenseRepository() {
        return new Persistence.InMemory.ExpenseRepositoryImpl();
    }
    
    @Override
    public ExpenseTypeRepository expenseTypeRepository() {
        return new Persistence.InMemory.ExpenseTypeRepositoryImpl();
    }

    @Override
    public Persistence.LimitRepository LimitRepository() {
        return new Persistence.InMemory.LimitRepositoryImpl();
    }

    @Override
    public IncomeTypeRepository incomeTypeRepository() {
        return new Persistence.InMemory.IncomeTypeRepositoryImpl();
    }

    @Override
    public IncomeRepository incomeRepository(){
        return new Persistence.InMemory.IncomeRepositoryImpl();
    }
    
    @Override
    public GeographicZoneRepository geographicZoneRepository(){
        return new Persistence.InMemory.GeographicZoneRepositoryImpl();
    }

    @Override
    public PaymentTypeRepository paymentTypeRepository() {
         return new Persistence.InMemory.PaymentTypeRepositoryImpl();
    }

    @Override
    public Persistence.LimitTypeRepository LimitTypeRepository() {
        return new Persistence.InMemory.LimitTypeRepositoryImpl();
    }

    @Override
    public ChekingAccountRepository chekingAccountRepository() {
        return new Persistence.InMemory.ChekingAccountRepositoryImpl();
    }

    
    
}
