/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author jfoliveira
 */
@Entity
public class Income extends Movements{
    @OneToOne
    IncomeType incomeType; 
    
    protected Income() {}
    
    public Income( String description, Date dateOccurred, BigDecimal amount, IncomeType incomeeType) {
      
        super(description, amount, dateOccurred);
        this.incomeType = incomeType; 
    }

   public Income( String description, int year, int month, int day, BigDecimal amount, IncomeType incomeType) {
        this( description, DateTime.newDate(year, month, day), amount, incomeType);
    }
    
    public BigDecimal getAmount() {
       return this.getMAmount();
    }
    
    public String GetDescription(){
        return this.getMDescription();
    }
}
