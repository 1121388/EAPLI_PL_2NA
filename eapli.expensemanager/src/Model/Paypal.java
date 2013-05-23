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
    @Id
    @GeneratedValue
    private String user;
    
    public Paypal( String alias, String user )
    {
        super(alias);
        this.user = user;
    }
       
}
