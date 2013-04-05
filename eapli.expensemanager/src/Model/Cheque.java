package Model;

/**
 *
 * @author i080649
 */
public class Cheque  extends PaymentType{
    
    private int cheque_nr;
    
    public Cheque( String alias, int cheque_nr )
    {
        super(alias);
        this.cheque_nr = cheque_nr;
    }
    
}
