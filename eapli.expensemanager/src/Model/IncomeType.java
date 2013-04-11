/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nuno
 */
public class IncomeType {
    
    private String description;
    

    public IncomeType(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    public String toString() {
        
         return "Income type: " + description ;
    }
    
    
    
    
    
}
