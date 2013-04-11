package Model;

/**
 *
 * @author i080649
 */
public class Card  extends PaymentType
{
    
    private int card_nr;
    private String Bank_name;
    
    public Card( String alias, int card_nr, String Bank_name)
    {
        super(alias);
        this.card_nr = card_nr;
        this.Bank_name=Bank_name;
    }
    
}
