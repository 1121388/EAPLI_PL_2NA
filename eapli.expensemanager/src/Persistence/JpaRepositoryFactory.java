/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
class JpaRepositoryFactory implements RepositoryFactory {

//    @Override
//    public ExpenseRepository expenseRepository() {
//        return new expensemanager.persistence.jpa.ExpenseRepositoryImpl();
//    }
    
    @Override
    public ExpenseRepository expenseRepository() {
        return new Persistence.JPA.ExpenseRepositoryImpl();
    }
    
    @Override
    public ExpenseTypeRepository expenseTypeRepository() {
        return new Persistence.JPA.ExpenseTypeRepositoryImpl();
    }

    @Override
    public Persistence.LimitRepository LimitRepository() {
        return new Persistence.JPA.LimitRepositoryImpl();
    }

    @Override
    public IncomeTypeRepository incomeTypeRepository() {
        return new Persistence.JPA.IncomeTypeRepositoryImpl();
    }

    @Override
    public GeographicZoneRepository geographicZoneRepository() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public IncomeRepository incomeRepository() {
        return new Persistence.JPA.IncomeRepositoryImpl();
    }

    @Override
    public PaymentTypeRepository paymentTypeRepository() {
       return new Persistence.JPA.PaymentTypeRepositoryImpl();
    }

    @Override
    public Persistence.LimitTypeRepository LimitTypeRepository() {
        return new Persistence.JPA.LimitTypeRepositoryImpl();
    }

    @Override
    public ChekingAccountRepository chekingAccountRepository() {
         return new Persistence.JPA.ChekingAccountRepositoryImpl();
    }

}
