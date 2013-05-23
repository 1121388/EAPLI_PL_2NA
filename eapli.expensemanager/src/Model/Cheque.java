package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author i080649
 */
@Entity
public class Cheque  extends PaymentType{
    
    //private int cheque_nr;
//    @GeneratedValue
//    private int idInterno;
    private String Bank_name;
    
    public Cheque(){}
    
    public Cheque( String alias,String Bank_name )
    {
        super(alias);
       // this.cheque_nr = cheque_nr;
        this.Bank_name=Bank_name;
    }
    
}
