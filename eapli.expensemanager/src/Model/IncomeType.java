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
    String shortid;
    String description;
    
    
    protected IncomeType() {}

    public IncomeType(String shortid, String description) {
        this.shortid = shortid;
        this.description = description;
    }

    public IncomeType(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public String getShortID(){
        return shortid;
    }
    
    public String toString() {        
         return "id: " + description + ", description:" + description ;
    }
    
}
