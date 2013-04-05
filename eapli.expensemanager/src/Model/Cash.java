package Model;

/**
 *
 * @author i080649
 */
public class Cash  extends PaymentType
{
    
    private String currency;
    
    public Cash( String alias, String currency )
    {
        super(alias);
        this.currency = currency;
    }
    
}
