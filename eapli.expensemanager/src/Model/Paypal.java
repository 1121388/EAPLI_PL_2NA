package Model;

/**
 *
 * @author i080649
 */
public class Paypal extends PaymentType
{
    
    private String user;
    
    public Paypal( String alias, String user )
    {
        super(alias);
        this.user = user;
    }
       
}
