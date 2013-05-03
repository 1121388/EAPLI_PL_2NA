/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class IncomeType implements Serializable{
    
    @Id
    String description;
    
    
    protected IncomeType() {}

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
