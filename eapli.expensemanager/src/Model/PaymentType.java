package Model; 

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author i080649
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class PaymentType implements Serializable{
    
    private String alias;
    @Id
    @GeneratedValue
    private int cod_sys;

    public PaymentType() {
    }
    
    public PaymentType(String alias) 
    {
        this.alias = alias;
        //this.cod_sys = 1337; //nao está a ser utilizado
    }
    public String getAlias() 
    {
        return alias;
    }
}
