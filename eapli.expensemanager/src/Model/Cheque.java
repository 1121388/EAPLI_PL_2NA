package Model;

/**
 *
 * @author i080649
 */
public class Cheque  extends PaymentType{
    
    //private int cheque_nr;
    private String Bank_name;
    public Cheque( String alias,String Bank_name )
    {
        super(alias);
       // this.cheque_nr = cheque_nr;
        this.Bank_name=Bank_name;
    }
    
}
