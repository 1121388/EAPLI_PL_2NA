package Model;

/**
 *
 * @author i080649
 */
public class Card  extends PaymentType
{
    
    private int card_nr;
    
    public Card( String alias, int card_nr )
    {
        super(alias);
        this.card_nr = card_nr;
    }
    
}
