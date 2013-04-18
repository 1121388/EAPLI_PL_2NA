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
 * @author MNLyle
 */
public class Movements {
    
    String description;
   
    private BigDecimal amount;
    
    private Date date;
    
    public Movements(String description, BigDecimal amount,Date date){
        if (description == null || date == null || amount == null) {
            throw new IllegalArgumentException();
        }
        
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.date=date;
        this.description=description;
        this.amount=amount;
        
        
    }

    public BigDecimal getMAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
    
    
}
