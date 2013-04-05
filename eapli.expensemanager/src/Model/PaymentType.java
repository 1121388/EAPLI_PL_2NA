package Model; 

/**
 *
 * @author i080649
 */
public class PaymentType {
    
    private String alias;
    private int cod_sys;
    
    public PaymentType(String alias) 
    {
        this.alias = alias;
        this.cod_sys = 1337; //nao está a ser utilizado
    }
    public String getAlias() 
    {
        return alias;
    }
}
