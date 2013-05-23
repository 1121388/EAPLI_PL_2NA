package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author i080649
 */
@Entity
public class Paypal extends PaymentType
{
//    @GeneratedValue
//    private int idInterno;
    private String user;
    
    public Paypal(){}
    
    public Paypal( String alias, String user )
    {
        super(alias);
        this.user = user;
    }
       
}
