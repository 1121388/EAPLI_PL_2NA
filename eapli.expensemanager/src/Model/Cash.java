package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author i080649
 */
@Entity
public class Cash  extends PaymentType
{
//    @GeneratedValue
//    private int idInterno; 
    private String currency;
    
    public Cash(){}
    
    public Cash( String alias, String currency )
    {
        super(alias);
        this.currency = currency;
    }
    
}
