/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jfoliveira
 */
public class IncomeRegisterController {
    
        
    IncomeRepository incomeRepository = IncomeRepository.GetInstance();
    IncomeTypeRepository incomeTypeRepository = IncomeTypeRepository.getInstance();
    //PaymentTypeRepository paymentTypeRepository = new PaymentTypeRepository();
    

    public List<String> IncomeTypeList(){
        return incomeTypeRepository.getIncomeTypesStrings();
        
    }
    /*
    public ExpenseType GetExpenseType(int expenseType){
        return expenseTypeRepository.GetExpenseType(expenseType);
    }
    
    public String listPaymentTypeList(){
        return paymentTypeRepository.listPaymentTypeList();
    }
    public PaymentType GetPaymentType(int paymentType){
        return paymentTypeRepository.GetPaymentType(paymentType);
    }
    
    public MeansOfPayment meansOfPayment (PaymentType paymentType){
        return new MeansOfPayment(paymentType);
    }
    public MeansOfPayment meansOfPayment (PaymentType paymentType, int nCheck){
        return new MeansOfPayment(paymentType, nCheck);
    }
            
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expenseType, MeansOfPayment meansOfPayment) {
        Expense expense = new Expense( what, date, amount, expenseType, meansOfPayment);
        expenseRepository.save(expense);
    }
    */
}
