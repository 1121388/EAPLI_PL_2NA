/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense extends Movements{
    
    ExpenseType expenseType;
        
    MeansOfPayment meansOfPayment;
        
    public Expense( String description, Date dateOccurred, BigDecimal amount, ExpenseType expenseType, MeansOfPayment meansOfPayment) {
        
        super(description, amount, dateOccurred);
        this.expenseType = expenseType; 
        this.meansOfPayment = meansOfPayment;
        
    }
    
    public Expense( String description, int year, int month, int day, BigDecimal amount, ExpenseType expenseType, MeansOfPayment meansOfPayment) {
        this( description, DateTime.newDate(year, month, day), amount, expenseType, meansOfPayment);
    }
    
    public BigDecimal getAmount() {
        return this.getMAmount();
    }
    
    public ExpenseType getExpenseType() {
        return expenseType;
    }
    
    public Date getDateOccurred(){
        return this.getDate();
    }
}
