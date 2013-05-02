/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Raul.Lima
 */
@Entity
public class ExpenseType implements Serializable  {
    @Id
     String name;
     String longName;
     
     //Rocha - retirei pDescription 
    
    protected ExpenseType() {}
    
    public ExpenseType(String aName, String aLongName) {
        this.name = aName;
        this.longName = aLongName;
    }
    
    public String GetDescription() {
        return name;
    }
    
}
