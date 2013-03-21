/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseType {
        
    private String pDescription;
    
    public ExpenseType(String aDescription) {
        this.pDescription = aDescription;
    }
    
    public String GetDescription() {
        return pDescription;
    }
    
}
