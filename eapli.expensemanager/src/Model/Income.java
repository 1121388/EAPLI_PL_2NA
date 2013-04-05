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
 * @author jfoliveira
 */
public class Income {
    
    String description;
   
    BigDecimal amount;
    
    IncomeType incomeType;
    
    Date dateOccurred;
    
    protected Income() {}
    
    public Income( String description, Date dateOccurred, BigDecimal amount, IncomeType incomeType) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.incomeType = incomeType; 
        this.dateOccurred = dateOccurred;
        
    }
    
    public Income( String description, int year, int month, int day, BigDecimal amount, IncomeType incomeType) {
        this( description, DateTime.newDate(year, month, day), amount, incomeType);
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
   
}
