
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author MNLyle
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Movements implements Serializable{
    
    @Id
    @GeneratedValue
    //private int id;
    String description;
    
    
   
    private BigDecimal amount;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;

    protected Movements() {
    }
    
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
    
     public String getMDescription(){
        return description;
    }
    
    
}
