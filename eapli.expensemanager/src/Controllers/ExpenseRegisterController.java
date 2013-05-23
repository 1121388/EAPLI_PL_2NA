/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController extends BasicController{
    
    //ExpenseTypeRepository expenseTypeRepository = ExpenseTypeRepository.GetInstance();
     ExpenseTypeRepository expenseTypeRepository = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();

    PaymentTypeRepository paymentTypeRepository = PersistenceFactory.buildPersistenceFactory().paymentTypeRepository();
    
    public ExpenseRegisterController() {
    }
    
    public String ExpenseTypeList(){
        return expenseTypeRepository.ExpenseTypeList(false);
    }
    public ExpenseType GetExpenseType(int expenseType){
        return expenseTypeRepository.GetExpenseType(expenseType);
    }
    
    public String listPaymentTypeList(){
        return paymentTypeRepository.listPaymentTypeList();
    }
    public Cash GetPaymentType(int paymentType){
        return paymentTypeRepository.GetPaymentType(paymentType);
    }
    
    public MeansOfPayment meansOfPayment (Cash paymentType){
        return new MeansOfPayment(paymentType);
    }
    /*
    public MeansOfPayment meansOfPayment (PaymentType paymentType, int nCheck){
        return new MeansOfPayment(paymentType, nCheck);
    }
    */
    
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expenseType, MeansOfPayment meansOfPayment) {
        new ChekingAccount().registerExpense( what, date, amount, expenseType, meansOfPayment);
    }
    
}
