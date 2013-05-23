package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author i080649
 */
@Entity
public class Card  extends PaymentType
{
//    @GeneratedValue
//    private int idInterno;
    private int card_nr;
    private String Bank_name;
    
    public Card(){}
    
    public Card( String alias, int card_nr, String Bank_name)
    {
        super(alias);
        this.card_nr = card_nr;
        this.Bank_name=Bank_name;
    }
    
}
