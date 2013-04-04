/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model; 

/**
 *
 * @author Abilio
 */
public class PaymentType {
    
    private String description;
    
    public PaymentType(String description) {
        this.description = description;
    }
    public String GetDescription() {
        return description;
    }
}
