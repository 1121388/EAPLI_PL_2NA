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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ExpenseTypeRepository expenseTypeRepository() {
        return new Persistence.JPA.ExpenseTypeRepositoryImpl();
    }

    @Override
    public Persistence.LimitRepository LimitRepository() {
        throw new UnsupportedOperationException("Not supported yet.");
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

}
