package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author pseeno
 */
public class Recepies {
    
    String description;
   
    BigDecimal amount;
    
    IncomeType incomeType;
    
    protected Recepies() {}
    
    public Recepies( String description, Date dateOccurred, BigDecimal amount, IncomeType incomeType) {
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
    }
    
    public Recepies( String description, int year, int month, int day, BigDecimal amount, IncomeType incomeType) {
        this( description, DateTime.newDate(year, month, day), amount, incomeType);
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
      
    
    
    //kjjnkjnknjknjmknjmkjkjknmkk
    
    
    
}
